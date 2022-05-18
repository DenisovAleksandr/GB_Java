package ru.gb.Denisov.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik", "White", 1995);
        Cat c2 = new Cat("Pushok", "White", 1995);
        Dog d1 = new Dog("Polkan", "White", 1995);
        Dog d2 =new Dog("Zefirka","Brown", 1898);
        Animal animal[]={c1,c2,d1,d2};
        for (int i=0;i<animal.length;i++){
            System.out.println(animal[i].name+" can run "+ animal[i].maxRun +"m");
            if (animal[i].maxSwim>0) {
                System.out.println(animal[i].name + " can swim " + animal[i].maxSwim + "m");
            }else System.out.println(animal[i].name +" cant swim");
            System.out.println();
        }
        c2.run(2000);
        d2.swim(500);
        System.out.println();
        System.out.println(c1.name + " have id = "+c1.getID());
        System.out.println(c2.name + " have id = "+c2.getID());
        System.out.println("Total animals "+animal.length);


    }
}
