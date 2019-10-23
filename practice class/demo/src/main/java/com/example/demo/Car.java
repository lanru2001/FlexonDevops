package com.example.demo;

import javax.persistence.*;

@Entity
public class Car
{
    int speed;
    String car_type;
    String car_design;
    String car_status = "Park";
    String car_color;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int car_num;
    
    public Car()
    {

    }
    
    public Car(String car_color, String car_type, String car_design, String car_status, int speed) 
    {
        this.car_color = car_color;
        this.car_type = car_type;
        this.car_design = car_design;
        this.car_status = car_status;
        this.speed = speed;
    }
    private void setCar_status(String car_status){
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
    @Column
    public String getCar_status(){
        return car_status;
    }
    @Column
    public String getCar_color(){
        return car_color;
    }
    @Column
    public String getCar_design(){
        return car_design;
    }
    @Column
    public String getCar_type(){
        return car_type;
    }
    @Column
    public int getCar_speed(){
        return speed;
    }


    public void setCar_color(String car_color){
        this.car_color = car_color;
    }
    public void setCar_design(String car_design){
        this.car_design = car_design;
    }
    public void setCar_type(String car_type){
        this.car_type = car_type;
    }
    public void setCar_speed(int speed){
        this.speed = speed;
    }
}