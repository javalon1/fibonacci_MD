package sda.com.algorytmy;

public class App {
    public static void main(String[] args) {

        System.out.println(fibo(10));
        System.out.println(fiboFor(10));

        //Fibonacci FOR i TABLICA
        int[] tab = new int[20];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
            System.out.println(tab[i]);
        }
    }

    //Fibonacci rekurencja
    public static int fibo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    //Fibonacci FOR bez tablicy

    public static int fiboFor(int n) {
        if (n < 2) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int c = 1;
            int k = 2;

            for (k = 2; k < n; k++) {
                a = b;
                b = c;
                c = a + b;
            }
            return c;
        }
    }
}






