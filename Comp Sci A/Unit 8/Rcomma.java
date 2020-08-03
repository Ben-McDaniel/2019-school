public class Rcomma{
    public Rcomma(){

    }

    public String insertCommas(String s){
        if(s.length() <= 3){
            return s;
        }

        return(insertCommas(s.substring(0, s.length() - 1)));
    }
}