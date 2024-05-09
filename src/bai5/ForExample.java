package bai5;

public class ForExample {
    public static void main(String[] args) {
        for (int i = -10; i < 20; i = i + 1) {
            System.out.println(i + " Dep Trai");
        }
        int arr[] = {12, 23 ,44 ,56 ,78, 90, 7};
//        //for (int o : arr) {
//            System.out.println(o);
        for (int o = 0; o < 7; o++) {
            System.out.println(arr[o]);
        }

    }
}
