package Lambda;

interface Shape {
    double area();
}

public class functionalinterface {
    public static void main(String[] args) {
        Shape rectangle = () -> 13.0 * 9.0;
        Shape square = () -> 5.0 * 5.0;
        Shape circle = () -> Math.PI * 4.0 * 4.0;
        Shape cube = () -> 9.0 * 9.0 * 9.0;
        Shape sphere = () -> 4.0 / 3.0 * Math.PI * 9.0 * 9.0 * 9.0;
        Shape cylinder = () -> Math.PI * 3.0 * 3.0 * 8.0;

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Volume of Cube: " + cube.area());
        System.out.println("Volume of Sphere: " + sphere.area());
        System.out.println("Volume of Cylinder: " + cylinder.area());
    }
}
