package by.overone.lesson12;

public class Store {

    private String name;
    private String address;

    public Store() {
    }

    public Store(String name) {
        this.name = name;
    }

    public Store(String name,String address){
        this.address=address;
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
