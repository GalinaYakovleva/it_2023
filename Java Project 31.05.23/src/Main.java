import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        while(условие)
            действиЕ;
        do
            действиЕ;
        while(условие);

        for(в1,в2,в3)
            действиЕ;
           в1=>в2=>Д=>в3=>в2=>Д=>в3
         */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("i=" + i);
        }
        i = 0;
        do {
            i++;
            System.out.println("i=" + i);
        }
        while (i < 10);


        int x = scanner.nextInt();
        timer(3);
        timer(x);
    }

    public static void timer(int x) {
        int min = x / 60;
        int sec = x % 60;

        for (int j = x; j >= 0; j--) {
            System.out.println("min = " + min + ",sec=" + sec);
            sec--;
            if (sec < 0) {
                sec = 60;
                min--;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("times up");
    }
}