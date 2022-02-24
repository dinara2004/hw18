package com.company;

public class Main {

    public static void main(String[] args) {
//	±Класс Cow (weight, age, gender, nickName)
//±Класс Sheep(weight, age, gender, nickName)
//±Класс Horse(weight, age, color, gender, nickName)
//±Класс Farm(address, cows, horses, sheep, OwnerName)
//±2 Farm тузунуз.
//±1-Farm да 3 sheep, 5 cows, 2 horses болсун.
//±2-Farm да 1 sheep, 1 cow, 1 horse болсун.
//
//        Текст.ответ
        DomesticAnimal sheep1 = new Sheep("koi", 2, 8.9, "M");
        DomesticAnimal sheep2 = new Sheep("koii", 3, 7.9, "M");
        DomesticAnimal sheep3 = new Sheep("ulak", 4, 6.9, "M");
        DomesticAnimal sheep4 = new Sheep("kochkor", 5, 5.9, "M");

        DomesticAnimal horse1 = new Horse("Dodo", 3, 6.7, "M", "Black");
        DomesticAnimal horse2 = new Horse("Dodoo", 2, 7.7, "M", "White");
        DomesticAnimal horse3 = new Horse("Dodoo", 1, 8.7, "M", "Brown");

        DomesticAnimal cow1 = new Cow("Mumu",4,34.0, "M" );
        DomesticAnimal cow2 = new Cow("Muzoo",4,24.0, "M" );
        DomesticAnimal cow3 = new Cow("Ui",4,14.0, "M" );
        DomesticAnimal cow4 = new Cow("Torpok",4,4.0, "M" );
        DomesticAnimal cow5 = new Cow("Mumuu",4,33.0, "M" );
        DomesticAnimal cow6 = new Cow("Mumuuu",4,35.0, "M" );

        DomesticAnimal[] domesticAnimals = {sheep1, sheep2, sheep3, cow1, cow2, cow3, cow4, cow5, horse1, horse2};
        DomesticAnimal[] domesticAnimals1 = {sheep4, cow6, horse3};

        Sheep[] sheepsF1 = new Sheep [3];
        Sheep[] sheepsF2 = new Sheep[1];

        Cow[] cowsF1 = new Cow[5];
        Cow[] cowsF2 = new Cow[1];

        Horse[] horsesF1 = new Horse[2];
        Horse[] horsesF2 = new Horse[1];

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (DomesticAnimal animal:domesticAnimals) {
            if (animal instanceof Sheep){
                sheepsF1[a] = (Sheep) animal;
                a++;
            }
            if (animal instanceof Cow){
                    cowsF1[b] = (Cow) animal;
                    b++;
            }
            if (animal instanceof Horse){
                        horsesF1[c] = (Horse) animal;
                        c++;
            }
        }
        for (DomesticAnimal an:domesticAnimals1) {
            if (an instanceof Sheep) {
                sheepsF2[d] = (Sheep) an;
                d++;
            }
            if (an instanceof Cow) {
                    cowsF2[e] = (Cow) an;
                    e++;
            }
            if (an instanceof Horse){
                        horsesF2[f] = (Horse) an;
                        f++;
            }
        }


      Farm farm1 = new Farm("Modubaev 8", "Dinara", sheepsF1, horsesF1, cowsF1);
        Farm farm2 = new Farm("Abdrahmanova 99/1", "Aisana", sheepsF2, horsesF2, cowsF2);

        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);









    }
}
