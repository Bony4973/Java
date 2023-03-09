public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo(01, "BOnpara", "Rajshahi", "6430");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 221);
        Employee emp=new Employee("Md. Kholilur Rahman Rabby",addressInfo, insuranceInfo );
        emp.display();
    }
}