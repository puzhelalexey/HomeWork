package Wb2T10T11;

/*Write a program that will parse the xml file, made in previous jobs, using DOM and display it in text form.
 Each point should be displayed on a separate line in the form of two numbers, separated by a comma,
 while a unit of measure should be output. For example: 10px, 30px.
 */

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task11 {

    public static void main(String[] args) throws FileNotFoundException {
        String unit = null;
        String x = null;
        String y = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();

        try {
            XMLEventReader reader;
            reader = factory.createXMLEventReader(new FileInputStream("D:\\work\\pvt\\src\\Wb2T10T11\\File.xml"));
            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    if ("point".equals(startElement.getName().getLocalPart())) {
                        unit = startElement.getAttributeByName(QName.valueOf("unit")).getValue();
                    } else if ("x".equals(startElement.getName().getLocalPart())) {
                        event = reader.nextEvent();
                        x = event.asCharacters().getData();
                    } else if ("y".equals(startElement.getName().getLocalPart())) {
                        event = reader.nextEvent();
                        y = event.asCharacters().getData();
                    }
                }
                if (event.isEndElement() && event.asEndElement().getName().getLocalPart() == "point") {
                    System.out.println(x + unit + ", " + y + unit);
                }
            }

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}