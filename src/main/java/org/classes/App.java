package org.classes;


public class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat(1, "Giga");
        cat1.setName("Igor");
        cat1.setAge(12);

       Car car1 = new Car();


        System.out.println(car1.carGetInfo());
    }
}
