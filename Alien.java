package org.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;
    @Autowired
   // private Laptop lap;
    private Computer comp;
    public Alien(){
        age = 69;
        System.out.println("Object created!");
    }
//    @ConstructorProperties({"age","comp"})
//    public Alien(int age,Computer comp){
//        System.out.println("Para constructor is called!");
//        this.age = age;
//        this.comp = comp;
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
