package by.overone.lesson6;

public class Work {
    public static void main(String[] args) {
        boolean kjgh;
        for (int i = 2; i < 100; i++){
            kjgh=true;
            for (int j=2; j<=i/j;j++){
                 if (i%j==0){
                     kjgh= false;
                 }
            }
            if (kjgh){
                System.out.println(i+" ");
            }
        }
    }
}
