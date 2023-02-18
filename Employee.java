//CONSTRUCTOR
public class Employee {
    String Name;
    int Id;
    int Age;
    public Employee(String a,int b,int c){
      this.Name=a;
      this.Id=b;
      this.Age=c;

    }
    void print(){
        System.out.println("EMployee name :" +Name);
        System.out.println("EMployee id :" +Id);
        System.out.println("EMployee age :" +Age);
    }
    public static void main(String[] args) {
        Employee emp= new Employee("Bony",4973, 22);
        emp.print();
    }
}