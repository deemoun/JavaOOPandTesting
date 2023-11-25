package org.deemoun;

public class Main
{

    public static void main (String[]args)
    {
        Cat cat = new Cat ();

        cat.setAge (5);
        cat.setName ("Alisa");

        System.out.println (cat.getName ());
        System.out.println (cat.getAge ());
    }

}