package by.overone.lesson18;

final class PairUtil {

    public static <T> void swap(Pair<T, T> pair) {
        T temp = pair.getId();
        pair.setId(pair.getNum());
        pair.setNum(temp);
    }
}
