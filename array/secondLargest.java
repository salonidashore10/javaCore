package array;
import java.util.*;

public class secondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // largest element
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("Largest element : "+largest);

        // second largest element
        int secLarg=arr[0];
        for(int i=0;i<n;i++){
            if(secLarg<arr[i] && arr[i]<largest){
                secLarg=arr[i];
            }
        }
        System.out.println("Second Largest element : "+secLarg);
    }
}
