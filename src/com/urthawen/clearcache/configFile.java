package com.urthawen.clearcache;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class configFile {

    private File configFileXML;

    public configFile(){
        try {
            configFileXML = File.createTempFile("config",".xml");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void createXMLFile(){
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try{
           documentBuilder = documentFactory.newDocumentBuilder();
        } catch (Exception e){
            e.printStackTrace();
        }

        Document document = documentBuilder.newDocument();


        Element root = document.createElement("app");
        document.appendChild(root);


    }

    public boolean isInstall(){
        return configFileXML.exists();
    }

    public File getConfigFileXML() {
        return configFileXML;
    }

    public void setConfigFileXML(File configFileXML) {
        this.configFileXML = configFileXML;
    }


}
