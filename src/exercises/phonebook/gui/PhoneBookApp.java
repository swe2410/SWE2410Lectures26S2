/**
 * PhoneBookApp
 * Author: Anupranay Thouta
 * Date: December 9, 2024
 * Description: Conversion of Phone Book GUI from Swing to JavaFX.
 */

package exercises.phonebook.gui;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.policy.Handler;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * The main window for the phone book application.
 */
public class PhoneBookApp extends Application {

  private final Handler bookHandler = new Handler();
  private final ObservableList<Entry> entries = FXCollections.observableArrayList();
  private final ListView<Entry> listView = new ListView<>(entries);

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Phone Book");

    BorderPane root = new BorderPane();
    VBox menuBox = setupMenus();
    root.setTop(menuBox);
    root.setCenter(listView);

    populateList();

    listView.setOnMouseClicked(event -> {
      if (event.getClickCount() == 2) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
          editItem(index);
        }
      }
    });

    listView.setOnKeyPressed(event -> {
      if (event.getCode() == KeyCode.DELETE) {
        deleteItem();
      } else if (event.getCode() == KeyCode.ENTER) {
        editItem();
      } else if (event.getCode() == KeyCode.N && event.isControlDown()) {
        addItem();
      } else if (event.getCode() == KeyCode.Z && event.isControlDown()) {
        undoOperation();
      } else if (event.getCode() == KeyCode.Y && event.isControlDown()) {
        redoOperation();
      }
    });

    primaryStage.setScene(new Scene(root, 400, 300));
    primaryStage.show();
  }

  private VBox setupMenus() {
    MenuBar menuBar = new MenuBar();

    Menu editMenu = new Menu("Edit");
    MenuItem addItem = new MenuItem("Add Item (Ctrl-N)");
    MenuItem editItem = new MenuItem("Edit Item (Enter)");
    MenuItem deleteItem = new MenuItem("Delete Item (Del)");
    MenuItem undoItem = new MenuItem("Undo (Ctrl-Z)");
    MenuItem redoItem = new MenuItem("Redo (Ctrl-Y)");

    addItem.setOnAction(e -> addItem());
    editItem.setOnAction(e -> editItem());
    deleteItem.setOnAction(e -> deleteItem());
    undoItem.setOnAction(e -> undoOperation());
    redoItem.setOnAction(e -> redoOperation());

    editMenu.getItems().addAll(addItem, editItem, deleteItem, undoItem, redoItem);
    menuBar.getMenus().add(editMenu);

    VBox menuBox = new VBox(menuBar);
    return menuBox;
  }

  private void populateList() {
    bookHandler.addEntry("Babbage, Charles", "123-4567");
    bookHandler.addEntry("Liskov, Barbara", "123-7654");
    bookHandler.addEntry("Turing, Alan", "123-6382");
    bookHandler.addEntry("Kilby, Jack", "123-9876");
    bookHandler.addEntry("Hopper, Grace", "123-8765");
    refreshList();
  }

  private void addItem() {
    EntryDialog dialog = new EntryDialog();
    Entry newEntry = dialog.showDialog();
    if (newEntry != null) {
      bookHandler.addEntry(newEntry.name(), newEntry.phone());
      refreshList();
    }
  }

  private void editItem() {
    int index = listView.getSelectionModel().getSelectedIndex();
    if (index >= 0) {
      editItem(index);
    }
  }

  private void editItem(int index) {
    Entry entry = entries.get(index);
    EntryDialog dialog = new EntryDialog(entry);
    Entry updatedEntry = dialog.showDialog();
    if (updatedEntry != null) {
      bookHandler.removeEntry(entry.name());
      bookHandler.addEntry(updatedEntry.name(), updatedEntry.phone());
      refreshList();
    }
  }

  private void deleteItem() {
    int index = listView.getSelectionModel().getSelectedIndex();
    if (index >= 0) {
      Entry entry = entries.get(index);
      bookHandler.removeEntry(entry.name());
      refreshList();
    }
  }

  private void undoOperation() {
    bookHandler.undo();
    refreshList();
  }

  private void redoOperation() {
    bookHandler.redo();
    refreshList();
  }

  private void refreshList() {
    entries.clear();
    for (Entry entry : bookHandler.getPhoneBook()) {
      entries.add(entry);
    }
  }

}
