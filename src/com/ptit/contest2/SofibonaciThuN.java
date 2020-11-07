import java.util.Scanner;

public class T208 {

    public static Scanner sc;
    public static int n;
    public static long mod = 1000000007;


    public static class MATRIX {
        long[][] a = new long[3][3];

        public MATRIX() {
            a[0][0] = 0;
            a[0][1] = a[1][0] = a[1][1] = 1;
        }
    }

    public static MATRIX xMaTrix(MATRIX a, MATRIX b) {
        MATRIX res = new MATRIX();
        for (int i = 0; i <= 1; i++)
            for (int j = 0; j <= 1; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k <= 1; k++)
                    res.a[i][j] = (res.a[i][j] + a.a[i][k] * b.a[k][j]) % mod;
            }
        return res;
    }

    public static MATRIX power(MATRIX a, long b) {
        if (b == 1) return a;
        MATRIX temp = power(a, b / 2);
        temp = xMaTrix(temp, temp);
        if (b % 2 == 1) {
            temp = xMaTrix(temp, a);
        }
        return temp;
    }

    public static void xuli() {
        n = sc.nextInt();
        MATRIX matrix = new MATRIX();
        matrix = power(matrix, n);
        System.out.println(matrix.a[0][1]);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int sotest = sc.nextInt();
        while (sotest-- > 0) {
            xuli();
        }
    }
}