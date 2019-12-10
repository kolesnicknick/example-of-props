import base.PropertyBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends PropertyBase {
    private Properties props;

    public FileProperties() {
        props = new Properties();
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/test.properties");
            props.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected String getProperty(String key) {
        return this.props.getProperty(key);
    }
}
