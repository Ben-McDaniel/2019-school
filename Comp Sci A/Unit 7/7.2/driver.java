public class driver{
    public static void main(String[]args){
        Doctor doc = new Doctor();
        doc.setSalary(100);
        System.out.println("I get paid " + doc.salary() + " to tell you " + doc.diagnose());

        Surgeon sur = new Surgeon(250);
        System.out.println(sur.cut());
    }
}