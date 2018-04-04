import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello, my name is ");
        Programmer p = null;
        try { p = new Programmer(22,155);
        } catch (IQTooLowException ex) { ex.printStackTrace(); }
        System.out.println(p.name + ", and I am " + p.age + " years old.");
        System.out.println("With an IQ of " + p.iq + ", I am a capable " + p.career + ".");
        hack(Stupidity.STUPID, p);
        if (p.career.equals("Prison")) System.out.println("Dammit.");
    }

    private static void hack(Stupidity stupidity, Programmer p) {
        if (stupidity == Stupidity.SMART) p.avoidFeds();
        else p.getCaught();
    }

}
