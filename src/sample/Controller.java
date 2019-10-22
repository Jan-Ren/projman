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
    Button quitButton, loginButton, logoutButton, accountingButton, salesOrdersButton, reportsButton, inventoryButton, mainMenuButton;
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
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

    public void loginPageSwitch(ActionEvent event) throws IOException {
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene loginPageScene = new Scene(loginPageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(loginPageScene);
        window.centerOnScreen();
        window.show();
    }

    public void accountPageSwitch(ActionEvent event) throws IOException {
        Parent accountingPageParent = FXMLLoader.load(getClass().getResource("AccountingPage.fxml"));
        Scene accountingPageScene = new Scene(accountingPageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(accountingPageScene);
        window.show();
    }

    public void InventoryPageSwitch(ActionEvent event) throws IOException{
        Parent inventoryPageParent = FXMLLoader.load(getClass().getResource("InventoryPage.fxml"));
        Scene inventoryPageScene = new Scene(inventoryPageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(inventoryPageScene);
        window.show();
    }

    public void mainMenuSwitch(ActionEvent event) throws IOException {
        Parent mainMenuParent = FXMLLoader.load(getClass().getResource("MainMenuPage.fxml"));
        Scene mainMenuScene = new Scene(mainMenuParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(mainMenuScene);
        window.show();
    }

    public void orderingPageSwitch(ActionEvent event) throws IOException {
        Parent orderingPageParent = FXMLLoader.load(getClass().getResource("OrderingPage.fxml"));
        Scene orderingPageScene = new Scene(orderingPageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(orderingPageScene);
        window.centerOnScreen();
        window.show();
    }
}
