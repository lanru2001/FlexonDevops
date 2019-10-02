
import java.util.*;
import Car;

public class flexonDevops
{
    public static void main(String[] args)
    {
        //System.out.println("abc");
        //Scanner sc = new Scanner(System.in);
        Car BMW = new Car("black", "AUtomatic", "Hatchbag", "Park", 0);
        BMW.move(5);
        System.out.println("Status of the car is: " + BMW.getCar_status());
        BMW.stop(0);
        BMW.reverse(-20);
        System.out.println("Design of the car is: " + BMW.getCar_design());
        System.out.println("Color of the car is: " + BMW.getCar_color());
        System.out.println("Type of the car is: " + BMW.getCar_type());
        System.out.println("Speed of the car is: " + BMW.getCar_speed());
        BMW.stop(0);

        /* Weight Conversion 
        double weight_pounds = sc.nextDouble(); 
        double weight_kilogram = weight_pounds * 0.45359237;
        System.out.println("The converted weight is: " + weight_kilogram);
        
        /* Trying Switch Case
        char fruit = Character.toUpperCase(sc.next().charAt(0));
               
        switch(fruit)
        {
            case 'A' : System.out.println("Fruit you are looking for is Apple"); break;
            case 'B' : System.out.println("Fruit you are looking for is Banana"); break;
            case 'C' : System.out.println("Fruit you are looking for is Cherries"); break;
            case 'D' : System.out.println("Fruit you are looking for is Dragon Fruit"); break;
            case 'E' : System.out.println("Fruit you are looking for is ElderBerry"); break;
            default  : System.out.println("Fruit you are looking for is Not in the fruit basket");
        }
        */
    }
}