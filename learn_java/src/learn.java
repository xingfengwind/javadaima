import java.util.Scanner;

public  class learn {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int sign =sc.nextInt();
       if(sign%2==0)
           System.out.println("坐右边");
       else
           System.out.println("坐左边");



    }
}