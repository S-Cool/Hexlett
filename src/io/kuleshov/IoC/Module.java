package io.kuleshov.IoC;
import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Module {

    public static final String DEFAULT_CONFIG = "config.xml";

    public Module() throws IOException, ParserConfigurationException, SAXException {
        this(DEFAULT_CONFIG);
    }

    public Module(String name) throws IOException, ParserConfigurationException, SAXException {
        Document document = DocumentBuilderFactory.newInstance().
                newDocumentBuilder().parse(new FileInputStream(name));
        Configuration configuration = new Configuration();
        // working with document to get configuration
        init(configuration);
    }

    private void init(Configuration configuration) {
        // initialization code
    }

    private static class Configuration {
        // ... some fields
    }
}

