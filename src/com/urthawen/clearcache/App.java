package com.urthawen.clearcache;

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
        System.out.println("ClearCache::        Launch...");

        configFile config = new configFile();
        JFrame frame = new JFrame("NSClearCache");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        if(config.isInstall()){
            System.out.println("ClearCache::      Config found !");
        }else{
            System.out.println("ClearCache::      Config not found");
            config.createXMLFile();
        }
    }
}
