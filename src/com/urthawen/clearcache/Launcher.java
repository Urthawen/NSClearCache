package com.urthawen.clearcache;

import java.io.File;
import java.io.IOException;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("ClearCache::        Launch...");

        configFile config = new configFile();

        if(config.isInstall()){
            System.out.print("ClearCache::      Config found !");
        }else{
            System.out.print("ClearCache::      Config not found");
            config.createXMLFile();
        }
    }
}
