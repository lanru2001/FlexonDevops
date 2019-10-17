package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi")
public class carcontroller
{
    @Autowired
    public flexonDevops a;

    @GetMapping("/getall")
    public ArrayList<Car> display()
    {
        return a.displaycars();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car newCar)
    {
        System.out.println("give the details: ");
        a.addCar(newCar);
    } 

}