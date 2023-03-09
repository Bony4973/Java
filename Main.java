public class Main {
    public static void main(String[] args) {
        Engine eng = new Engine(1960);
        DashBoard db= new DashBoard(194.9);
        Volvo v=new Volvo(12662337.15,"2023", "RAJ4973",eng,db);
        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        System.out.println();
        v.model="SUV. XC90";
        v.companyName="Volvo";
        System.out.println("The name of the car company is : " + v.companyName);
        System.out.println("Model of the car is: " + v.model);
        System.out.println("Price of the car is : " + v.price);
        System.out.println("The production year of the car is : " + v.productionYear);
        System.out.println("The registration number of the car is : " + v.registrationNumber);
        System.out.println("The capacity of the engine is :" + eng.capacity);
        System.out.println("The size of The dashboard is : " + db.size);
    }
}