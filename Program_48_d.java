public class Program_48_d extends Program_48_b  {
  
    double base;
    double height;

    Program_48_d(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }  
}
