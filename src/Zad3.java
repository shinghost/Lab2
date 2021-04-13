import java.util.Scanner;

public class Zad3 {
    public static int[] arr;
    public static Scanner sc;

    public static void fill(int i){
        if (i<arr.length){
            System.out.println("arr " +i);
            arr[i] = sc.nextInt();
            fill(++i);
        }
    }
    public static void print(int i){
        if (i< arr.length){
            System.out.println(arr[i]);
            print(++i);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("enter arr: ");
        int n = sc.nextInt();
        arr = new int[n];
        fill(0);
        print(0);
    }
}
