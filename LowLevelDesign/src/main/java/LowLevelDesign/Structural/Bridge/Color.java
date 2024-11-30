package LowLevelDesign.Structural.Bridge;

public class Color {
    void applyColor() {
        
    }

    class RedColor extends Color {
        @Override
        public void applyColor() {
            System.out.println("Applying Red color");
        }
}
