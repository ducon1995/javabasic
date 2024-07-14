package bai7;

public class DieuKienIfElseIf {
    public static void main(String[] args) {

        double DTB = 4;
        if (DTB >= 8) {
            System.out.println("Giỏi");
        } else if (DTB >= 6.5 && DTB < 8) {
            System.out.println("Khá");
        } else if (DTB >=5 && DTB < 6.5) {
            System.out.println("Trung Bình");
        }else {
            System.out.println("Yếu");
        }
    }
}
