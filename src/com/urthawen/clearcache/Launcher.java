package com.urthawen.clearcache;

import java.io.File;
import java.io.IOException;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("System::Launch");

        configFile config = new configFile();

        if(config.isInstall()){

        }else{
            config.createXMLFile();
        }
    }
}
