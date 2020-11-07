import java.util.Scanner;

public class contest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }


        int buoc =1;

        for (int i = 0; i < n-1 ; i++) {
           int min = arr[i];

            for (int j = i+1; j < n ; j++)
                if (arr[j] < min)  min = arr[j];

            for (int j = i+1; j < n; j++)
                if (arr[j] == min) DoiCho(arr,i,j);

                System.out.print("Buoc "+buoc+": ");
                for (int ii = 0; ii <n ; ii++) {
                    System.out.print(arr[ii]+" ");
                }
                buoc++;
                System.out.println("\n");

            
        }
        
        
    }

    public static void DoiCho(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}