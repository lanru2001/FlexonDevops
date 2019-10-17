package com.example.demo;

public class Car
{
    int speed;
    String car_color;
    String car_type;
    String car_design;
    String car_status = "Park";
    
    public Car(String car_color, String car_type, String car_design, String car_status, int speed) 
    {
        this.car_color = car_color;
        this.car_type = car_type;
        this.car_design = car_design;
        this.car_status = car_status;
        this.speed = speed;
    }
    private  void setCar_status(String car_status){
        this.car_status = car_status;
    }
    private void set_speed(int x){
        speed = x;
    }
    public void move(int x)
    {
        if(x < 1)
        {
            System.out.println("ERRORRR!!!!!");
            System.exit(0);
        }
        System.out.println("Car is moving");
        setCar_status("Drive");
        set_speed(x);
    }
    public void reverse(int x)
    {
        if(x > 0)
        {
            System.out.println("ERRORRR!!!!!");
            System.exit(0);
        }
        System.out.println("Car is moving backwards");
        setCar_status("Reverse");
        set_speed(x);
    }
    public void stop(int x)
    {
        if(x != 0 )
        {
            System.out.println("ERRORRR!!!!!");
            System.exit(0);
        }
        System.out.println("Car has stopped");
        setCar_status("Park");
        set_speed(0);
    } 
    public String getCar_status(){
        return car_status;
    }
    public String getCar_color(){
        return car_color;
    }
    public String getCar_design(){
        return car_design;
    }
    public String getCar_type(){
        return car_type;
    }
    public int getCar_speed(){
        return speed;
    }
}