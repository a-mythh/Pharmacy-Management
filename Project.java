import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;
public class Project
{
    String Date()
    {
     Date now = new Date();
     SimpleDateFormat date = new SimpleDateFormat("d MMMM, EEEE, YYYY");
     String Date = "Date : "+date.format(now);
     return(Date);
    }
    String Time()
    {
     Date now = new Date();
     SimpleDateFormat date = new SimpleDateFormat("hh : mm : ss a zzz");
     String Time = "Time : "+date.format(now);
     return(Time);
    }
    String Month_Year()
    {
     Date now = new Date();
     SimpleDateFormat date = new SimpleDateFormat("MM/YYYY");
     String Month_Year = date.format(now);
     return(Month_Year);
    }
    String UUID(int len) 
    {
    char ch[] =  {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
                  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
                  'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
                  'U', 'V', 'W', 'X', 'Y', 'Z'};
    char c[] = new char[len];
    Random random=new Random();
    for (int i = 0; i < len; i++) 
    {
      c[i]=ch[random.nextInt(ch.length)];
    }
    
    return new String(c);
    }
    String Day()
    {
      Date now = new Date();
      SimpleDateFormat date = new SimpleDateFormat("EEEE");
      String Month_Year = date.format(now);
      return(Month_Year);
    }
    String Date1()
    {
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd / MMM / yyyy");
        String date1 = date.format(now);
        return(date1);
    }
    void Stock(int no,String med1[],int quant[],String mfg[],String exp[],double mrp[],String bno[])
    {int i;
     System.out.println(" ___________________________________________________________________________________________________________________");
     System.out.println("|                                                                                                                   |");
     System.out.println("|                                            "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                                         |");
     System.out.println("|                                                                                                                   |");
     System.out.println("|                                                         Stock                                                     |");
     System.out.println("|___________________________________________________________________________________________________________________|");
     System.out.println("|Sl. No.|            Name                  |  Quantity  | Batch No. |   Mfg. Date   |   Exp. Date   |     M.R.P.    |");
     System.out.println("|-------+----------------------------------+------------+-----------+---------------+---------------+---------------|");
     for(i=0;i<=no;i++)
     {System.out.println("| "+String.format("%3d",(i+1))+"   "+String.format("|  %-30s  |", med1[i])+"  "+String.format("%8d  |",quant[i])+"  "+String.format("%-9s",bno[i])+"|    "+mfg[i]+"    |    "+exp[i]+"    |     "+String.format("%8.2f  |",mrp[i]));
     if(i!=no)
     System.out.println("|-------+----------------------------------+------------+-----------+---------------+---------------+---------------|");}
     System.out.println("|_______|__________________________________|____________|___________|_______________|_______________|_______________|");
    }
    void Token_Display(int no1,int token[],String uuid[],String doca[],String time[],String pname[],String spec[],String date01[],String day[])
    {
        System.out.println(" ____________________________________________");
        System.out.println("|                                            |");
        System.out.println("|       "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"       |");
        System.out.println("|                                            |");
        System.out.println("|           Phone No. "+(char)(9742)+" : 2229154           |");       
        System.out.println("|____________________________________________|");
        System.out.println("|                                            |");
        System.out.println("|               #"+String.format("%-2s",token[no1])+" TOKEN                    |");
        System.out.println("|____________________________________________|");
        System.out.println("| Date : "+String.format("%-15s                     |",date01[no1]));
        System.out.println("| Day : "+String.format("%-9s                            |",day[no1]));
        System.out.println("| Unique ID : "+uuid[no1]+"                         |");
        System.out.println("| Doctor's Name : "+String.format("%-27s|",doca[no1]));
        System.out.println("| Speciality : "+String.format("%-25s     |",spec[no1]));
        System.out.println("| Patient's Name : "+String.format("%-26s|",pname[no1]));
        System.out.println("| Time : "+String.format("%-20s                |",time[no1]));
        System.out.println("|                                            |");
        System.out.println("|  Please bring Token along for Appointment  |");   
        System.out.println("|____________________________________________|");
    }
    public static void main(String args[]) throws ParseException
    {
        Project am=new Project();
        Scanner a=new Scanner(System.in);
        Date now=new Date();
        SimpleDateFormat date = new SimpleDateFormat("MM/yyyy");
        String med[]=new String[100];
        String med1[]=new String[100];
        int quant[]=new int[100];double cp[]=new double[100],mrp[]=new double[100];
        String name;String bmed[]=new String[100];
        String bno[]=new String[100];
        bno[0]="SL18152";bno[1]="WYL8171";bno[2]="TSX6001";bno[3]="D78B197";bno[4]="JS10578";bno[5]="A6I7291";bno[6]="FHS3007";bno[7]="AN31852";
        med[0]="Ancef 200 Tablet         ";med[1]="Aziline 500 Tablet       ";med[2]="Bitterless Pediatic Syrup";med[3]="Fultos Syrup             ";
        med[5]="G-Folvin Syrup           ";med[6]="G-Folvin Tablet          ";med[7]="Iro-Folvin Tablet        ";med[4]="G-Folvin LB Tablet       ";
        med1[0]="Ancef 200 Tablet";med1[1]="Aziline 500 Tablet";med1[2]="Bitterless Pediatic Syrup";med1[3]="Fultos Syrup";
        med1[5]="G-Folvin Syrup";med1[6]="G-Folvin Tablet";med1[7]="Iro-Folvin Tablet";med1[4]="G-Folvin LB Tablet";
        int bill=1,token[]=new int[50];
        int i,count;char xz1;
        String exp[]=new String[100];String mfg[]=new String[100];
        exp[0]="04/2023";exp[1]="04/2023";exp[2]="02/2023";exp[3]="07/2023";exp[4]="02/2023";exp[5]="12/2024";exp[6]="10/2023";exp[7]="01/2023";
        mfg[0]="04/2017";mfg[1]="04/2016";mfg[2]="02/2017";mfg[3]="07/2018";mfg[4]="02/2018";mfg[5]="12/2017";mfg[6]="10/2017";mfg[7]="01/2016";
        quant[0]=1000;quant[1]=1000;quant[2]=1000;quant[3]=1000;quant[4]=1000;quant[5]=1000;quant[6]=1000;quant[7]=1000;
        int c,j,f,no=7,uidn=0;
        int qmed[]=new int[100];         
        mrp[0]=15.0;mrp[1]=20.0;mrp[2]=20.0;mrp[3]=20.0;mrp[4]=15.0;mrp[5]=12.0;mrp[6]=15.0;mrp[7]=20.0;
        char cxz='y';
        String doc[]=new String[100];
        String doct[]=new String[100];
        doc[0]="Dr. Manoj Ghosh";doc[1]="Dr. Sudhanshu Bhattacharya";doc[2]="Dr. Naresh Trehan";
        doct[0]="9:00 AM to 11:00 AM";doct[1]="1:00 PM to 3:00 PM";doct[2]="5:00 PM to 7:00 PM";
        int docti=3;
        String qual[]=new String[100];
        qual[0]="General Physiology";qual[1]="Dermatology";qual[2]="Gynaecology";
        String monq[]=new String[100];int monq1=0;
        String tueq[]=new String[100];int tueq1=0;
        String wedq[]=new String[100];int wedq1=0;
        String thuq[]=new String[100];int thuq1=0;
        String friq[]=new String[100];int friq1=0;
        String satq[]=new String[100];int satq1=0;
       String sunq[]=new String[100];int sunq1=0;
       monq[monq1]=qual[0];++monq1;
       tueq[tueq1]=qual[1];++tueq1;
       wedq[wedq1]=qual[2];++wedq1;
       thuq[thuq1]=qual[0];++thuq1;
       thuq[thuq1]=qual[1];++thuq1;
       friq[friq1]=qual[1];++friq1;
       friq[friq1]=qual[2];++friq1;
       satq[satq1]=qual[0];++satq1;
       sunq[sunq1]=qual[2];++sunq1;
      String monday[]=new String[100];int mon=0;
      String tuesday[]=new String[100];int tue=0;
      String wednesday[]=new String[100];int wed=0;
      String thursday[]=new String[100];int thu=0;
     String friday[]=new String[100];int fri=0;
    String saturday[]=new String[100];int sat=0;
     String sunday[]=new String[100];int sun=0;
    String mont[]=new String[100];int monti=0;
    String tuet[]=new String[100];int tueti=0;
      String wedt[]=new String[100];int wedti=0;
    String thut[]=new String[100];int thuti=0;
     String frit[]=new String[100];int friti=0;
      String satt[]=new String[100];int satti=0;
     String sunt[]=new String[100];int sunti=0;
      monday[mon]=doc[0];++mon;
        tuesday[tue]=doc[1];++tue;
        wednesday[wed]=doc[2];++wed;
         thursday[thu]=doc[0];++thu;
        thursday[thu]=doc[1];++thu;
           friday[fri]=doc[1];++fri;
          friday[fri]=doc[2];++fri;
            saturday[sat]=doc[0];++sat;
           sunday[sun]=doc[2];++sun;
           mont[monti]=doct[0];++monti;
           tuet[tueti]=doct[1];++tueti;
           wedt[wedti]=doct[2];++wedti;
         thut[thuti]=doct[0];++thuti;
       thut[thuti]=doct[1];++thuti;
           frit[friti]=doct[1];++friti;
           frit[friti]=doct[2];++friti;
           satt[satti]=doct[0];++satti;
           sunt[sunti]=doct[2];++sunti;
         int sl,no1=0,docno=3;char cz1;
          String uuid[]=new String[50];
          String doca[]=new String[50];
        String time[]=new String[50];
         String pname[]=new String[50];
         String spec[]=new String[50];
        String date01[]=new String[50];
        String day[]=new String[50];char cz3='y';
                      int bv=0;
        help:
        while(cxz=='y')
        {
        System.out.println("\fWhich one do you want to Access :\nPharmacy Management "+(char)(9960)+" (Press 'A')\nDay_Date            "+(char)(9925)+" (Press 'B')");
        char choice0=Character.toUpperCase(a.next().charAt(0));
        System.out.println("\f");
        switch(choice0)
        {case 'A':
        am.Stock(no,med1,quant,mfg,exp,mrp,bno);
        System.out.println("\n\n\n");
        for(i=0;i<=no;i++)
        {
            if (date.parse(exp[i]).before(now))
            {System.out.println(med1[i]+" has Expired\n");
             System.out.println("Do you want to DELETE "+med1[i]+" (Y/N) : ");
             xz1=Character.toLowerCase(a.next().charAt(0));
             if(xz1=='y')
             {int pos=i+1;
                       String ab="";
                       ab=med1[pos-1];
                       pos=pos-1;
                       for(i=pos+1;i<=no;i++)
                       {med1[i-1]=med1[i];
                        mrp[i-1]=mrp[i];
                        quant[i-1]=quant[i];
                        exp[i-1]=exp[i];
                        mfg[i-1]=mfg[i];}
                        no--;
                        System.out.println("\f");
                        am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                        System.out.println("\nMedicine "+ab+" deleted");}
            }
        }
        char v='Y';
        hii:
        while(v=='Y')
        {System.out.println("\f");
         am.Stock(no,med1,quant,mfg,exp,mrp,bno);
        System.out.println("\n\n\nWhat do you want to do :\nMake a Bill           "+(char)(9944)+" (Press 1)\nView and Update Stock  "+(char)(11121)+" (Press 2)\nDoctor                "+(char)(9937)+" (Press 3)\nGo Back               "+(char)(10145)+" (Press 4)");
        int ch=a.nextInt();
        System.out.println("\f");
        String drn;
        char c1='Y';
        switch(ch)         
            
        {case 1: hello :
                 do
                {
                    if(no<0)
                       {
                           System.out.println("No Medicines are available");
                           break;
                        }
                 am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                  System.out.println("\n\n\n");
                 a.nextLine();
                 int l1=0,m1=0;
                 System.out.print("\nEnter Doctor's Name : Dr. ");
                 drn=a.nextLine();
                System.out.print("Enter Customer's Name  : ");
                name=a.nextLine();
                System.out.print("How many medicines do you want to buy : ");
                m1=a.nextInt();
                while(m1>no+1)
                {
                 System.out.println("There are only "+(no+1)+" medicines available\nPlease enter within the given limit : ");
                 m1=a.nextInt();
                }
                int m2=m1,same []=new int[m1];same[0]=0;
                System.out.println("Enter the Serial No. of the medicines you want to buy : ");
                for(i=0;i<m1;i++)
                {
                    count=a.nextInt();
                    for(j=0;j<m1;j++)
                    {if(same[j]==count)
                     {System.out.println("You have already entered Serial No. "+count+"\nPlease enter some other Serial No. : ");
                      count=a.nextInt();
                      j=-1;}
                    }
                    same[i]=count;
                     while(count>no+1 || count<=0)
                    {
                     System.out.println("\nThere is no Medicine with Serial No. "+count+"\nPlease enter the correct Serial No. : ");
                     count=a.nextInt();
                    }
                    bmed[i]=med1[count-1];
                }
                String t="";
                for(i=0;i<m1;i++)
                       {
                           for(j=0;j<(m1-1-i);j++)
                           {
                               if(bmed[j].compareTo(bmed[j+1])>0)
                               {
                                   t=bmed[j];
                                   bmed[j]=bmed[j+1];
                                   bmed[j+1]=t;
                                }
                           }     
                      }
                
                double amt[]=new double[100];
                int h=0;
                char cx,cx1;
                String meds2[]=new String[100];double mrp2[]=new double[100];
                int m3=m2;
                for(i=0;i<m2;i++)
                {System.out.print("What quantity of "+bmed[i]+" do you want to buy : ");
                 qmed[i]=a.nextInt();}
                String z="";
                 for(i=0;i<m2;i++)
                {
                char cz; 
                while(quant[i]<qmed[i])
                {if(quant[i]==0)
                 {System.out.println(bmed[i]+" is out of stock");
                  System.out.println("Do you want to Re-enter the Serial No : ");
                  cz=Character.toLowerCase(a.next().charAt(0));
                  if(cz=='y')
                  continue hello;
                  else
                  return;}
                 if(quant[i]<qmed[i])
                  {System.out.println("Only "+quant[i]+" units of "+bmed[i]+" are available");
                   System.out.println("Do you want to purchase "+quant[i]+" units of "+bmed[i]+"(Y/N) : ");
                   cx=Character.toLowerCase(a.next().charAt(0));
                   if(cx=='y')
                   {qmed[i]=quant[i];
                    break;
                   }
                   if(cx=='n')
                   System.out.println("Do you want to Re-enter the Quantity of "+bmed[i]+"(Y/N) : ");
                   cx1=Character.toLowerCase(a.next().charAt(0));
                   if(cx1=='y')
                   {System.out.print("What quantity of "+bmed[i]+" do you want to buy : ");
                    qmed[i]=a.nextInt();
                    }
                   if(cx1=='n')
                   {qmed[i]=0;
                    return;}
                  }
                 }
                }
                String exp2[]=new String[100];
                String mfg2[]=new String[100];
                String bno2[]=new String[100];
                a.nextLine();
                
                for(i=0,j=0;i<=no;i++)
                {if(j<m3)
                 {if(bmed[j].equalsIgnoreCase(med1[i]))
                 {amt[h]=mrp[i]*qmed[h];
                  mrp2[h]=mrp[i];
                  quant[i]=quant[i]-qmed[j];
                  meds2[h]=med1[i];
                  bno2[h]=bno[i];
                  exp2[h]=exp[i];
                  mfg2[h]=mfg[i];
                  j++;h++;}
                 }
                }
                System.out.print("Are you sure you want to Create the Bill (Y/N) : ");
                char cb=Character.toLowerCase(a.next().charAt(0));
                if(cb!='y')
                break;
                System.out.println("\f");
                int ca=0;
                System.out.println(" ________________________________________________________________________________________________________________________");
                System.out.println("|                                                                                                                        |");
                System.out.println("|                                           "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                                               |");
                System.out.println("|                                                                                                                        |");
                System.out.println("|  GSTIN/UIN : 17AGFPJ2109L1ZI                Phone No. "+(char)(9742)+" : 2229154               E-Mail "+(char)(9993)+" : wellnessforever@gmail.com  |");
                System.out.println("|                                                                                                                        |");
                System.out.println("|                     Address : 1st Floor, IAN Building, G.S. Road, Police Bazaar, Shillong - 793001                     |");
                System.out.println("|                                                                                                                        |");
                System.out.println("|                                                      #"+String.format("%-4s",bill)+" Bill                                                        |");
                System.out.println("|________________________________________________________________________________________________________________________|");
                double gamt=0.0;
                System.out.println();
                System.out.println(" "+am.Date()+"                                                          "+String.format("%28s ",am.Time()));
                System.out.println();
                System.out.println("Name of Doctor : Dr. "+drn);
                System.out.println("Name of Customer : "+name+"\n");
                System.out.println(" ________________________________________________________________________________________________________________________");
                System.out.println("| Sl. No. |          Name                    | Batch No. | Mfg. Date | Exp. Date |   M.R.P.    | Quantity |   Amount     |");
                System.out.println("|---------+----------------------------------+-----------+-----------+-----------+-------------+----------+--------------|");
                for(j=0,ca=1;j<=m2-1;j++)
                {
                 if(amt[j]!=0.0)
                 {System.out.println("|  "+String.format("%3d",(ca))+".   "+String.format("|  %-30s  |",meds2[j])+"  "+String.format("%-9s",bno2[j])+"|  "+mfg2[j]+"  |  "+exp2[j]+"  |     "+String.format("%5.2f",mrp2[j])+"   |    "+String.format("%5d ",qmed[j])+"| "+String.format("Rs. %8.2f |",amt[j]));
                  if(j!=m2-1)
                  System.out.println("|---------+----------------------------------+-----------+-----------+-----------+-------------+----------+--------------|");
                 gamt=amt[j]+gamt;
                 ca++;}
                }
                System.out.println("|_________|__________________________________|___________|___________|___________|_____________|__________|______________|");
                System.out.println("\n\n                                          Total Amount : Rs. "+Math.round(gamt)+".0");
                System.out.println();
                System.out.println("*************************************************** Get Well Soon *******************************************************");
                System.out.println("***************************************************** Thank You *********************************************************");
                System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n\n\n");
                am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                bill++;
                System.out.println("\n\n\n");
                System.out.print("Do you want to make another bill (Y/N) : ");
                c1=Character.toUpperCase(a.next().charAt(0));
                }while(c1=='Y');
                break;
                 case 2:char cq='y';
                        do{
                        System.out.println("\f");
                        am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                        System.out.println("\nWhat do you want to do :\nSearch a Medicine                      "+(char)(9745)+" (Press 1)\nAdd new Medicines                      "+(char)(10010)+" (Press 2)\nDelete Medicines                       "+(char)(9940)+" (Press 3)\nIncrease the Quantity of a Medicine    "+(char)(10010)+" (Press 4)\nDecrease the Quantity of a Medicine    "+(char)(9940)+" (Press 5)\nChange the M.R.P. of a Medicine        "+(char)(9997)+" (Press 6)\nChange the Batch No. of a Medicine     "+(char)(9997)+" (Press 7)\nGo Back                                "+(char)(10145)+" (Press 8)");
                        int ch3=a.nextInt();
                        switch(ch3)
            {case 1:char dn='Y';
                    a.nextLine();
                    while(dn=='Y')
                    {
                    System.out.print("Enter the Name of Medicine to be Searched : ");
                    String sname=a.nextLine();int nf=0;
                    for(i=0;i<=no;i++)
                    {
                    if(med1[i].equalsIgnoreCase(sname))
                    {
                    System.out.println("       FOUND !!!");
                    System.out.println("\nName : "+med1[i]);
                    System.out.println("Batch No. : "+bno[i]);
                    System.out.println("Quantity : "+quant[i]);
                    System.out.println("Manufacture Date : "+mfg[i]);
                    System.out.println("Expiration Date : "+exp[i]);
                    System.out.println("M.R.P. : Rs. "+mrp[i]);
                    nf++;
                    }
                    }
                    if(nf==0)
                    System.out.println("\nMedicine "+sname+" NOT FOUND");
                    System.out.print("\nDo you want to search again (Y/N) : ");
                    dn=Character.toUpperCase(a.next().charAt(0));
                    }
                    System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                    cq=Character.toLowerCase(a.next().charAt(0));
                    break;
             case 2:do{
                       String t="",t3="",t4="",t5="";double t1=0.0;
                       int pos=0,t2=0;
                       a.nextLine();
                       System.out.print("Enter the Name of the new medicine : ");
                       String medi=a.nextLine().trim();
                       System.out.print("Enter the M.R.P. : Rs. ");
                       double mrp1=a.nextDouble();
                       System.out.print("Enter the Quantity : ");
                       int quant1=a.nextInt();
                       a.nextLine();
                       System.out.print("Enter the Batch No. : ");
                       String bno1=a.nextLine().trim().toUpperCase();
                       System.out.print("Enter the Manufacturing Date (MM/YYYY): ");
                       String mfg1=a.nextLine();
                       if(mfg1.length() != 7 || date.parse(mfg1).after(date.parse(am.Month_Year())))
                       { label :
                         while(mfg1.length()!=7 || date.parse(mfg1).after(now))
                        {
                           if(mfg1.length() != 7)
                           {System.out.println("You've entered an Invalid Manufacturing Date\nCheck the spaces or slashes('/')");
                           System.out.println("Please enter a Valid Manufacturing Date (MM/YYYY) : ");
                           mfg1=a.nextLine();
                           continue label;}
                           if(date.parse(mfg1).after(now))
                           {System.out.println(medi+" will be manufactured in the future");
                            System.out.println("Please enter a Valid Manufacturing Date (MM/YYYY) : ");
                            mfg1=a.nextLine();
                            continue label;}
                        }
                       }
                       System.out.print("Enter the Expiration Date (MM/YYYY): ");
                       String exp1=a.nextLine();
                       if(exp1.length() != 7 || date.parse(exp1).before(date.parse(am.Month_Year())))
                       { label :
                         while(exp1.length()!=7 || date.parse(exp1).before(now))
                        {
                           if(exp1.length() != 7)
                           {System.out.println("You've entered an Invalid Manufacturing Date\nCheck the spaces or slashes('/')");
                           System.out.println("Please enter a Valid Manufacturing Date (MM/YYYY) : ");
                           exp1=a.nextLine();
                           continue label;}
                           if(date.parse(exp1).before(now))
                           {System.out.println(medi+" is expired");
                            System.out.println("Please enter a Valid Manufacturing Date (MM/YYYY) : ");
                            exp1=a.nextLine();
                            continue label;}
                        }
                       }
                       String ab="";
                       System.out.print("Are you sure you want to ADD "+medi+" to the Stock (Y/N) : ");
                       char cb=Character.toLowerCase(a.next().charAt(0));
                       if(cb=='y')
                      {
                          for(i=no;i>=pos;i--)
                          {
                              med1[i+1]=med1[i];
                              mrp[i+1]=mrp[i];
                              quant[i+1]=quant[i];
                              exp[i+1]=exp[i];
                              mfg[i+1]=mfg[i];
                              bno[i+1]=bno[i];
                          }
                       med1[pos]=medi;
                       mrp[pos]=mrp1;
                       quant[pos]=quant1;
                       exp[pos]=exp1;
                       mfg[pos]=mfg1;
                       bno[pos]=bno1;
                       no++;
                       ab=med1[pos];
                       for(i=0;i<no;i++)
                       {
                           for(j=0;j<(no-i);j++)
                           {
                               if(med1[j].compareTo(med1[j+1])>0)
                               {
                                   t=med1[j];
                                   t1=mrp[j];
                                   t2=quant[j];
                                   t3=exp[j];
                                   t4=mfg[j];
                                   t5=bno[j];
                                   med1[j]=med1[j+1];
                                   mrp[j]=mrp[j+1];
                                   quant[j]=quant[j+1];
                                   exp[j]=exp[j+1];
                                   mfg[j]=mfg[j+1];
                                   bno[j]=bno[j+1];
                                   med1[j+1]=t;
                                   mrp[j+1]=t1;
                                   quant[j+1]=t2;
                                   exp[j+1]=t3;
                                   mfg[j+1]=t4;
                                   bno[j+1]=t5;
                                }
                           }     
                      } 
                    }
                       if(cb!='y')
                       break;
                       System.out.println("\f");
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       System.out.println("\nMedicine "+ab+" added");
                       System.out.print("\nDo you want to add another medicine (Y/N) : ");
                       c1=Character.toUpperCase(a.next().charAt(0));
                       }while(c1=='Y');
                      System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                      cq=Character.toLowerCase(a.next().charAt(0));
                      break;
                case 3:int is=0;char ch4='Y';
                       h1:
                       do{
                       System.out.println("\f");
                       if(no<0)
                       {
                           System.out.println("You cannot Delete anymore Medicines");
                           break;
                        }
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       System.out.println();
                       if(is>0)
                       System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                       System.out.print("\nEnter the Serial Number of the Medicine to be Deleted : "); 
                       int pos=a.nextInt();
                       while(pos>no+1 || pos<=0)
                       {
                       is++;
                       continue h1;
                       }
                       String ab="";
                       ab=med1[pos-1];
                       pos=pos-1;
                       for(i=pos+1;i<=no;i++)
                       {med1[i-1]=med1[i];
                        mrp[i-1]=mrp[i];
                        mfg[i-1]=mfg[i];
                        exp[i-1]=exp[i];
                        bno[i-1]=bno[i];
                        quant[i-1]=quant[i];}
                        no--;
                        System.out.println("\f");
                        am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       System.out.println("\nMedicine "+ab+" deleted");
                        System.out.print("Do you want to delete another medicine (Y/N) : ");
                        ch4=Character.toUpperCase(a.next().charAt(0));}while(ch4=='Y');
                       System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                       cq=Character.toLowerCase(a.next().charAt(0));
                       break;
                case 4:char cv1='y';is=0;
                       h1:
                       do{
                       System.out.println("\f");
                       if(no<0)
                       {
                           System.out.println("No Medicines are available");
                           break;
                        }
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       if(is>0)
                       System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                       int dno;
                       System.out.print("Enter the Serial No. of the Medicine whose Quantity you want to increase : ");
                       dno=a.nextInt();
                       while(dno>no+1 || dno<=0)
                       {
                       is++;
                       continue h1;
                       }
                       dno=dno-1;
                       System.out.print("How many "+med1[dno]+" do you want to Add : ");
                       int quantadd=a.nextInt();
                       a.nextLine();
                       System.out.print("Are you sure you want to ADD "+quantadd+" Units of "+med1[dno]+" (Y/N) : ");
                       char cb=Character.toLowerCase(a.next().charAt(0));
                       if(cb=='y')
                       quant[dno]=quant[dno]+quantadd;
                        if(cb!='y')
                       break;
                       System.out.println("\f");
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       System.out.println("\n"+quantadd+" Units of "+med1[dno]+" Added");
                       System.out.print("\nDo you want to Increase the Quantity of some other Medicine (Y/N) : ");
                       cv1=Character.toLowerCase(a.next().charAt(0));
                       }while(cv1=='y');
                       System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                       cq=Character.toLowerCase(a.next().charAt(0));
                       break;
                case 5:cv1='y';is=0;
                       h1: 
                       do{
                           System.out.println("\f");
                           if(no<0)
                       {
                           System.out.println("No Medicines are available");
                           break;
                        }
                           am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                           if(is>0)
                           System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                           int dno;
                           System.out.print("Enter the Serial No. of the Medicine whose Quantity you want to decrease : ");
                           dno=a.nextInt();
                           while(dno>no+1 || dno<=0)
                           {
                           is++;
                           continue h1;
                           }
                           dno=dno-1;
                           System.out.print("How many "+med1[dno]+" do you want to Delete : ");
                           int quantdel=a.nextInt();
                           a.nextLine();
                           System.out.print("Are you sure you want to DELETE "+quantdel+" Units of "+med1[dno]+" (Y/N) : ");
                           char cb=Character.toLowerCase(a.next().charAt(0));
                           if(cb=='y')
                           quant[dno]=quant[dno]-quantdel;
                           if(cb!='y')
                           break;
                           System.out.println("\f");
                           am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                           System.out.println("\n"+quantdel+" Units of "+med1[dno]+" Deleted");
                           System.out.print("\nDo you want to Decrease the Quantity of some other Medicine (Y/N) : ");
                           cv1=Character.toLowerCase(a.next().charAt(0));
                          }while(cv1=='y');
                           System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                           cq=Character.toLowerCase(a.next().charAt(0));
                          break;
                case 6:char cv='y';is=0;
                       h1:
                       do{
                           System.out.println("\f");
                           if(no<0)
                       {
                           System.out.println("No Medicines are available");
                           break;
                        }
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                       if(is>0)
                       System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                       System.out.println("Enter the Serial No. of the medicine whose M.R.P. you want to change : ");
                       int dno=a.nextInt();
                       while(dno>no+1)
                       {
                       is++;
                       continue h1;
                       }
                       dno=dno-1;
                       double pmrp=mrp[dno];
                       System.out.println("Enter the new M.R.P. of "+med1[dno]+" : Rs. ");
                       double nmrp=a.nextDouble();
                        a.nextLine();
                       System.out.print("Are you sure you want to change the M.R.P. of "+med1[dno]+" (Y/N) : ");
                       char cb=Character.toLowerCase(a.next().charAt(0));
                       if(cb=='y')
                       mrp[dno]=nmrp;
                       if(cb!='y')
                       break;
                       System.out.println("\f");
                       am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                        System.out.println("\nM.R.P. of "+med1[dno]+" changed from Rs. "+pmrp+" to Rs. "+nmrp);
                        System.out.print("\nDo you want to change the M.R.P. of some other Medicine (Y/N) : ");
                        cv=Character.toLowerCase(a.next().charAt(0));
                        }while(cv=='y');
                       System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                       cq=Character.toLowerCase(a.next().charAt(0));
                        break;
                case 7:char cvx='y';is=0;
                       h1:
                       do{
                           System.out.println("\f");
                           if(no<0)
                       {
                           System.out.println("No Medicines are available");
                           break;
                        }
                           am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                           if(is>0)
                           System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                           System.out.println("Enter the Serial No. of the medicine whose M.R.P. you want to change : ");
                           int dno=a.nextInt();
                           while(dno>no+1)
                           {
                           is++;
                           continue h1;
                           }
                           dno=dno-1;
                           String pbno=bno[dno];
                           a.nextLine();
                           System.out.println("Enter the new Batch No. of "+med1[dno]+" : ");
                           String nbno=a.nextLine().trim().toUpperCase();
                           System.out.print("Are you sure you want to change the Batch No. of "+med1[dno]+" (Y/N) : ");
                           char cb=Character.toLowerCase(a.next().charAt(0));
                           if(cb=='y')
                           bno[dno]=nbno;
                           if(cb!='y')
                           break;
                           System.out.println("\f");
                           am.Stock(no,med1,quant,mfg,exp,mrp,bno);
                           System.out.println("\nBatch No. of "+med1[dno]+" changed from "+pbno+" to "+nbno);
                           System.out.print("\nDo you want to change another Medicine's Batch No. (Y/N) : ");
                           cvx=Character.toLowerCase(a.next().charAt(0));
                         }while(cvx=='y');
                           System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                           cq=Character.toLowerCase(a.next().charAt(0));
                         break;
                  case 8:continue hii;
                 default:System.out.println("Invalid Choice");
                         System.out.print("\nDo you want to use View and Update Stock again (Y/N) : ");
                         cq=Character.toLowerCase(a.next().charAt(0));
                        }}while(cq=='y');
                 break;
              case 3: 
                      do{
                      if(bv!=0)
                      System.out.println("\f");bv=0;
                      System.out.println("What do you want to do:\nBook an appointment      "+(char)(10004)+""+(char)(10062)+" (Press 1)\nAdd a New Doctor         "+(char)(10010)+""+(char)(9937)+" (Press 2)\nCheck Booking            "+(char)(9944)+""+(char)(10003)+" (Press 3)\nView Doctors in Pharmacy   "+(char)(9937)+" (Press 4)\nGo Back                    "+(char)(10145)+" (Press 5)");
                      int ch01=a.nextInt();
                      char cho='y';
                      switch(ch01)
        {
            case 1:System.out.println("\fDoctors available today are : \n");
                   int is=0;
                   if(am.Day().equalsIgnoreCase("Monday"))
                   {
                    h1:
                    do{
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                    System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=mon-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(monday[i]))+" "+String.format("%-25s |",(monq[i])));
                    if(i==mon-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serail No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>mon || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+monday[sl]+"\n"+monday[sl]+" is available from "+mont[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = monday[sl];
                       time[no1] = mont[sl];
                       spec[no1] = monq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                   
                   if(am.Day().equalsIgnoreCase("Tuesday"))
                   {h1:
                    do{
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=tue-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(tuesday[i]))+" "+String.format("%-25s |",(tueq[i])));
                    if(i==tue-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>tue || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+tuesday[sl]+"\n"+tuesday[sl]+" is available from "+tuet[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = tuesday[sl];
                       time[no1] = tuet[sl];
                       spec[no1] = tueq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                    
                    if(am.Day().equalsIgnoreCase("Wednesday"))
                   {h1:
                    do{
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=wed-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(wednesday[i]))+" "+String.format("%-25s |",(wedq[i])));
                    if(i==wed-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>wed || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+wednesday[sl]+"\n"+wednesday[sl]+" is available from "+wedt[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = wednesday[sl];
                       time[no1] = wedt[sl];
                       spec[no1] = wedq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                    
                    if(am.Day().equalsIgnoreCase("Thursday"))
                   {h1:
                    do{   
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=thu-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(thursday[i]))+" "+String.format("%-25s |",(thuq[i])));
                    if(i==thu-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>thu || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+thursday[sl]+"\n"+thursday[sl]+" is available from "+thut[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = thursday[sl];
                       time[no1] = thut[sl];
                       spec[no1] = thuq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                   
                    if(am.Day().equalsIgnoreCase("Friday"))
                   {h1:
                    do{  
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=fri-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(friday[i]))+" "+String.format("%-25s |",(friq[i])));
                    if(i==fri-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>fri || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+friday[sl]+"\n"+friday[sl]+" is available from "+frit[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = friday[sl];
                       time[no1] = frit[sl];
                       spec[no1] = friq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                    
                    if(am.Day().equalsIgnoreCase("Saturday"))
                   {h1:
                    do{ 
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=sat-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(saturday[i]))+" "+String.format("%-25s |",(satq[i])));
                    if(i==sat-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>sat || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+saturday[sl]+"\n"+saturday[sl]+" is available from "+satt[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = saturday[sl];
                       time[no1] = satt[sl];
                       spec[no1] = satq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                    
                    if(am.Day().equalsIgnoreCase("Sunday"))
                   {h1:
                    do{  
                    System.out.println("\f ___________________________________________________________________");
                    System.out.println("|                                                                   |");
                    System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                    System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=sun-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(sunday[i]))+" "+String.format("%-25s |",(sunq[i])));
                    if(i==sun-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    if(is>0)
                    System.out.println("\nIncorrect Serial No.\nPlease enter the correct Serial No.");
                    System.out.print("\nEnter the Serial No. of the Doctor you prefer : ");
                    sl=a.nextInt();
                    while(sl>sun || sl<=0)
                    {
                    is++;
                    continue h1;
                    }
                    is=0;
                    sl=sl-1;
                    System.out.println("\fYou have chosen "+sunday[sl]+"\n"+sunday[sl]+" is available from "+sunt[sl]);
                    System.out.println("Do you want to book the appointment (Y/N) : ");
                    cz1=Character.toUpperCase(a.next().charAt(0));
                    if(cz1=='Y')
                    {    
                       uuid[no1] = am.UUID(6);
                       date01[no1] = am.Date1();
                       day[no1] = am.Day();
                       doca[no1] = sunday[sl];
                       time[no1] = sunt[sl];
                       spec[no1] = sunq[sl];
                       token[no1] = no1+1;
                       a.nextLine();
                       System.out.println("Enter Patient's Name : ");
                       pname[no1]=a.nextLine();
                       System.out.println("\f");
                       am.Token_Display(no1, token, uuid, doca, time, pname, spec, date01, day);
                       no1++;
                    }
                   System.out.print("\n\nDo you book another appointment (Y/N) : ");
                   cho=Character.toLowerCase(a.next().charAt(0));
                   }while(cho=='y');
                   }
                   System.out.print("Do you want to use Doctor again : ");
                   cz3=Character.toLowerCase(a.next().charAt(0));
                    break;
            case 2:a.nextLine();
                   System.out.print("Enter the New Doctor's Name : Dr. ");
                   String nname="Dr. "+a.nextLine().trim();
                   doc[docno] = nname;
                   System.out.print("Enter the New Doctor's Speciality : ");
                   String speciality=a.nextLine().trim();
                   spec[docno] = speciality;
                   qual[docno] = speciality;
                   System.out.print("How many days is he available : ");
                   int dayno = a.nextInt(),vd=-1;
                   h1:
                   for(i=0;i<dayno;i++)
                   { 
                     System.out.println("\fEnter the FIRST 2 LETTERS of the day(s)\n Example : For Monday enter Mo");
                     String dayav = a.next().toUpperCase().trim();
                     if(dayav.equalsIgnoreCase("MO"))
                     {monday[mon]=nname;mon++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      mont[monti]=a.nextLine();
                      if(mont[monti].length()>20 || mont[monti].length()<18)
                      {while(mont[monti].length()!=20 || mont[monti].length()!=19 || mont[monti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       mont[monti]=a.nextLine().trim();}}
                      monti++;vd++;
                      monq[monq1] = speciality;monq1++;
                     }
                     else if(dayav.equalsIgnoreCase("TU"))
                     {tuesday[tue]=nname;tue++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      tuet[tueti]=a.nextLine();
                      if(tuet[tueti].length()>20 || tuet[tueti].length()<18)
                      {while(tuet[tueti].length()!=20 || tuet[tueti].length()!=19 || tuet[tueti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       tuet[tueti]=a.nextLine().trim();}}
                      tueti++;vd++;
                      tueq[tueq1] = speciality;tueq1++;
                     }
                     else if(dayav.equalsIgnoreCase("WE"))
                     {wednesday[wed]=nname;wed++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      wedt[wedti]=a.nextLine();
                      if(wedt[wedti].length()>20 || wedt[wedti].length()<18)
                      {while(wedt[wedti].length()!=20 || wedt[wedti].length()!=19 || wedt[wedti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       wedt[wedti]=a.nextLine().trim();}}
                      wedti++;vd++;
                      wedq[wedq1] = speciality;wedq1++;
                     }
                     else if(dayav.equalsIgnoreCase("TH"))
                     {thursday[thu]=nname;thu++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      thut[thuti]=a.nextLine();
                      if(thut[thuti].length()>20 || thut[thuti].length()<18)
                      {while(thut[thuti].length()!=20 || thut[thuti].length()!=19 || thut[thuti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       thut[thuti]=a.nextLine().trim();}}
                      thuti++;vd++;
                      thuq[thuq1] = speciality;thuq1++;
                     }
                     else if(dayav.equalsIgnoreCase("FR"))
                     {friday[fri]=nname;fri++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      frit[friti]=a.nextLine();
                      if(frit[friti].length()>20 || frit[friti].length()<18)
                      {while(frit[friti].length()!=20 || frit[friti].length()!=19 || frit[friti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       frit[friti]=a.nextLine().trim();}}
                      friti++;vd++;
                      friq[friq1] = speciality;friq1++;
                     }
                     else if(dayav.equalsIgnoreCase("SA"))
                     {saturday[sat]=nname;sat++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      satt[satti]=a.nextLine();
                      if(satt[satti].length()>20 || satt[satti].length()<18)
                      {while(satt[satti].length()!=20 || satt[satti].length()!=19 || satt[satti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       satt[satti]=a.nextLine().trim();}}
                      satti++;vd++;
                      satq[satq1] = speciality;satq1++;
                     }
                     else if(dayav.equalsIgnoreCase("SU"))
                     {sunday[sun]=nname;sun++;
                      a.nextLine();
                      System.out.println("Enter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                      sunt[sunti]=a.nextLine();
                      if(sunt[sunti].length()>20 || sunt[sunti].length()<18)
                      {while(sunt[sunti].length()!=20 || sunt[sunti].length()!=19 || sunt[sunti].length()!=18)
                      {System.out.println("Invalid Timing Format. Check Spaces or Digits\nEnter the Timing when the Doctor is Available \nExample : 9:00 AM to 12:00 PM");
                       sunt[sunti]=a.nextLine().trim();}}
                      sunti++;vd++;
                      sunq[sunq1] = speciality;sunq1++;
                     }
                     else
                     {
                      System.out.println("Invalid Day\nPlease enter the Correct Day");
                      i--;
                      continue h1;
                     }
                   }
                   System.out.println(doc[docno]+" added\n");
                   System.out.println("Name : "+doc[docno]);
                   System.out.println("Speciality : "+spec[docno]);
                   docno++;
                   break;
            case 3:char czv;
                   do{
                   a.nextLine();
                   int q1=0;
                   System.out.println("\fEnter the Unique ID : ");
                   String uid=a.nextLine().toUpperCase().trim();
                   for(i=0;i<no1;i++)
                   {if(uuid[i].equals(uid))
                   {   System.out.println("\f");
                       System.out.println("                    FOUND !!!\n");
                       System.out.println(" ____________________________________________");
                       System.out.println("|                                            |");
                       System.out.println("|      "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"        |");
                       System.out.println("|                                            |");
                       System.out.println("|           Phone No. "+(char)(9742)+" : 2229154           |");
                       System.out.println("|____________________________________________|");
                       System.out.println("|                                            |");
                       System.out.println("|               #"+String.format("%-2s",token[i])+" TOKEN                    |");
                       System.out.println("|____________________________________________|");
                       System.out.println("| Date : "+String.format("%-15s                     |",date01[i]));
                       System.out.println("| Day : "+String.format("%-9s                            |",day[i]));
                       System.out.println("| Unique ID : "+uuid[i]+"                         |");
                       System.out.println("| Doctor's Name : "+String.format("%-27s|",doca[i]));
                       System.out.println("| Speciality : "+String.format("%-25s     |",spec[i]));
                       System.out.println("| Patient's Name : "+String.format("%-26s|",pname[i]));
                       System.out.println("| Time : "+String.format("%-20s                |",time[i]));
                       System.out.println("|                                            |");
                       System.out.println("|  Please bring Token along for Appointment  |");   
                       System.out.println("|____________________________________________|");
                       q1++;
                   }
                   }
                   if(!(q1>=1))
                   System.out.println("Token not found");
                   
                   System.out.println("\n\nDo you want to check once again (Y/N) : ");
                   czv=Character.toUpperCase(a.next().charAt(0));
                   }while(czv=='Y');
                   System.out.print("\nDo you want to use Doctor again : ");
                   cz3=Character.toLowerCase(a.next().charAt(0));
                   break;
            case 4:bv=1;
                   System.out.println("\f ___________________________________________________________________");
                   System.out.println("|                                                                   |");
                   System.out.println("|                  "+(char)(9960)+" WELLNESS FOREVER PHARMACY "+(char)(9960)+"                   |");
                   System.out.println("|___________________________________________________________________|");
                   System.out.println("| Sl. No. |        Doctor's Name        |         Speciality        |");
                   System.out.println("|---------+-----------------------------+---------------------------|");
                   for(i=0;i<=docno-1;i++)
                   {System.out.println("|   "+String.format("%2d",(i+1))+".   | "+String.format("%-27s |",(doc[i]))+" "+String.format("%-25s |",(qual[i])));
                    if(i==docno-1)
                    System.out.println("|_________|_____________________________|___________________________|");
                    else
                    System.out.println("|---------+-----------------------------+---------------------------|");
                   }
                    System.out.print("\nDo you want to use Doctor again : ");
                   cz3=Character.toLowerCase(a.next().charAt(0));
                   break;
               case 5:  continue hii;
                   }   
        
              }while(cz3=='y');
                 break;
                 case 4:continue help;}
                 System.out.print("Do you want to use Pharmacy Management again (Y/N) : ");
                 v=Character.toUpperCase(a.next().charAt(0));
                 }
                break;
                            
        case 'B':char xz='Y';
                 a.nextLine();
                 hi:
                 do{
                 System.out.println("\f");
                 System.out.print("Enter the Date in this format (DD/MM/YYYY) : ");
                 String date0 = a.nextLine().trim();
                 String k1;
                 while(date0.length() <5)
                 {
                  System.out.println("You have entered the wrong Date format");
                  System.out.print("Enter the Date in this format (DD/MM/YYYY) : ");
                  date0 = a.nextLine();
                     }
                 if(date0.charAt(1)=='/')
                 k1 = date0.charAt(0)+"";
                 else if(date0.charAt(2)=='/')
                 k1 = date0.charAt(0)+""+date0.charAt(1);
                 else
                 {System.out.println("No such Date exists");
                  System.out.println("Please enter the correct Date");
                  continue hi;}
                 if((Integer.valueOf(k1))>31)
                 {System.out.println("No such Date exists");
                  System.out.println("Please enter the correct Date");
                  continue hi;}
                 String m1="";
                 if(date0.charAt(3)=='/')
                 m1 = date0.charAt(2)+"";
                 else if(date0.charAt(4)=='/' && date0.charAt(1)=='/')
                 m1 = date0.charAt(2)+""+date0.charAt(3);
                 else if(date0.charAt(4)=='/' && date0.charAt(2)=='/')
                 m1 = date0.charAt(3)+"";
                 else if(date0.charAt(5)=='/')
                 m1 = date0.charAt(3)+""+date0.charAt(4);
                 else
                 {System.out.println("No such Date exists");
                  System.out.println("Please enter the correct Date");
                  continue hi;}
                 if((Integer.valueOf(m1))>12)
                 {System.out.println("No such Date exists");
                  System.out.println("Please enter the correct Date");
                  continue hi;}
                 
                 Date date1 = new SimpleDateFormat("d/MM/yyyy").parse(date0);
                 int k = (int)(Math.abs(Integer.valueOf(new SimpleDateFormat("d").format(date1))));
                 int m = (int)(Math.abs(Integer.valueOf(new SimpleDateFormat("M").format(date1))));
                 int y = (int)(Math.abs(Integer.valueOf(new SimpleDateFormat("YYYY").format(date1))));
                 int y1=y,count1=0,c2=0;
                 while(y1!=0)
                 {
                  if(y1%10==0)
                  {c2++;}
                  y1=y1/10;
                  count1++;
                 }
                 if(count1<=3 && Integer.valueOf(k1)==29 && Integer.valueOf(m1)==2)
                 {
                  if(y%4!=0)
                  {System.out.println("No such Date exists");
                   System.out.println("Please enter the correct Date");
                   continue hi;}
                 }
                 if(count1>3 && Integer.valueOf(k1)==29 && Integer.valueOf(m1)==2)
                 {if(c2>=2)
                 {if(y%100!=0 || y%400!=0)
                  {System.out.println("No such Date exists");
                   System.out.println("Please enter the correct Date");
                   continue hi;}}
                  if(c2<2)
                  {if(y%4!=0)
                  {System.out.println("No such Date exists");
                   System.out.println("Please enter the correct Date");
                   continue hi;}}
                 }
                 if(Integer.valueOf(k1)==31 && (Integer.valueOf(m1)==2 || Integer.valueOf(m1)==4 ||Integer.valueOf(m1)==6 ||Integer.valueOf(m1)==9 || Integer.valueOf(m1)==11))
                 {
                   System.out.println("No such Date exists");
                   System.out.println("Please enter the correct Date");
                   continue hi;
                 }
                 if(Integer.valueOf(k1)==30 && Integer.valueOf(m1)==2)
                 {
                   System.out.println("No such Date exists");
                   System.out.println("Please enter the correct Date");
                   continue hi;
                 }
                 int d=y%100;
                 c=y/100;int n=0;
                 if(m==3)
                 {m=1;}
                 else if(m==4)
                 {m=2;}
                 else if(m==5)
                 {m=3;}
                 else if(m==6)
                 {m=4;}
                 else if(m==7)
                 {m=5;}
                 else if(m==8)
                 {m=6;}
                 else if(m==9)
                 {m=7;}
                 else if(m==10)
                 {m=8;}
                 else if(m==11)
                 {m=9;}
                 else if(m==12)
                 {m=10;}
                 else if(m==1)
                 {m=11;d=d-1;}
                 else
                 {m=12;d=d-1;}
                 int x=k+((13*m-1)/5)+d+(d/4)+(c/4)-2*c;
                 int l,z=0;
                 if(x<0)
                 {for(i=1;i<=-x;i++)
                  {l=-7*i;
                  if(l<=x)
                 {z=7*i+x;
                   break;}}}
                 else
                 {z=x%7;}
                 if(z==0)
                 {System.out.println("Its a Sunday");}
                 else if(z==1)
                 {System.out.println("Its a Monday");}
                 else if(z==2)
                 {System.out.println("Its a Tuesday");}
                 else if(z==3)
                 {System.out.println("Its a Wednesday");}
                 else if(z==4)
                 {System.out.println("Its a Thursday");}
                 else if(z==5)
                 {System.out.println("Its a Friday");}
                 if(z==6)
                 {System.out.println("Its a Saturday");}
                 System.out.print("Do you want to know the Zodiac sign of this Date (Y/N) : ");
                 char bd = Character.toUpperCase(a.next().charAt(0));
                 if(bd=='Y')
              {  System.out.print("Your Zodiac Sign is : ");
                   if (Integer.valueOf(m1) == 1)
                 { 
                   if (Integer.valueOf(k1) < 20) 
                   System.out.println("Capricorn "+(char)(9809)); 
                   else
                   System.out.println("Aquarius "+(char)(9810)); 
                 }
                   else if (Integer.valueOf(m1) == 2)
                 { 
                   if (Integer.valueOf(k1) < 19) 
                   System.out.println("Aquarius "+(char)(9810)); 
                   else
                   System.out.println("Pisces "+(char)(9811)); 
                 } 
              
                   else if(Integer.valueOf(m1) == 3)
                 { 
                   if (Integer.valueOf(k1) < 21)  
                   System.out.println("Pisces "+(char)(9811)); 
                   else
                   System.out.println("Aries "+(char)(9800)); 
                 } 
                   else if (Integer.valueOf(m1) == 4)
                 { 
                   if (Integer.valueOf(k1) < 20) 
                   System.out.println("Aries "+(char)(9800)); 
                   else
                   System.out.println("Taurus "+(char)(9801)); 
                 } 
              
                   else if (Integer.valueOf(m1) == 5)
                 { 
                   if (Integer.valueOf(k1) < 21) 
                   System.out.println("Taurus "+(char)(9801)); 
                   else
                   System.out.println("Gemini "+(char)(9802)); 
                 } 
                   else if( Integer.valueOf(m1) == 6)
                 { 
                   if (Integer.valueOf(k1) < 21) 
                   System.out.println("Gemini "+(char)(9802)); 
                   else
                   System.out.println("Cancer "+(char)(9803)); 
                 } 
                   else if (Integer.valueOf(m1) == 7)
                 { 
                   if (Integer.valueOf(k1) < 23) 
                   System.out.println("Cancer "+(char)(9803)); 
                   else
                   System.out.println("Leo "+(char)(9804)); 
                 } 
                   else if( Integer.valueOf(m1) == 8)
                 { 
                   if (Integer.valueOf(k1) < 23)  
                   System.out.println("Leo "+(char)(9804)); 
                   else
                   System.out.println("Virgo "+(char)(9805)); 
                } 
                   else if (Integer.valueOf(m1) == 9)
                { 
                   if (Integer.valueOf(k1) < 23) 
                   System.out.println("Virgo "+(char)(9805)); 
                   else
                   System.out.println("Libra "+(char)(9806)); 
                } 
                   else if (Integer.valueOf(m1) == 10)
                { 
                   if (Integer.valueOf(k1) < 23) 
                   System.out.println("Libra "+(char)(9806)); 
                   else
                   System.out.println("Scorpio "+(char)(9807)); 
                } 
                    else if (Integer.valueOf(m1) == 11)
                {  if(Integer.valueOf(k1) == 30)
                   System.out.println("Ophiuchus "+(char)(9934)); 
                   else if (Integer.valueOf(k1) < 22) 
                   System.out.println("Scorpio "+(char)(9807)); 
                   else
                   System.out.println("Sagittarius "+(char)(9808)); 
                }
                  
                    else if (Integer.valueOf(m1) == 12)
                 { 
                   if (Integer.valueOf(k1) < 18)
                   System.out.println("Ophiuchus "+(char)(9934));   
                   else if (Integer.valueOf(k1) > 18 && Integer.valueOf(k1) < 22) 
                   System.out.println("Sagittarius "+(char)(9808)); 
                   else
                   System.out.println("Capricorn "+(char)(9809)); 
                 } 
            }
                 System.out.print("Do you want to use Day_Date again : ");
                 xz=Character.toUpperCase(a.next().charAt(0));a.nextLine();
             }while(xz=='Y');
        
             break;
            default:System.out.println("Invalid Choice");
            break;
            
   }
        }
    
 }
}
    