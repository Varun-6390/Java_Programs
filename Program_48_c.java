public class Program_48_c extends Program_48_b {
     double radius;

    Program_48_c(double radius){
        this.radius = radius;
}

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
