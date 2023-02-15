public class XuLyChuoi4 {
    public static void main(String[] args) {
        String s1 = "Vinh.com";
        String s2 = ".vn";
        // Concat() => Noi chuoi
        String s3 = s1.concat(s2);
        System.out.println("s3 = s1 + s2 = " + s3);
        // replaceAll() => Thay the
        String s4 = s1.replaceAll(".com", ".vn");
        System.out.println("s4 = " + s4 + " (Replace .com -> .vn)");
        // toLowerCase() => Chuyen chu viet thuong
        // toUpperCase() => Chuyen chu viet hoa
        String s5 = s1.toLowerCase();
        String s6 = s1.toUpperCase();
        System.out.println("s5 = " + s5 + " (toLowerCase)");
        System.out.println("s6 = " + s6 + " (toUpperCase)");
        // trim() => Xoa khoang trang du thua o dau, cuoi chuoi
        String s7 = "         Xin Chao                              ";
        System.out.println("s7 = s7.trim() = " + s7.trim());
        // substring
        String s8 = "1234567890";
        String s9 = s8.substring(0);
        String s10 = s8.substring(3, 7);
        System.out.println("s9 = " + s9 + " = s8.substring(0)");
        System.out.println("s10 = " + s10 + " = s8.substring(3, 7)");
    }
}