package io.kuleshov.IoC;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Module {

    public static final String DEFAULT_CONFIG = "config.xml";

    public Module() throws IOException, ParserConfigurationException, SAXException {
        this(DEFAULT_CONFIG);
    }

    public Module(String name) throws IOException, ParserConfigurationException, SAXException {
        this(new FileInputStream(name));
    }

    public Module(InputStream is) throws IOException, ParserConfigurationException, SAXException {
        this(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is));
    }

    public Module(Node configNode) {
        Configuration configuration = new Configuration();
        // working with configNode to get configuration

        init(configuration);
    }

    private void init(Configuration configuration) {
        // initialization code
    }

    private static class Configuration {
        // ... some fields
    }
}