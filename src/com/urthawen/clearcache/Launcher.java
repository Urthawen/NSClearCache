package com.urthawen.clearcache;



import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher extends Application {
    private JButton search;
    private JPanel panelMain;
    private JTextField textField1;
    private JButton clearCacheButton;

    @Override
    public void start(Stage primaryStage){
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource("/clearcache_design"));
        }catch (Exception e){
            e.printStackTrace();
        }

        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

        System.out.println("ClearCache::        Launch...");

        configFile config = new configFile();

        if(config.isInstall()){
            System.out.println("ClearCache::      Config found !");
        }else{
            System.out.println("ClearCache::      Config not found");
            config.createXMLFile();
        }
    }
}
