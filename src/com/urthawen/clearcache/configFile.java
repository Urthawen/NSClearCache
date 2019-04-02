package com.urthawen.clearcache;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class configFile {

    private File configFileXML;
    private final String author = "Urthawen";

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

        //XML Data
        Element root = document.createElement("app");
        document.appendChild(root);

        Element path = document.createElement("path");
        path.appendChild(document.createTextNode("none"));
        root.appendChild(path);

        Element author = document.createElement("author");
        author.appendChild(document.createTextNode(this.author));
        root.appendChild(author);


        //Create XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try{
            transformer = transformerFactory.newTransformer();
        } catch (Exception e){
            e.printStackTrace();
        }

        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("./config.xml"));

        try{
            transformer.transform(domSource,streamResult);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("ClearCache::configFile      Config created !");
    }

    public boolean isInstall(){
        File f = new File("./config.xml");
        return f.exists();
    }

    public File getConfigFileXML() {
        return configFileXML;
    }

    public void setConfigFileXML(File configFileXML) {
        this.configFileXML = configFileXML;
    }


}
