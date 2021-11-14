package by.overone.lesson18;

public class  Pair<K, V> {
    private K num;
    private V id;

    public Pair(K num, V id) {
        this.num = num;
        this.id = id;
    }

    public K getNum() {
        return num;
    }

    public void setNum(K num) {
        this.num = num;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "num=" + num +
                ", id=" + id +
                '}';
    }
}
