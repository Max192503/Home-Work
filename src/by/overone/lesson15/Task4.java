package by.overone.lesson15;

public class Task4 {
    public static void main(String[] args) {
        String name = "иванoв Иван иванович";
        String[] nameParts = name.split(" ");

        String firstInitial = String.valueOf(nameParts[0].charAt(0));
        String middleInitial = String.valueOf(nameParts[1].charAt(0));
        String lastInitial = String.valueOf(nameParts[2].charAt(0));

        System.out.println("Initials Are " + firstInitial.toUpperCase() + "." + middleInitial.toUpperCase() + "."
                + lastInitial.toUpperCase() + ".");
    }
}
