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

public class App {
    private JButton search;
    private JPanel panelMain;
    private JTextField textField1;
    private JButton clearCacheButton;


    public App() {
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Config update");
            }
        });
    }

    public static void main(String[] args) {

    }
}
