public class Doctor extends Employee{
    public Doctor(){

    }

    public Doctor(int i){
        salary = i;
    }

    public String diagnose(){
        return "You have Cancer :D ";
    }
}