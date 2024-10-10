import java.util.Scanner;
public class SearchTicket
{
    Scanner scan=new Scanner(System.in);
    double Amt;
    double finalAmt;
    MainScreen m;
    public void display1(MainScreen m1)
    {
        m=m1;
        int ch;
        int s;
        int g;
        int v;        
        do
        {
            System.out.println("Upcoming Concerts");
            System.out.println("1.AR Rahman's Live                                  ");
            System.out.println("2.Eminem's Indian Tour                              ");
            System.out.println("3.Best of Arijit Singh                              ");
            System.out.println("4.Exquisite afternoon Raag with Kaushiki Chakraborty");
            System.out.println("5.Raghu Dixit's Project Live                        "); 
            System.out.println("6.Exit");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Artist: AR Rahman");
                System.out.println("Date: Saturday, 12 August, 2024, 7:30P.M.");
                System.out.println("Venue: Adityaram Palace, Chennai.");
                System.out.println("Ticket price: ");
                System.out.println("1.Standard: Rs."+4000);
                s=4000;
                System.out.println("2.Gold: Rs."+10000);
                g=10000;
                System.out.println("3.VIP: Rs."+20000);
                v=20000;
                System.out.println("4.Back");
                int c=scan.nextInt();
                if(c==1)
                {
                    display2(s,1);
                }
                else if(c==2)
                {
                    display2(g,1);
                }
                else if(c==3)
                {
                    display2(v,1);
                }
                break;
                
                case 2:
                System.out.println("Artist: Eminem");
                System.out.println("Date: Sunday, 15 May, 2024, 4:30P.M.");
                System.out.println("Venue: Church Street Social Banglore");
                System.out.println("Ticket price: ");
                System.out.println("1.Standard: Rs."+2000);
                s=2000;
                System.out.println("2.Gold: Rs."+8000);
                g=8000;
                System.out.println("3.VIP: Rs."+10000);
                v=10000;
                System.out.println("4.Back");
                                c=scan.nextInt();
                if(c==1)
                {
                    display2(s,2);
                }
                else if(c==2)
                {
                    display2(g,2);
                }
                else if(c==3)
                {
                    display2(v,2);
                }
                break;
                
                case 3:
                System.out.println("Artist: Arijit Singh");
                System.out.println("Date: Friday, 15 April, 2024, 7:00P.M.");
                System.out.println("Venue:  DJ ACE, Mumbai");
                System.out.println("Ticket price: ");
                System.out.println("1.Standard: Rs."+3000);
                s=3000;
                System.out.println("2.Gold: Rs."+7000);
                g=7000;
                System.out.println("3.VIP: Rs."+15000);
                v=15000;
                System.out.println("4.Back");
                c=scan.nextInt();
                if(c==1)
                {
                    display2(s,3);
                }
                else if(c==2)
                {
                    display2(g,3);
                }
                else if(c==3)
                {
                    display2(v,3);
                }
                break;
                
                case 4:
                System.out.println("Artist: Koushiki Chakraborty");
                System.out.println("Date: Friday, 27 March, 2024, 12:30P.M.");
                System.out.println("Venue:  Satyajit Ray Auditorium");
                System.out.println("Ticket price: ");
                System.out.println("1.Standard: Rs."+2000);
                s=2000;
                System.out.println("2.Gold: Rs."+3000);
                g=3000;
                System.out.println("3.VIP: Rs."+8000);
                v=8000;
                System.out.println("4.Back");
                c=scan.nextInt();
                if(c==1)
                {
                    display2(s,4);
                }
                else if(c==2)
                {
                    display2(g,4);
                }
                else if(c==3)
                {
                    display2(v,4);
                }
                break;
                
                case 5:
                System.out.println("Artist: Raghu Dixit");
                System.out.println("Date: Sunday, 29 March, 2024, 5:00P.M.");
                System.out.println("Venue: Church Street Social Banglore");
                System.out.println("Ticket price: ");
                                System.out.println("1.Standard: Rs."+2000);
                s=2000;
                System.out.println("2.Gold: Rs."+5000);
                g=5000;
                System.out.println("3.VIP: Rs."+6000);
                v=6000;
                System.out.println("4.Back");
                c=scan.nextInt();
                if(c==1)
                {
                    display2(s,5);
                }
                else if(c==2)
                {
                    display2(g,5);
                }
                else if(c==3)
                {
                    display2(v,5);
                }
                break;
                
                case 6:
                bill();
                System.out.println("******************************Exit*************************");
                break;
            }
        }while(ch!=6);
    }
     public void display2(int price, int option)
    {
       
        if(option==1)
        {
            m.p[m.i++]="A R Rahman' Live              ";
            System.out.println("  A R Rahman's  Live  Tour ");
        }
         else if(option==2)
        {
            m.p[m.i++]="Eminem's Indian Tour          ";
            System.out.println("  Eminem's   Indian  Tour  ");
        }
        else if(option==3)
        {
            m.p[m.i++]="Best of Arijit Singh          ";
            System.out.println("  Best  of  Arijit  Singh  ");
        }
        else if(option==4)
        {
            m.p[m.i++]="Kaushiki Chakraborty's concert";
            System.out.println("Raag by Kaushiki Chakraborty");
        }
        else if(option==5)
        {
            m.p[m.i++]="Raghu Dixit's Project Live    ";
            System.out.println(" Raghu Dixit's  Project Live");
        }
        System.out.println("Enter no. of tickets");
        int not=scan.nextInt();
        Amt=not*price;
        m.q[(m.i)-1]=not;
        m.a[(m.i)-1]=Amt;
        System.out.println("Amount: Rs"+Amt);
        finalAmt+=Amt;
    }
    public void bill()
    {
        System.out.println("Final Amount: "+finalAmt);
    }
}


