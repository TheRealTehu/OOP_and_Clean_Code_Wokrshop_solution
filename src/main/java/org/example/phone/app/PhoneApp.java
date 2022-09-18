package org.example.phone.app;

public class PhoneApp {
    private String name;
    private String manufacturer;
    private String version;

    public PhoneApp(String name, String manufacturer, String version) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return name + " " + version;
    }
}
