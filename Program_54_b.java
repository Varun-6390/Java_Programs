public class Program_54_b {
       String model;
    int year;
    Program_54_c engine;

    Program_54_b(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Program_54_c(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }  
}
