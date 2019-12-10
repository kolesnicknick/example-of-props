package base;

import java.util.Optional;

public abstract class PropertyBase {

    public String getSafeVar(String envVar, String defValue) {
        return Optional.ofNullable(getProperty(envVar)).orElse(defValue);
    }

    protected abstract String getProperty(String key);
}
