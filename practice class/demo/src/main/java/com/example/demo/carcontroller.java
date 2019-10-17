package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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

    @DeleteMapping("/delete/{color}")//, method = RequestMethod.GET)
    public void delete(@PathVariable String color)
    {
        if(a.deleteCar(color))
        System.out.println("Deleted!!");
        else System.out.println("Not Found");
    }

    @PutMapping("/update/put/{color}")
    public void update_put(@PathVariable String color, @RequestBody Car updatedCar)
    {
        if(a.deleteCar(color))
        a.addCar(updatedCar);
        else System.out.println("Not found. Can't be replaced");
    }

    @PatchMapping("/update/patch/{color}")
    public void update_patch(@PathVariable String color, @RequestBody Car updatedCar)
    {
        int i = a.findColor(color);
        if(i>0)
        a.updateCar(updatedCar, i);
        else System.out.println("Not found!!! Can't be updated");

    }

}