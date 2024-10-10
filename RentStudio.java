import java.util.Scanner;
public class RentStudio
{
    int h;
    double cprice;
    double dyprice;
    double dprice;
    double gprice;
    double pprice;
    double daw;
    Scanner scan=new Scanner(System.in);
    MainScreen m;
     public void display1(MainScreen m1)
    {
        m=m1;
        int ch;
         do
        {
            System.out.println("1.Rent                             2.Exit" );
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                rent();
                break;
                case 2:
                System.out.println("*********************Exit********************");
                break;
                default:
                System.out.println("Invalid choice!");
            }
        }while(ch!=2);
    }
    public void rent()
    {        
        int c;
        System.out.println("Enter the no. of hours: ");
        h=scan.nextInt();
        do
        {                    
            System.out.println("Available options:");
            System.out.println("1.Mics");
            System.out.println("2.Music Instruments");
            System.out.println("3.DAW");
            System.out.println("4.Finish and Book");
            c=scan.nextInt();
            switch(c)
            {
                case 1:
                System.out.println();
                mic();
                break;
                case 2:
                System.out.println();
                mi();
                break;
                case 3:
                System.out.println();
                daw();
                break;
                case 4:
                                System.out.println("******* Additional Billing  *******");
                bill();
                break;
            }
        }while(c!=4);
    }
    public void mic()
    {
        int ch;        
        do
        {
            System.out.println("Enter the type of mic:");
            System.out.println("1.Condenser mic          2.Dynamic mic        3.Exit");
            ch=scan.nextInt();
            switch (ch)
            {
            case 1:
            System.out.println("Enter the no. of Condenser mics:");
            int n1=scan.nextInt();           
            m.p1[m.i1++]="Condenser mics  ";
            m.q1[(m.i1)-1]=n1;
            System.out.println("Price for 1 hr: Rs.50");           
            cprice=h*50*n1;
            m.a1[(m.i1)-1]=cprice;
            break;
            case 2:
            System.out.println("Enter the no. of Dynamic mics:");
            int n2=scan.nextInt();
            m.p1[m.i1++]="Dynamic mics    ";
            m.q1[(m.i1)-1]=n2;
            System.out.println("Price for 1 hr: Rs.35");
            dyprice=h*35*n2;
            m.a1[(m.i1)-1]=dyprice;
            break;
            
            case 3:
            System.out.println("Final price for Condenser mics: "+cprice);
            System.out.println("Final price for Dynamic mics: "+dyprice);
            break;
            default:
            System.out.println("Invalid choice!");
            }
        }while(ch!=3);
    }
    public void mi()
    {
        int ch;
        System.out.println("Enter the Instrument needed:");
        do
        {
            System.out.println("1.Full Drum set    2.Electric guitar    3.Piano    4.Exit ");
            ch=scan.nextInt();
            switch (ch)
            {
            case 1:
            System.out.println("Enter the no. of Drum set:");
            int n1=scan.nextInt();
            m.p1[m.i1++]="Drum  Set       ";
            m.q1[(m.i1)-1]=n1;
            System.out.println("Price for 1 hr: Rs.900");
            dprice=h*900*n1;
            m.a1[(m.i1)-1]=dprice;
            break;
            case 2:
            System.out.println("Enter the no. of Electric guitars:");
            int n2=scan.nextInt();
            m.p1[m.i1++]="Electric guitars";
            m.q1[(m.i1)-1]=n2;
            System.out.println("Price for 1 hr: Rs.300");
            gprice=h*300*n2;
            m.a1[(m.i1)-1]=gprice;
            break;
            case 3:
                        System.out.println("Enter the no. of Piano:");
            int n3=scan.nextInt();
            m.p1[m.i1++]="Grand  Piano    ";
            m.q1[(m.i1)-1]=n3;
            System.out.println("Price for 1 hr: Rs.600");
            pprice+=h*600*n3;
            m.a1[(m.i1)-1]=pprice;
            break;
            
            case 4:
            System.out.println("Final price for Drum set: "+dprice);
            System.out.println("Final price for Electric guitars: "+gprice);
            System.out.println("Final price for Piano: "+pprice);
            break;
            default:
            System.out.println("Invalid choice!");
            }
        }while(ch!=4);
    }
    public void daw()
    {
        int ch;
        double dwprice=0;
        System.out.println("Enter the Daw needed:");
        System.out.println("1.Ableton Live    2.Logic Pro   3.Cubase ");
        ch=scan.nextInt();
        switch (ch)
        {
            case 1:
            System.out.println("Ableton Live Suite :");
            m.p1[m.i1++]="Ableton  Live   ";
            System.out.println("Price for 1 hr: Rs.50");
            dwprice=h*50;
            m.a1[(m.i1)-1]=dwprice;
            m.q1[(m.i1)-1]=1;
            break;
            case 2:
            System.out.println("Logic Pro 10:");
            m.p1[m.i1++]="Logic  Pro  10  ";
            System.out.println("Price for 1 hr: Rs.30");
            dwprice=h*30;
            m.a1[(m.i1)-1]=dwprice;
            m.q1[(m.i1)-1]=1;
            break;
            case 3:
            System.out.println("Steingerg Cubase Pro 12:");
            m.p1[m.i1++]="Cubase  Pro 12  ";
            System.out.println("Price for 1 hr: Rs.35");
            dwprice+=h*35;
            m.a1[(m.i1)-1]=dwprice;
            m.q1[(m.i1)-1]=1;
            break;
        }

    }
    public void bill()  
    {
        RentStudio r=new RentStudio();
        if(m.i1>0)
        {
        System.out.println("Rate music engineer: Rs.300 per hour");
          {
            m.p1[m.i1++]="Music Engineer  ";
            daw=300*h;
            m.q1[(m.i1)-1]=1;
            m.a1[(m.i1)-1]=daw;
          }
        System.out.println();
        }
    }
}

    

