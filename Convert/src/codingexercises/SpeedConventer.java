package codingexercises;

import java.util.Scanner;

public class SpeedConventer {
    static Scanner tara=new Scanner(System.in);

    public static void main(String[] args) {
        boolean active=true;
        while (active){
            System.out.println("Enter a double value to transform miles,to exit button 0");
            double result=tara.nextDouble();
            if (result==0){
                active=false;
                break;
            }

            long a=toMilesPerHour(result);
            printConversion(result);


        }


    }

    private static void printConversion(double result) {
        double con=(result/1.609);
        if (result<0){
            System.out.println("Invalid");
        }else {
            System.out.println("km/h"+result + " mi/h " +Math.round(con));
        }
    }

    private static long toMilesPerHour(double result) {
        if (result<0) {
            return -1;
        }else {
            double con=(result/1.60934);
            return Math.round(con);
        }
    }

}
