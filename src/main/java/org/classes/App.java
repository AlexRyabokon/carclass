package org.classes;


public class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat(1, "Giga");
        cat1.setName("Igor");
        cat1.setAge(12);

       Car car1 = new Car();

       Reader reader = new Reader("Petrov", "Ivan", "Ivanovich", 17121996, 122, "Economy", 380565);
        reader.takeBook(1);
        System.out.println();
    }
}
