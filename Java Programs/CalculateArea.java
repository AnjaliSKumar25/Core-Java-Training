public class CalculateArea {
    public static void main(String[] args) {
        // Calculate the area of a circle
        double circleRadius = 5.0;
        double circleArea = calculateArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a rectangle
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double rectangleArea = calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a square
        double squareSide = 7.0;
        double squareArea = calculateArea(squareSide);
        System.out.println("Area of the square: " + squareArea);
    }

    // Calculate the area of a circle
    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    // Calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }
}
