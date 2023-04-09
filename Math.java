import java.util.Scanner;
public abstract class Math{

    static int d,u,s;
    //Static block
    static {
        d=25;
        u=20;
        s=15;
    }

static void Math(){
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tHow Many Ticket:");
}


    static void number1(){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
      int a=d*n1;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTotal Cost "+a);
    }

    static void number2(){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a=u*n1;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTotal Cost "+a);
    }
    static void number3(){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a=s*n1;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTotal Cost "+a);
    }


}
