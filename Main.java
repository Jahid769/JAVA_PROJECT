import java.util.Scanner;
public class Main extends Info {  //Inheritance used
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Security obj=new Security();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tLOG IN TO CONTINUE");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\tNAME : ");
        String name=input.nextLine();
        obj.setName(name);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tID   : ");
        String d=input.nextLine();
        obj.setId(d);

        Info.n1();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tPress 1 to Confirm : cost will be deducted from One Card App system");

        int i=input.nextInt();
        if(i==1){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTicket Confirmed For : "+obj.getName());
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tId : "+obj.getId());
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThank you");

        }

    }
}