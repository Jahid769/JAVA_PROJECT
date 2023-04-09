import java.util.Scanner;
public class Shift {

    static void day(){
        Scanner t=new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tPress Number to select your time: ");

        int a=t.nextInt();
        switch (a) {
            case 1:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTime : 8am selected ");

                break;

            case 2:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTime : 12.30pm selected ");

                break;
            case 3:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTime : 2.40pm selected ");

                break;
            case 4:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTime : 5.20pm selected ");

                break;
            case 5:

                System.out.println("..Please Select only with given time..");
                break;


        }


    }
}
