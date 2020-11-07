import java.util.Scanner;

public class XapXepNoiBot {

    public static void xapXep(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int c=0;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    c = 1;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (c == 1) {
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int z = 0; z < n; z++) {
                    System.out.print(a[z] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n + 5];
        for (int i = 0; i < n; i++) {

            a[i] = s.nextInt();

        }
        xapXep(a, n);
    }
}