import java.util.Scanner;

public class XuLyChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String s = sc.nextLine();
        sc.close();
        System.out.print("Chuoi vua nhap:");
        System.out.println(s);
        // Method length()
        System.out.println("Do dai chuoi: " + s.length());
        // Method charAt();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Ki tu tai vi tri " + (i + 1) + " la: " + s.charAt(i));
        }
        // Method getChars()
        char[] getChars = new char[40];
        s.getChars(2, 4, getChars, 0);
        System.out.println(getChars);
        for (int i=0;i<4-2;i++)
            System.out.println("Ki tu tai vi tri " + (i + 1) + " la: " + getChars[i]);
        // Method getBytes()
        byte[] getBytes = s.getBytes();
        for (byte x : getBytes)
            System.out.println(x);

    }
}
