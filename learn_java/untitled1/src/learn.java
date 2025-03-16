import java.util.Scanner;

public class learn {


    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                print(a,b,c);


    }

    public static void print(int a,int b,int c) {

        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);

    }


}
