package basic;

import java.util.Scanner;

public class trafficlightsystem {
    public static void main(String []args){
        char light;
        System.out.println("Enter traffic light color (R=red , Y=yellow, G=green) :");
        Scanner sc=new Scanner(System.in);
        light=sc.next().charAt(0);
        switch (light) {
            case 'R':
            System.out.println("Stop");
            break;
            case 'Y':
            System.out.println("Ready to go");
            break;
            case 'G':
            System.out.println("GO");
            break;
            default:
            System.out.println("Invalid input, Enter R,Y and G");
                break;
        }
    }
    
}
