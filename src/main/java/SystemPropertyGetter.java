import base.PropertyBase;

public class SystemPropertyGetter extends PropertyBase {

    @Override
    protected String getProperty(String key) {
        return System.getProperty(key);
    }
}
