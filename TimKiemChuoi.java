public class TimKiemChuoi {
    public static void main(String[] args) {
        String s1 = "Ong xin chao ba, xin chao co, xin chao chu";
        String s2 = "xin chao";
        String s3 = "lam sao";
        char c = 'x';

        // Method indexOf => Vị trí của chuỗi này trong chuỗi khác 
        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2)); // Tim kiem tu vi tri dau tien
        System.out.println("Vi tri cua s3 trong s1 la: " + s1.indexOf(s3)); // s1.indexOf(str, indexbegin)
        System.out.println("Vi tri cua s2 trong s1 bat dau tu vi tri thu 9: " + s1.indexOf(s2, 9));

        // Method indexOf (char)
        System.out.println("Vi tri cua x trong chuoi s1 la: " + s1.indexOf(c)); // Tim kiem tu dau
        System.out.println("Vi tri cua x trong chuoi s1  tru vi tri thu 20 la: " + s1.indexOf(c, 20)); // Tim kiem tu vi tri thu 20
        
        // Method lastIndexOf => Tim kiem tu cuoi len dau
        System.out.println("Vi tri cua s2 trong s1 tu phai sang trai la: " + s1.lastIndexOf(s2)); // Tim kiem tu cuoi 
        System.out.println("Vi tri cua s2 trong s1 tu phai sang trai tu vi tri thu 9 la: " + s1.lastIndexOf(s2, 9)); // Tim kiem tu vi tri thu 9 len dau
        

    }
}