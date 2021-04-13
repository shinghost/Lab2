import java.util.Scanner;

public class Zad2 {
    public static void dectoBin(int n){
        if (n/2!=0){
            dectoBin(n/2);
        }
        System.out.println(n%2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        dectoBin(n);
    }
}
