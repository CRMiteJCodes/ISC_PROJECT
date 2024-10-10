import java.util.Scanner;
public class MainScreen
{   
    String p[]=new String[25];
    int q[]=new int[25];
    double a[]=new double[25];
    int i=0;
    
    String p1[]=new String[25];
    int q1[]=new int[25];
    double a1[]=new double[25];
    int i1=0;
    
    double ftAmt;
    double frAmt;
     public void FirstScreen()
    {
        System.out.println("******************************************************************************************************************");
        System.out.println("                                   HARMONY HALL PRODUCTIONS");
        System.out.println("                                                             Recording & Rehearsal Studio");
        System.out.println("                                                             -5413 lomas blvd NE, Albuquerque.");
        System.out.println("                                                              Phone number: 7682175293");
        System.out.println("******************************************************************************************************************");        
    }
    public void mainOption()
    {
        System.out.println("1.RENT STUDIO \t\t\t\t\t\t"+"2.SEARCH TICKETS");
        System.out.println("3.Exit");
    }
    public void ticketFinalBill(MainScreen ms)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name=scan.nextLine();
        System.out.println("Enter Mobile Number");
        long n=scan.nextLong();
        System.out.println("Enter Email id:");
        scan=new Scanner(System.in);
        String id=scan.nextLine();
        System.out.println("Enter Address");
        String ad=scan.nextLine();
        ms.FirstScreen();
        System.out.println("   ***************************************   Tickets Bill   *****************************************");
        System.out.println("Customer Name: "+name+ "\t\t\t\t\t"+"Email id: "+id);
        System.out.println("Mobile Number: "+n+"\t\t\t\t"+"Address: "+ad);
        System.out.println();
        System.out.println("**************************************** Final Billing Details *****************************************");
        System.out.println("\t Sl.no"+"\t"+"Particulars"+"\t\t\t Qty \t\t"+"Price");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for(int j=0; j<ms.i; j++)
        {
        System.out.println("\t "+(j+1)+"\t"+ms.p[j]+"\t  "+q[j]+"\t\t"+ms.a[j]);
        ftAmt+=ms.a[j];
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("\t Final Bill: \t\t\t\t\t        "+ftAmt);
        double tax=ftAmt*18/100;
        System.out.println("\t GST:  \t\t\t\t\t                "+tax);
        double grand=tax+ftAmt;
        System.out.println("\t Grand Final Bill: \t\t\t\t\t"+grand);
                System.out.println("     ****************************************     *****************************************");
    }
    public void rentFinalBill(MainScreen ms)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name=scan.nextLine();
        System.out.println("Enter Mobile Number");
        long n=scan.nextLong();
        System.out.println("Enter Email id:");
        scan=new Scanner(System.in);
        String id=scan.nextLine();
        System.out.println("Enter Address");
        String ad=scan.nextLine();
        System.out.println("Enter the Date of Renting:");
        String d=scan.nextLine();
        ms.FirstScreen();
        System.out.println("    ****************************************    Renting Bill   ************************************");
        System.out.println("Customer Name: "+name+"\t\t\t\t\t\t"+"Email id: "+id);
        System.out.println("Mobile Number: "+n+"\t\t\t\t"+"Address: "+ad);
        System.out.println();
        System.out.println("**************************************** Final Billing Details *****************************************");
        System.out.println();
        System.out.println("\t Date: "+d);
        System.out.println("\t\t Sl.no"+"\t"+"Particulars"+"\t\t Qty \t"+"Price");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for(int j=0; j<ms.i1; j++)
        {
        System.out.println("\t\t "+(j+1)+"\t"+ms.p1[j]+"\t  "+q1[j]+"\t"+ms.a1[j]);
        frAmt+=ms.a1[j];
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println();
        System.out.println("\t\t Final Bill: \t\t\t\t"+frAmt);
        double tax=frAmt*18/100;
        System.out.println("\t\t GST: \t\t\t\t\t"+tax);
        double grand=tax+frAmt;
        System.out.println("\t\t Grand Final Bill: \t\t\t"+grand);
    }
    public static void main(String args[])
    {
        int ch;
        Scanner scan=new Scanner(System.in);
        MainScreen ms=new MainScreen();
        SearchTicket st=new SearchTicket();
        RentStudio rs=new RentStudio();
        ms.FirstScreen();
        do
        {
        ms.mainOption();
        ch=scan.nextInt();
        switch(ch)
        {
            case 1:
            rs.display1(ms);
            break;
            case 2:
            st.display1(ms);
            break;
            case 3:
            System.out.println();
            if(ms.i>0)
            ms.ticketFinalBill(ms);
            if(ms.i1>0)
            ms.rentFinalBill(ms);
            System.out.println("     **************************************** Exit *****************************************");
            break;
        }
        }while(ch!=3);
    }
}
