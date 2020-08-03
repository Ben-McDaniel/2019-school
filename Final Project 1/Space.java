public class Space {
    private int x;
    private int y;
    private boolean selected = false;


    public Space(int a, int b){
        x = a;
        y = b;

    }

    //assigns spaces a team number, used for movement 
    public int getTeam(){
        return 3;
    }
    
    //used for movement and display
    public void isSelected(boolean selected){
        this.selected = selected;
    }

    public String toString(){
        if (selected){
            return "( )";
        } else{
            return "[ ]";
        }
    }
}