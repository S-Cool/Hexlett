package io.kuleshov.IoC;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) {
        Node moduleConfigNode = null;
        try {
            Document document = DocumentBuilderFactory.newInstance().
                    newDocumentBuilder().parse(Module.class.getResourceAsStream("/application-config.xml"));
            moduleConfigNode = (Node) XPathFactory.newInstance().newXPath().evaluate("/module-config", document, XPathConstants.NODE);
        } catch (IOException ex) {
            // handle exception
        } catch (XPathExpressionException ex) {
            // handle exception
        } catch (ParserConfigurationException ex) {
            // handle exception
        } catch (SAXException ex) {
            // handle exception
        }
        if (moduleConfigNode != null) {
            new Module(moduleConfigNode);
        }
    }
}
