/**
 * PhoneBookApp
 * Author: Anupranay Thouta
 * Date: December 9, 2024
 * Description: Conversion of Phone Book GUI from Swing to JavaFX.
 */

package exercises.phonebook.gui;

import exercises.phonebook.phonebook.Entry;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class EntryDialog {
   private final TextField nameField = new TextField();
   private final TextField phoneField = new TextField();
   private final Entry initialEntry;

   public EntryDialog() {
      this.initialEntry = null;
   }

   public EntryDialog(Entry entry) {
      this.initialEntry = entry;
      nameField.setText(entry.name());
      phoneField.setText(entry.phone());
   }

   public Entry showDialog() {
      Dialog<Entry> dialog = new Dialog<>();
      dialog.setTitle("Entry Dialog");

      VBox content = new VBox(10);
      content.getChildren().addAll(
        new Label("Name:"), nameField,
        new Label("Phone:"), phoneField
      );

      dialog.getDialogPane().setContent(content);
      dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

      dialog.setResultConverter(buttonType -> {
         if (buttonType == ButtonType.OK) {
            return new Entry(nameField.getText(), phoneField.getText());
         }
         return null;
      });
      return dialog.showAndWait().orElse(null);
   }
}
