import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
