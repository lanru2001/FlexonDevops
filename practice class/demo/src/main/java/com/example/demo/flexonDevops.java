package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


@Component
public class flexonDevops
{
        //Scanner sc = new Scanner(System.in);
        ArrayList<Car> devops = new ArrayList<>();
        Car dev[] = new Car[20];

        public flexonDevops()
        {
            devops.add(new Car("black", "Automatic", "Hatchbag", "Park", 0));
        }

        public ArrayList<Car> displaycars()
        {
            return devops;
        }

        public void addCar(Car newC)
        {
            devops.add(newC);
            //return newC;
        }
        public boolean deleteCar(String color)
        {
            for(int i = 0; i < devops.size() ; i++)
            {
                if(color.equals(devops.get(i).getCar_color()))
                    {
                        devops.remove(devops.get(i));
                        return true;
                    } 
            }
            return false;
            //return newC;
        }
        public int findColor(String color)
        {
            for(int i = 0; i < devops.size() ; i++)
                if(color.equals(devops.get(i).getCar_color()))
                        return i;
            return -1;
        }
        public void updateCar(Car n, int i)
        {
            devops.get(i).car_color = n.car_color;
            devops.get(i).car_design = n.car_design;
            devops.get(i).car_status = n.car_status;
            devops.get(i).car_type = n.car_type;
            devops.get(i).speed = n.speed;

        }


      
        /*
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

        /*       
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
