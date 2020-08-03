public class Piece extends Space{
    private boolean alive = true;
    public int color; //1 is red 2 is blue 3 is invalid
    private boolean king = false;
    private boolean selected = false;

    public Piece(int x, int y, int color){
        super(x, y);
        this.color = color;
    }



    //used for movement and formating
    public void isSelected(boolean selected){
        this.selected = selected;
    }

    //used to return team color
    public int getTeam(){
        return color;
    }

    //used mostly to print with fancy colors
    public String toString(){
        if (color == 1){
                if (selected){
                    return "(" + Color.RED_BOLD + "O" + Color.RESET + ")";
                } else{
                    return "[" + Color.RED + "O" + Color.RESET + "]";
                }
        } else if (color == 2){
            if (selected){
                return "(" + Color.BLUE_BOLD + "O" + Color.RESET + ")";
            } else{
                return "[" + Color.BLUE + "O" + Color.RESET + "]";
            }
        } else{
            //this else will never be called, however it is needed to distinguish the three options for color
            return "";
        }
    }
}