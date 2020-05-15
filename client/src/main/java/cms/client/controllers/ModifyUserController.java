package cms.client.controllers;

import cms.client.controllers.AbstractController;
import cms.client.controllers.ModifyUserControllers.ModifyDispatcherStrategy;
import cms.client.controllers.ModifyUserControllers.ModifyDriverStrategy;
import cms.client.controllers.ModifyUserControllers.ModifyUserInterface;
import cms.client.controllers.entityhelpers.User;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ModifyUserController extends AbstractController {


    @FXML
    private JFXButton save;
    @FXML
    private JFXButton delete;
    @FXML
    private Label vehicleLabel;
    @FXML
    private Label licenceLabel;
    @FXML
    private JFXTextField license;
    @FXML
    private JFXTextField fname;
    @FXML
    private JFXTextField lname;
    @FXML
    private JFXTextField pass;
    @FXML
    private JFXComboBox vehicle;
    @FXML
    private JFXTextField username;

    private ModifyUserInterface userModifier;




    @FXML
    public void initialize() {
       User showingUser = stageManager.getSession().getViewingUser();
       if(showingUser.getUserVehicle().equals("Dispatcher")){
           userModifier = new ModifyDispatcherStrategy(this);
       }else {
           userModifier = new ModifyDriverStrategy(this);
       }
       userModifier.init(showingUser);

    }
    public void modify(ActionEvent event) {
        save.setDisable(false);
        save.setVisible(true);
        delete.setVisible(true);
        delete.setDisable(false);
        license.setDisable(false);
        fname.setDisable(false);
        lname.setDisable(false);
        pass.setDisable(false);
        vehicle.setDisable(false);
        username.setDisable(false);
    }


    public void delete(ActionEvent event) {
    }

    public void save(ActionEvent event) {
    }

    //-------------GETTERS-----------------------

    public JFXTextField getLicense() {
        return license;
    }

    public JFXTextField getFname() {
        return fname;
    }

    public JFXTextField getLname() {
        return lname;
    }

    public JFXTextField getPass() {
        return pass;
    }

    public JFXComboBox getVehicle() {
        return vehicle;
    }

    public JFXTextField getUsername() {
        return username;
    }

    public Label getVehicleLabel() {
        return vehicleLabel;
    }

    public Label getLicenceLabel() {
        return licenceLabel;
    }



}