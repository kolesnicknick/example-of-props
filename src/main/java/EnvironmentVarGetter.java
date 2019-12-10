import base.PropertyBase;

public class EnvironmentVarGetter extends PropertyBase {

    public String getRunOn(){return getSafeVar("runOn", "local");}

    @Override
    protected String getProperty(String key) {
        return System.getenv(key);
    }
}
