import java.util.Scanner;

public class Div {

    static double eps = 0.0000001;

    public static double fx(double x) {
        return (Math.pow(x, 3) - 4 * Math.pow(x, 2) - 7 * x + 10);
    }

    public static void Rec(double a, double b){
        System.out.println((a+b)/2);
        if (Math.abs(b-a) > eps) {
            double x = (a + b) / 2;
            if (fx(a)*fx(x)>0){
                a = x;
            }
            else {
                b = x;
            }
            Rec(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a ");
        double a = sc.nextDouble();
        System.out.println("Введите b ");
        double b = sc.nextDouble();
        Rec(a, b);
    }
}