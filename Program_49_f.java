// Fish class (child of both parents)
public class Program_49_f implements Program_49_b, Program_49_c {

    @Override
    public void flee() {
        System.out.println("The fish is swiming away");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

}