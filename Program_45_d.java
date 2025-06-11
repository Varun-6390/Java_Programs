public class Program_45_d extends Program_45_b{

    int salary;

    Program_45_d(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
