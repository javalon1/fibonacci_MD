package sda.com.algorytmy;

public class App {
    public static void main(String[] args) {

        System.out.println(fibo(8));

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
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }




}
