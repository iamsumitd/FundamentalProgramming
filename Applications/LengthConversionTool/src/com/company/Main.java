//*IMPORTANT QUE: 1. Why did I have to initialize variables/use the data types before the variables in the methods when I had already defined them in the Main method?
//                2. Why it wasn't needed to pass parameters in the constructors when methods were called?
// Please answer the question below here....or should I come to you directly? Thanks.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Conversion tool.

        Main myApp = new Main();
        Scanner input = new Scanner(System.in);
        double m, f;
        double mil, kilo;
        int a;


        do {
            System.out.println("|-----Welcome to the Conversion Tool-----|");
            System.out.println("|           Choose an option...          |");
            System.out.println("|                                        |");
            System.out.println("|1. METER to FOOT                        |");
            System.out.println("|2. FOOT to METER                        |");
            System.out.println("|3. MILES to KILOMETERS                  |");
            System.out.println("|4. KILOMETERS to MILES                  |");
            System.out.println("|5. EXIT                                 |");
            System.out.println("|----------------------------------------|");

            a = input.nextInt();

            switch (a) {

                case 1:
                    System.out.println("Enter the value in meters(m) = ");
                    m = input.nextDouble();
                    f = myApp.meter_to_feet(m);
                    System.out.println("Conversion: "+m+" meters = "+f+" feet");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the value in foot(f) = ");
                    f = input.nextDouble();
                    m = myApp.feet_to_meter(f);
                    System.out.println("Conversion: "+f+" foot = "+m+" meters");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter the value in Miles(mil) = ");
                    mil = input.nextDouble();
                    kilo = myApp.mile_to_kilo(mil);
                    System.out.println("Conversion: "+mil+" miles = "+kilo+" kilometers");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter the value in Kilo(Kilo) = ");
                    kilo = input.nextDouble();
                    mil = myApp.kilo_to_mil(kilo);
                    System.out.println("Conversion: "+kilo+" kilometers = "+mil+" miles");
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
            }

        }while (a != 6);
    }

    private double meter_to_feet ( double m){

        double f = (m) * 3.33;
        return f;
    }
    private double feet_to_meter ( double f){

        double m = (f) / 3.33;
        return m;
    }
    private double mile_to_kilo (double mil){

        double kilo = (mil)/0.62137;
        return kilo;
    }
    private double kilo_to_mil (double kilo){

        double mil = (kilo)*0.62137;
        return mil;
    }
}
