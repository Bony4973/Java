public class Employee {
    String id;
    String name;
    Address address;
    public Employee(String id, String name,Address address) {

        this.id = id;
        this.name = name;
        this.address=address;
    }
    void display(){

        System.out.println(id+" "+name);

        System.out.println(address.city+" "+address.Division+" "+address.country);

    }
    public static void main(String[] args) {

        Address address1=new Address("Savar","Dhaka","Bangladesg");
        Address address2=new Address("Natore","Rajshahi","Bangladesh");
        Employee emp=new Employee("221-15-4972","Roky",address1);
        Employee emp1=new Employee("221-15-4973","Bony",address2);
        emp.display();
        emp1.display();
    }
}