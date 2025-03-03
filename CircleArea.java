import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        
        // Display the result
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }
}
