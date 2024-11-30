package LowLevelDesign.Structural.Bridge;

public class CircleShape implements Shape {
    private Color color;

    public CircleShape(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.println("Drawing Circle");
    }
}
