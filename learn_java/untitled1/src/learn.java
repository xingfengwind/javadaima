import java.util.Scanner;

public class learn {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max_numb=max(a,b,c);
        System.out.println(max_numb);
    }


        public static int max(int a,int b,int c){
            return (a>b?a:b)>c?(a>b?a:b):c;
        }

}
