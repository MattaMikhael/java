package com.company;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input =new java.util.Scanner(System.in);
        int g=0;
        int position = 0;
        System.out.println("please enter a year from 1901 ");
        int year =input.nextInt();
        while(year<1901)
        {
            System.out.println("please enter correct number ");
            year =input.nextInt();
        }
        if (year%4==0)g=29;else g=28;
        System.out.println("please enter the month ");
        int month =input.nextInt();
        int firstday =2;
        long  sum=0;

        String [ ] months = {"January","February","March", "April","May","June","July","Augest","Septemper","October","November","December"};
        int [ ] days_of_months = {31,g,31,30,31,30,31,31,30,31,30,31};
        for (int i=1901;i<year;i++){
            if((i)%4==0)sum=366+sum; else sum=365+sum;}
        sum-=1;
        for(int y=0;y<=sum%7;y++){
            firstday+=1;
            if(firstday==7)firstday=0;}

        for(int i=0;i<12;i++)

        {if(i>=0&&i<=(month-1)){
            int m=1;
            if( i==month-1){
                System.out.println("\t\t     "+months[i]+" "+year);
                System.out.println("________________________________________________________");
                System.out.println("Sun      Mon      Tue      Wed      Thu      Fri      Sat");
            }
            if(i==0){
                // System.out.print(" ");
                if( i==month-1){for(int j=0;j<firstday;j++)    System.out.print("         ");
                    System.out.print("1");}
                for(int k=2;k<8-firstday;k++) {  if( i==month-1){ System.out.print("        "+k);} m=k;}
                if(firstday==6) m=1;
                if( i==month-1){ System.out.println();}}
            else {
                //System.out.print(" ");
                if( i==month-1){for(int j=0;j<position+1;j++)    System.out.print("         ");
                    System.out.print("1");}
                for(int k=2;k<7-position;k++) {if( i==month-1){   System.out.print("        "+k);} m=k;}
                if(position==5) m=1;
                if( i==month-1){ System.out.println();}};



//   System.out.print(" ");
            for(int y=0;y<5;y++){

                for(int x=0;x<7;x++){


                    m+=1;
                    if( i==month-1){ System.out.print(m+"       ");
                        if(y==0&&m<10)System.out.print(" ");
                    }


                    if(days_of_months[i]== m){if(x==6) position=-1; else position=x ; break;}


                } if(days_of_months[i]== m){ break;}
                if( i==month-1){System.out.println(); }

            }
            if( i==month-1){
                System.out.println();
                System.out.println();}
        }



        }}

}
