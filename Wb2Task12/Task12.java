package Wb2Task12;

/*Write a program that converts the xml file created in previous jobs into html, similar to this example,
 in each cell, in addition to the coordinate, units of measurement must be displayed.
 The result should be written to a file on disk.
 */

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task12 {

    public static void main(String[] args) {
        StreamSource streamSource = new StreamSource(new File("D:\\work\\pvt\\src\\Wb2Task12\\File.xsl"));

        try (FileInputStream fis = new FileInputStream(new File("D:\\work\\pvt\\src\\Wb2Task12\\File.xml"));
             FileOutputStream fos = new FileOutputStream(new File("D:\\work\\pvt\\src\\Wb2Task12\\File.html"))) {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(streamSource);

            try {
                transformer.transform(new StreamSource(fis), new StreamResult(fos));
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
