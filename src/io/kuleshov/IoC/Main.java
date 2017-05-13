package io.kuleshov.IoC;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Module("module-config.xml");
        } catch (IOException ex) {
            // handle exception
        } catch (ParserConfigurationException ex) {
            // handle exception
        } catch (org.xml.sax.SAXException e) {
            // handle exception
        }
    }
}
