import java.util.Arrays;

public class Board {
    //8x8 2d array of spaces
    static Space [] [] tiles = new Space [8] [8];

    public Board(){
        this.resetBoard();
    }

    public void resetBoard(){
        //create red pieces
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 7; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        tiles[i][j] = new Space(i, j);
                    } else {
                        tiles[i][j] = new Piece(i, j, 1);
                    }
                } else{
                    if(j % 2 != 0){
                        tiles[i][j] = new Space(i, j);
                    } else {
                        tiles[i][j] = new Piece(i, j, 1);
                    }
                }
            }
        }

        //create blue pieces
        for (int i = 5; i <= 7; i++){
            for (int j = 0; j <= 7; j++){
                if(i == 5 || i == 7){
                    if(j % 2 != 0){
                        tiles[i][j] = new Space(i, j);
                    } else {
                        tiles[i][j] = new Piece(i, j, 2);
                    }
                } else{
                    if(j % 2 == 0){
                        tiles[i][j] = new Space(i, j);
                    } else {
                        tiles[i][j] = new Piece(i, j, 2);
                    }
                }
            }
        }

        //create the empty boxes
        for(int i = 3; i <= 4; i++){
            for (int j = 0; j <=7; j++){
                try{
                    tiles[i][j] = new Space(i, j);
                } catch(Exception e){
                    continue;
                }
            }
        }

    }

    //print the array
    public void printArray(){
        for (Space[] x : tiles)
        {
        for (Space y : x)
        {
                System.out.print(y + " ");
        }
        System.out.println();
        }
    }

    //move a piece to a different space
    public static void move(int initalX, int initalY, int moveX, int moveY, int team){
        tiles[moveX][moveY] = new Piece(moveX, moveY, team);
        tiles[initalX][initalY] = new Space(initalX, initalY);
    }


    //jump an enemy piece
    public static void jump(int startX, int startY, int moveX, int moveY, int team){
        int yAxis;
        if (team == 1){
            yAxis = -1;
        } else{
            yAxis = 1;
        }

        if(startX > moveX){
            tiles[startX - 1][startY + yAxis] = new Space(startX - 1, startY + yAxis);
            move(startX, startY, moveX, moveY, team);
        } else{
            tiles[startX + 1][startY + yAxis] = new Space(startX + 1, startY + yAxis);
            move(startX, startY, moveX, moveY, team);
        }
    }
}