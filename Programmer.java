public class Programmer {

    String name;
    int age;
    String career;
    int iq;

    public Programmer(int age, int iq) throws IQTooLowException {
        this.name = "j3488";
        this.age = age;
        this.career = "Software Engineer";
        if (iq <= 150) throw new IQTooLowException(); else this.iq = iq;
    }
    public void getCaught(){
        iq -= 5; career = "Prison";
    }
    public void avoidFeds(){
        iq += 10;
    }
}
/*
None shall know who I am.
Except for those who do.
 */
