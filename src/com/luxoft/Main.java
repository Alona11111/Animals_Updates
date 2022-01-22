package com.luxoft;

public class Main {

    public static void main(String[] args) {
   Plane plane = new Plane(
           1, 87,8,"plane1", "engine1", "boing747");
        Plane plane2 = new Plane(
                1, 87,8,"plane1", "engine1", "boing747");


        System.out.println("First plane hash: " + plane.hashCode());
        System.out.println("Second plane1 hash: " + plane2.hashCode());
        System.out.println("Equals? : " + plane.equals(plane2));

    }
}
