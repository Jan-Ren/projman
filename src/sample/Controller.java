package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    Button loginButton, logoutButton, accountingButton, salesOrdersButton, reportsButton, inventoryButton, mainMenuButton;
    @FXML
    TextField uField;
    @FXML
    PasswordField pField;

    String user ="admin";
    String password = "passw0rd";

    public void logInButtonPressed(ActionEvent event) throws IOException {
        if(uField.getCharacters().toString().equals(user) && pField.getCharacters().toString().equals(password)){
            Parent mainMenuPageParent = FXMLLoader.load(getClass().getResource("MainMenuPage.fxml"));
            Scene mainMenuPageScene = new Scene(mainMenuPageParent);

            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            window.setScene(mainMenuPageScene);
            window.centerOnScreen();
            window.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Username/Password");

            alert.showAndWait();
        }
    }

    @FXML
    public void closeButton(){
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }

    public void accountpageSwitch(ActionEvent event) throws IOException {
        Parent accountingPageParent = FXMLLoader.load(getClass().getResource("AccountingPage.fxml"));
        Scene accountingPageScene = new Scene(accountingPageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(accountingPageScene);
        window.show();
    }

    public void mainMenuSwitch(ActionEvent event) throws IOException {
        Parent mainMenuParent = FXMLLoader.load(getClass().getResource("MainMenuPage.fxml"));
        Scene mainMenuScene = new Scene(mainMenuParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(mainMenuScene);
        window.show();
    }
}
