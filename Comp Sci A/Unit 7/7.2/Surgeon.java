public class Surgeon extends Employee{
    public Surgeon(){

    }

    public Surgeon(int i){
        salary = i;
    }

    public String cut(){
        return "Whoops! you shouldnt be awake...";
    }
}