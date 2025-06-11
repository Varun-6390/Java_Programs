public class Program_45_c extends Program_45_b{

    double gpa;

    Program_45_c(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}

