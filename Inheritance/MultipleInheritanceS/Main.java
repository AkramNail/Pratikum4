package Inheritance.MultipleInheritanceS;

interface A {
        default void method1(){
            System.out.println("A bisa jalan");
        }
    }

    interface B {
        default void method1(){
            System.out.println("B bisa jalan");
        }
    }

public class Main implements A, B {

    public void method1(){
        A.super.method1();
    }

    public static void main(String[] args) {
        
        Main obj = new Main();
        obj.method1();
     
    }
    
}
