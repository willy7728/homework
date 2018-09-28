import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入月份:");
        int v1 = scn.nextInt();
        if (v1 >= 3 && v1 <= 5){
            System.out.println("Spring");
        }else if (v1 >= 6 && v1 <= 8 ){
            System.out.println("Summer");
        }else if (v1 >= 9 && v1 <= 11){
            System.out.println("Autumn");
        }else if (v1<=12){
            System.out.println("Winter");
        }
    }
}
