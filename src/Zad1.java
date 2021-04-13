public class Zad1 {
    public static void m(int x) {
        System.out.println("x="+x);
        if ((2*x+1)<20){
            m(2*x+1);
        }
    }
    public static void n(int x) {
        if((2*x+1)<20){
            n(2*x+1);
        }
        System.out.println("x="+x);
    }
    private static int step=0;

    public static void a(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1)<20){
            a(2*x+1);
        }
        space();
        System.out.println(""+x+"<- ");
    }
    public static void space(){
        for (int i=0; i<step; i++){
            System.out.println(" ");
        }
    }

    public static int fact(int x){
        int result;
        if (x==1)
            return 1;
        else{
            result=fact(x-1)*x;
            return result;
        }
    }
    public static int f(int x){
        if(x==0){
            return 0;
        } else
            if (x==1){
                return 1;
            } else {
                return f(x-2)+f(x-1);
            }
        }

    public static void main(String[] args) {
        m(1);
        n(1);
        a(1);
        System.out.println(fact(5));
        System.out.println(f(20));
    }
}
