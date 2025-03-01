import java.util.Scanner;

public  class learn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isLightGreen=sc.nextBoolean();
        boolean isLightRed=sc.nextBoolean();
        boolean isLightYellow=sc.nextBoolean();
        if(isLightGreen){
            System.out.println("gogogo");
        }
        else if(isLightRed){
            System.out.println("stop");
        }
        else if(isLightYellow){
            System.out.println("slow down");
        }

    }
}