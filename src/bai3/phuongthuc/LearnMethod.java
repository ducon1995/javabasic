package bai3.phuongthuc;

public class LearnMethod {
    public void showinfo(){
        System.out.println("Automation Test");
        System.out.println("Selenium Java");

    }
    private static String getName(){
        String shit = "SeleniumV";
        return shit;
    }
    protected void displayInfor(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod();
        obj.showinfo();
        getName();
        obj.displayInfor("Viet",29);
        obj.displayInfor("Lord",30);
        System.out.println(getName());
    }
}
