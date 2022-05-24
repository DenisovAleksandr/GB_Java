package ru.gb.Denisov.level_1.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Person s1 = new Person("Denisov Denis","Ingineer","DenisovDenis@@mailbox.com","8(954)266-11-98",4500,30);


        Person[] arr = new Person[5];
        arr[0] = new Person("Ivanov Ivan", "Ingineer", "IvanovIvan@mailbox.com","8(954)456-12-22" ,2000, 30);
        arr[1] = new Person("Petrov Petr", "Booker","PetrovPetr@mailbox.com","8(954)568-22-22" ,2300, 56);
        arr[2] = new Person("Sidorov Igor", "Ingineer", "SidorovIgor@mailbox.com","8(952)-364-56-22" ,2000, 23);
        arr[3] = new Person("Filippov Filipp", "Head of Department","FilippovFilipp@mailbox.com","8(956)965-78-19" ,6500, 45);
        arr[4] = new Person("Denisov Denis", "Assistant Engineer","DenisovDenis@mailbox.com","8(954)266-11-98" ,1500, 19);

        System.out.println("Все сотрудники:");
        for (int i =0; i< arr.length;i++){
            arr[i].printInfo();
        }
        System.out.println();
        System.out.println("Сотрудники старше 40 лет:");
        for (int i =0; i< arr.length;i++){
            if(arr[i].getAge()>40){
                arr[i].printInfo();
            }
        }
    }
}
