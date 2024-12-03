package LowLevelDesign.Structural.Bridge;

public class CircleShape implements Shape {
    private Color color;


    @Override
    public void draw() {
        color.applyColor();
        System.out.println("Drawing Circle...");
    }
}
