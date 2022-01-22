package com.animals;

public class Main {

    public static void main(String[] args) {
        KoalaAnimal koalaAnimal = new KoalaAnimal("koala", "45", "110");
        CatAnimal catAnimal = new CatAnimal("Murzik", "45", "70");
        HorseAnimal horseAnimal= new HorseAnimal("Przhevalskiy", "700", "200");
        System.out.println(koalaAnimal.toString());
        System.out.println("First animal hash: " + koalaAnimal.hashCode());
        System.out.println("Second animal hash: " + catAnimal.hashCode());
        System.out.println("Third animal hash: " + horseAnimal.hashCode());
        System.out.println("Koala equals to Cat? : " + (koalaAnimal.equals(catAnimal)));
        System.out.println("Cat equals to Horse? : " + catAnimal.equals(horseAnimal));
        System.out.println("Horse equals to Koala? : " + horseAnimal.equals(koalaAnimal));
    }
}
