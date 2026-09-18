package array;
public class sumofMaxMinele {
    public static void main(String[] args) {
        int[] arr={2,1,8,4,5};
        int n=arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i] && max!=arr[i]){
                max=arr[i];
            }
            if(min>arr[i] && min!=arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);

        System.out.println("Sum : "+(max+min));
    }
}
