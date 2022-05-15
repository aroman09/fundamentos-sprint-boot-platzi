package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyDependencyImplement implements MyDependency {
    @Override
    public void mensaje() {
        System.out.println("Prueba de implementacion de dependencias");
    }
}
