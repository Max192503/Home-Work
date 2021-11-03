package by.overone.lesson12;

public class Store1 {
    public static void main(String[] args) {

        Store store=new Store();

        store.setAddress("Minsk");
        store.setName("Maks");

        System.out.println(store.getAddress()+" "+store.getName());

        Store store1=new Store();

        store.setName("Vasya");

        System.out.println(store.getName());


    }
}
