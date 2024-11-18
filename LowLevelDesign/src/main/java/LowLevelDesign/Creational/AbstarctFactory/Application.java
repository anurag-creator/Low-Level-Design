package LowLevelDesign.Creational.AbstarctFactory;

public class Application {
    private final Button button;
    public Application(UIFactory factory) {
        button = factory.createButton();
    }
    public void renderUI() {
        button.render();
    }
}
