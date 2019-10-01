
import java.util.Scanner;

public class AreaToRadius
{
    public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Area To Radius");
    System.out.println("---------------------------------");
    System.out.println("");
    System.out.println("Area: ");
    double area = sc.nextDouble();
    double radius = Math.sqrt(area/Math.PI );
    System.out.println("Radius: " + radius);
    
}
}

