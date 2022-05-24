package ru.gb.Denisov.level_1.HomeWork7;

public class main {
    public static void main(String[] args) {
        Cat cats[] = new Cat[5];
        cats[0]  = new Cat("Barsik1",52);
        cats[1]  = new Cat("Barsik2",58);
        cats[2] = new Cat("Barsik3",20);
        cats[3] = new Cat("Barsik4",6);
        cats[4] = new Cat("Barsik5",3);

        Plate plate = new Plate(100);


        System.out.printf("There are %d food in the plate\n",plate.info());
        for (Cat cat:cats) {
            cat.eat(plate);
        }
        for (Cat cat:cats) {
            System.out.println(cat.getName()+"'s satiety is "+ cat.getSatiety());
        }
        plate.setFood(13);
    }
}
