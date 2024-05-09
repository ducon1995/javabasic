package Bai2.bien;

public class SinhVien {
    //Bien Toan Cuc
    static int weight = 72;
    public int age = 10;

    public void sayHello(){
        int n = 100000;
        String status = "200";
//        System.out.println("Chỉ số sức mạnh:" +n);
//        System.out.printf("status:"+status);
    }

    public static void main(String[] args) {
         String name = "Demon King";
        String job = "Techcombank sucvat";
        int age = 50;
//        System.out.println("Danh Hiệu:"+name);
//        System.out.println(job);
//        System.out.println("Tuổi:"+age);
//        System.out.println("Cân nặng:"+weight);

        SinhVien bienlocal = new SinhVien();
        bienlocal.sayHello();
        
    }
}

