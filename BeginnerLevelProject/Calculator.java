package BeginnerLevelProject;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Game Format
        System.out.println();
        System.out.println("=====================");
        System.out.println("   Java Calculator");
        System.out.println("=====================");
        System.out.println();
        System.out.println("[1]. Addition");
        System.out.println("[2]. Subtraction");
        System.out.println("[3]. Multiplication");
        System.out.println("[4]. Division");
        System.out.println("[5]. Modulus");
        System.out.println();

        // taking input
        System.out.print("Select a number, what operations you want to perform: ");
        int op=sc.nextInt();
        System.out.println();
        System.out.print("Enter First Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2=sc.nextInt();
        int result=0;
        switch (op) {
            case 1:{
                result=n1+n2;
                System.out.println("Your result : "+n1+"+"+n2+"="+result);
                break;
            }
            case 2:{
                result=n1-n2;
                System.out.println("Your result : "+n1+"-"+n2+"="+result);
                break;
            }
            case 3:{
                result=n1*n2;
                System.out.println("Your result : "+n1+"x"+n2+"="+result);
                break;
            }
            case 4:{
                result=n1/n2;
                System.out.println("Your result : "+n1+"/"+n2+"="+result);
                break;
            }
            case 5:{
                result=n1%n2;
                System.out.println("Your result : "+n1+"%"+n2+"="+result);
                break;
            }
            default:{
                System.out.println("OOPs!, You entered Invalid number Please Try again.");
                break;
            }
        }
    }
}
