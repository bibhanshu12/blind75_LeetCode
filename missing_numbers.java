import java.util.*;


//Use sum of n natural number formula;

class missing_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The missing No. is: "+ missingNo(arr));
    }

    public static int missingNo(int[] arr){
        if(arr.length<0){
            return 0;
        }
int initialSum=0;
int n=arr.length;
        for(int i =0;i<n;i++){
                initialSum+=arr[i];
        }

        int sum=(n*(n+1))/2;

        return sum-initialSum;

    }
    
}