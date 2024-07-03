package com.practice.programming.personal.general;

public class InheritanceConceptCheck1 {
    public static void main(String[] args){
        Child childObj = new Child();
    }
}

class Parent {
    public Parent(String msg) {
        System.out.println("Message from parent constructor: " + msg);
    }
}

class Child extends Parent {
    public Child() {
        this("New Child");
        System.out.println("Message from default child constructor");
    }

    public Child(String msg) {
        super("New Parent");
        System.out.println("Message from parameterized child constructor: " + msg);
    }
}
