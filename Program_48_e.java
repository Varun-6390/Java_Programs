public class Program_48_e extends Program_48_b {
    
    double length;
    double width;

    Program_48_e(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
}
