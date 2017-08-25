package Wb2T10T11;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/*Write a program that will parse the xml file, made in previous jobs, using DOM and display it in text form.
 Each point should be displayed on a separate line in the form of two numbers, separated by a comma,
 while a unit of measure should be output. For example: 10px, 30px.
 */

public class Task10 {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File("D:\\work\\pvt\\src\\Wb2tasks7,8,9\\Task7.xml");
        try {
            doc = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element root = doc.getDocumentElement();
        NodeList nList = root.getChildNodes();
        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i) instanceof Element) {
                Element element = (Element) nList.item(i);
                String attribute = element.getAttribute("unit");
                String x = element.getElementsByTagName("x").item(0).getTextContent();
                String y = element.getElementsByTagName("y").item(0).getTextContent();
                System.out.println(x + attribute + ", " + y + attribute);
            }
        }
    }
}
