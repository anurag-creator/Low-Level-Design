package LowLevelDesign.Creational.AbstarctFactory;

public class MacOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
