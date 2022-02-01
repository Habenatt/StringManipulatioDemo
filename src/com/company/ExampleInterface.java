package com.company;

//@FunctionalInterface
public interface ExampleInterface <T>{

    T compare(T One, T Two);
    public void print();
    default void show(){
        System.out.println("default");
    }

}
