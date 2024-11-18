package LowLevelDesign.Creational.AbstarctFactory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
