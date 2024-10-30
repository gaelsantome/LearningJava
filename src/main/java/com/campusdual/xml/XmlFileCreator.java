package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlFileCreator {
    private static void createDocument() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement("computer");
        document.appendChild(root);
        Element components = document.createElement("components");
        root.appendChild(components);

        components.appendChild(createItem(document, "component", "quantity", "1", "CPU"));
        components.appendChild(createItem(document, "component", "quantity", "2", "RAM"));
        components.appendChild(createItem(document, "component", "quantity", "3", "Fan"));
        components.appendChild(createItem(document, "component", "quantity", "1", "GPU"));
        components.appendChild(createItem(document, "component", "quantity", "1", "Motherboard"));
        components.appendChild(createItem(document, "component", "quantity", "2", "SSD"));
        components.appendChild(createItem(document, "component", "quantity", "1", "Power supply"));
        components.appendChild(createItem(document, "component", "quantity", "2", "Computer case"));
        writetoFile(document, "src/main/resources/computerList.xml");

    }

    private static void writetoFile(Document document, String pathFIle) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        File file = new File(pathFIle);
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    private static Element createItem(Document document, String tagName, String attribute, String attrValue, String textComponent){
        Element component= document.createElement(tagName);
        component.setAttribute(attribute, attrValue);
        component.setTextContent(textComponent);
        return component;
    }

    public static void main(String[] args) {
        try {
            XmlFileCreator.createDocument();
        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }


}
