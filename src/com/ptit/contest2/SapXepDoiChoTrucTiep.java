import java.util.Scanner;

public class contest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k=1;
        for (int i = 0; i < n; i++) {
            int d = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                    d = 1;
                }
            }
            if (d == 1) {
                System.out.print("Buoc " + (k) + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println("");
                k++;
            }
        }
    }
}