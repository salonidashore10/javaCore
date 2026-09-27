package basic;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int rev=0;
        int palindrome=n;
        while (n!=0) {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println("Reversed number = "+rev);
        if(palindrome==rev){
            System.out.println("Palindrome number!");
        }
        else{
            System.out.println("Not a Palindrome number!");
        }
    }
}
