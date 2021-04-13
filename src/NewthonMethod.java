import java.util.Scanner;

public class NewthonMethod {

    static double eps = 0.0000001;

    public static double fx(double x) {
        return (Math.pow(x, 3) - 4*Math.pow(x, 2) - 7*x + 10);
    }
    public static double dfx(double x) {
        return (3*Math.pow(x, 2) - 8*x - 7);
    }

    public static void Rek(double x0){
        double x1 = x0 - fx(x0) / dfx(x0);
        System.out.println(x1);
        x1 = x0 - fx(x0) / dfx(x0);
        if (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
            Rek(x0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x0 ");
        double x0 = sc.nextDouble();
        Rek(x0);
    }
}
