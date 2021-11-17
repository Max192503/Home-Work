package by.overone.lesson24work;

public enum Syper {

    IRONMAN("fly"),
    HALLK("hit"),
    TOR("lightning");

    private String power;

    Syper(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }
}
