import java.util.Scanner;
public abstract class Code implements place {//Abstraction use

    static void Code() {//Constructor
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();


        switch (n) {
            case 1:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tDhanmondi Selected");
                place.Dhanmondi();
                Math.Math();
                Math.number1();
                break;

            case 2:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tUttora Selected");
                place.Uttora();
                Math.Math();
                Math.number2();

                break;


            case 3:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tSavar Selected");
                place.Savar();
                Math.Math();
                Math.number3();

                break;

        }



    }
}
