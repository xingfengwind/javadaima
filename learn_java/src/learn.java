import java.util.Scanner;

public  class learn {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int grade=sc.nextInt();
       if(grade>=95){
           System.out.println("自行车");
       }
       else if(grade>=90){
           System.out.println("游乐园");
       }
       else if(grade>=80){
           System.out.println("变形金刚");
       }
       else{
           System.out.println("挨顿揍");
       }



    }
}