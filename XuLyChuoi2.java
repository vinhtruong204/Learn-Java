public class XuLyChuoi2 {
    public static void main(String[] args) {
        String s1 = "Vinh";
        String s2 = "Vinh";
        String s3 = "vinh";
        // Method equals() => phân biệt chữ hoa chữ thường khi so sánh
        System.out.println("Method equals(): ");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        // Method equalsIgnoreCase() => Không phân biệt chữ hoa chữ thường khi so
        System.out.println("Method equalsIgnoreCase(): ");
        System.out.println("s1 equals s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equals s3: " + s1.equalsIgnoreCase(s3));
        // Method compareTo() => So sánh >, <, =.
        String a = "Nguyen Van A";
        String b = "Nguyen Van B";
        String c = "Nguyen Van C";
        String d = "Nguyen Van C";
        System.out.println("Method compareTo(): ");
        System.out.println("a compareTo b: " + a.compareTo(b));
        System.out.println("a compareTo c: " + a.compareTo(c));
        System.out.println("b compareTo a: " + b.compareTo(a));
        System.out.println("c compareTo d: " + c.compareTo(d) + " equals");
        // Method compareToIgnoreCase() => So sánh không phân biệt hoa thường
        String e = "nguyen van c";
        System.out.println("Method compareToIgnoreCase(): ");
        System.out.println("c compareTo e: " + c.compareToIgnoreCase(e) + " equals");
        // Method regionMatches => so sánh một đoạn
        String r1 = "Vinh.vn";
        String r2 = "nh.v";
        System.out.println("Method regionMatches(): ");
        Boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println("r1 regionMatches r2: " + check);
    }
}