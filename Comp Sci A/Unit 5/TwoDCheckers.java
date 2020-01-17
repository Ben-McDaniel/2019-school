//Ben McDaniel

public class TwoDCheckers{
    public static int[][] board = new int[8][8];
    public static void main(String[]args){
       resetboard();
       System.out.println();
       System.out.println();
       System.out.println();
       makemoves();
    }

    public static void resetboard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                board[i][j] = 0;
            }
        }
        board[0][1] = 1;
        board[0][3] = 1;
        board[0][5] = 1;
        board[0][7] = 1;
        board[1][0] = 1;
        board[1][2] = 1;
        board[1][4] = 1;
        board[1][6] = 1;
        board[2][1] = 1;
        board[2][3] = 1;
        board[2][5] = 1;
        board[2][7] = 1;
        board[5][0] = 3;
        board[5][2] = 3;
        board[5][4] = 3;
        board[5][6] = 3;
        board[6][1] = 3;
        board[6][3] = 3;
        board[6][5] = 3;
        board[6][7] = 3;
        board[7][0] = 3;
        board[7][2] = 3;
        board[7][4] = 3;
        board[7][6] = 3;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void makemoves(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                board[i][j] = 0;
            }
        }
        board[0][1] = 1;
        board[0][3] = 1;
        board[0][5] = 1;
        board[0][7] = 1;
        board[1][0] = 1;
        board[1][2] = 1;
        board[1][4] = 1;
        board[1][6] = 1;
        // move
        board[2][1] = 0;
        board[3][0] = 1;

        board[2][3] = 1;
        board[2][5] = 1;
        board[2][7] = 1;
        board[5][0] = 3;
        board[5][2] = 3;
        board[5][4] = 3;
        board[5][6] = 3;
        board[6][1] = 3;
        board[6][3] = 3;
        board[6][5] = 3;
        board[6][7] = 3;
        board[7][0] = 3;
        board[7][2] = 3;
        board[7][4] = 3;
        board[7][6] = 3;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        } 

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                board[i][j] = 0;
            }
        }
        board[0][1] = 1;
        board[0][3] = 1;
        board[0][5] = 1;
        board[0][7] = 1;
        board[1][0] = 1;
        board[1][2] = 1;
        board[1][4] = 1;
        board[1][6] = 1;
        // move
        board[2][1] = 0;
        board[3][0] = 1;

        board[2][3] = 1;
        board[2][5] = 1;
        board[2][7] = 1;
        board[5][0] = 3;
        //move 2
        board[5][2] = 0;
        board[4][3] = 1;


        board[5][4] = 3;
        board[5][6] = 3;
        board[6][1] = 3;
        board[6][3] = 3;
        board[6][5] = 3;
        board[6][7] = 3;
        board[7][0] = 3;
        board[7][2] = 3;
        board[7][4] = 3;
        board[7][6] = 3;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
    }
}
}