package LowLevelDesign.Creational.AbstarctFactory;

public class Demo {
    public static void main(String[] args) {
        // Change this to switch between platforms
        String os = "MacOS"; // Options: "Windows", "MacOS"

        UIFactory factory;
        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsUIFactory();
        } else if (os.equalsIgnoreCase("MacOS")) {
            factory = new MacOSUIFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + os);
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
