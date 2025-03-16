import java.util.Scanner;

public class learn{

        public static double acs (double a){
            if(a<0){
                return -a;
            }
            else{
                return a;
            }
        }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        System.out.println(acs(a));


    }
}