import java.util.Scanner;
public class Vechile {
    public void run(){
        String v="This vechile is running";
        System.out.println(v);
    }
    int speed;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Vechile v1=new Vechile();
        v1.run();
        System.out.println();
        Bike a1=new Bike();
        Car b1=new Car();
        System.out.println("Enter the speed of the bike:");
        a1.run(in.nextInt());
        System.out.println();
        System.out.println("Enter the speed of the car");
        b1.run(in.nextInt());
    }
  }