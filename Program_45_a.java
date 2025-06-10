public class Program_45_a {
      public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Program_45_b person = new Program_45_b("Tom", "Riddle");
        Program_45_c student = new Program_45_c("Harry", "Potter", 3.25);
        Program_45_d employee = new Program_45_d("Rubeus", "Hagrid", 50000);
        
          person.showName();
          student.showGPA();
          employee.showSalary();
    }
}

