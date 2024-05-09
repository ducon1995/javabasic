package bai5;

public class Array {
    public static void main(String[] args) {
        int mang1[] = new int[10];// khai báo và khởi tạo mảng
        //gán giá trị cho phần tử trong mảng
        mang1[0] = 4;
        mang1[1] = 6;
        mang1[2] = 10;

        //System.out.println(mang1[1]);
        //Duyệt phần tử trong mảng
        //DÙng vòng lặp for đn giản hoặc for cải tiến
        for (int i: mang1) {
            System.out.println(i);
        }
        String menu[] = {"home", "Employees", "Core HR", "Project"};
        for (String name :menu){
            System.out.println(name);
        }
    }
}
