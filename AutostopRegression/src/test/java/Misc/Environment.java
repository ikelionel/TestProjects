package Misc;

import java.util.ResourceBundle;

public class Environment {

    public String propertyFile;
    public String environment;
    public ResourceBundle resourcebundle;

    public Environment( String propfile, String env )
    {
        this.propertyFile = propfile;
        this.environment = env;
        this.resourcebundle = ResourceBundle.getBundle(propfile);
    }

    public void setPropertyFile(String newFile) {
        this.propertyFile = newFile;
    }

    public void setEnvironment(String newValue) {
        this.environment = newValue;
    }

    public String getPropertyFile() {
        return this.propertyFile;
    }

    public String getEnvironment() {
        return this.resourcebundle.getString(this.environment);
    }

    public String getUsername(String username) {
        return this.resourcebundle.getString(username);
    }

    public String getPassword(String password) {
        return this.resourcebundle.getString(password);
    }
}
