import java.util.*;
import java.text.SimpleDateFormat;


public class AgeCalc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date today=new Date();
        System.out.println(today);
        //for todays details saving
        System.out.println("please fill todays details😅: ");
        System.out.println("Day like (1 2 10 30): ");
        int Td=sc.nextInt();
        System.out.println("Month like(1,5,12): ");
        int Tm=sc.nextInt();
        System.out.println("year(like 2000 2020): ");
        int Ty=sc.nextInt();

        System.out.println("please fill below infomation of your date of birth and press enter:");
        //for day insertation
        System.out.println("Day like (1 2 10 30): ");
        int d=sc.nextInt();
        //for month insertation
        System.out.println("Month like(1,5,12): ");
        int m=sc.nextInt();
        //for year insertation
        System.out.println("year(like 2000 2020): ");
        int y=sc.nextInt();

       //now logic
       int Ay;
       int Am;
       int Ad;
       //first for age in years
       if(m<=Tm){
           Ay=Ty-y;
       }
       else{
            Ay=Ty-y-1;
       }

       //now for month
       Am=0;
       if(Tm>=m&& Td>=d){
         Am=Tm-m;
       }
       else if(Tm>=m&&Td<d){
           Am=Tm-m-1;
       }
       else if(Tm<m&&Td>=0){
         Am=12-m+Tm;
       }
       else if(Tm<m&&Td<d){
       Am=11-m+Tm;
       }
      Ad=0;
       //now for age days
        if(Td>=d){
            Ad=Td-d;
        }
        else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12 && Td<d){
         Ad=31-d+Td;
        }
        else if(m==4||m==6||m==9||m==11 && Td<d){
            Ad=30-d+Td;
        }
        else if(m==2&&Td<d&&y%4==0){
         Ad=29-d+Td;
        }
        else if(m==2&&Td<d&&y%4!=0){
            Ad=28-d+Td;
        }

        //now print the values
        
        System.out.println("youre info: ");
        System.out.println("age: "+Ay);
        System.out.println("months crossed: "+Am);
        System.out.println("days crossed: "+Ad);
    }
}