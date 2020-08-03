import java.util.*;



public class Game {
    public static void main(String[]args) {
        Board b = new Board();
        Scanner input = new Scanner(System.in);
        boolean chooseSpaceReturn = true;
        int playerPieceChooseY;
        int playerPieceChooseX;
        String playerPieceSelection;
        String playerSpaceSelection;
        int playerChooseMoveResult = 2;
        int playerMoveChooseX;
        int playerMoveChooseY;
        int team = 1; // this goes back and forth each round
        int redPieces = 12;
        int bluePiece = 12;
        boolean gameActive = true;


        //This section explains the rules and prints the inital board
        System.out.println("Welcome!");
        System.out.println("For this game to work properly you need to run it in a program that can interperate UNIX colors");
        System.out.println("I recomend git bash");
        System.out.println("If this is correct press any key");
        System.out.println("");
        System.out.println("");
        String anyKey = input.next();
        System.out.println("");
        System.out.println("");
        System.out.println("Great! To play this game you will select the piece you want to move using its coordinates on an 8x8 grid");
        System.out.println("The space in the top left corner is 0,0 and it ascends to the right and downwards");
        System.out.println("Once you have selected your piece, you will select the space you want to move it to in the same way");
        System.out.println("Besides that, this game runs like any other game of checkers would!");
        System.out.println("So have fun and get playing");
        System.out.println("Press any key to continue");
        anyKey = input.next();
        System.out.println(Color.CLR);
        b.printArray();
        

        do{
            //Prints which teams turn it is
            if(team == 1){
                System.out.println(Color.RED_BOLD + "---RED TURN---" + Color.RESET);
            } else{
                System.out.println(Color.BLUE_BOLD + "---BLUE TURN---" + Color.RESET);
            }


            //chose your checker
            do{
                if(chooseSpaceReturn == false){
                    System.out.println("Invalid Selection, enter again");
                }
                System.out.println("Enter the Row of your piece: ");
                playerPieceChooseX = input.nextInt();
                System.out.println("Enter the Colom of your piece: ");
                playerPieceChooseY = input.nextInt();

                chooseSpaceReturn = chooseSpace(playerPieceChooseX, playerPieceChooseY);

                System.out.println(Color.CLR);
                b.printArray();

                if (chooseSpaceReturn = true){
                    System.out.println("Is this the correct piece? Y/N");
                    playerPieceSelection = input.next();
                    if(playerPieceSelection.toLowerCase().equals("y")){
                    
                    } else{
                        Board.tiles[playerPieceChooseX][playerPieceChooseY].isSelected(false);
                        chooseSpaceReturn = false;
                    }
                }
                System.out.println(Color.CLR);
                b.printArray();
            }while(chooseSpaceReturn == false);
            

            //choose where you want to move to
            do{
                if (playerChooseMoveResult == 1){
                    System.out.println("Invalid Selection, enter again");
                }

                System.out.println("Enter the Row of your move: ");
                playerMoveChooseX = input.nextInt();
                System.out.println("Enter the Colom of your move: ");
                playerMoveChooseY = input.nextInt();

                playerChooseMoveResult = chooseMove(playerMoveChooseX, playerMoveChooseY, playerPieceChooseX, playerPieceChooseY);

                System.out.println(Color.CLR);
                b.printArray();

                if(playerChooseMoveResult == 2 || playerChooseMoveResult == 3){
                    System.out.println("Is this the correct space? Y/N");
                    playerSpaceSelection = input.next();
                    if(playerSpaceSelection.toLowerCase().equals("y")){
                    
                    } else{
                        Board.tiles[playerMoveChooseX][playerMoveChooseY].isSelected(false);
                        playerChooseMoveResult = 1;
                    }
                }
                // 1 Invalid
                // 2 Valid
                // 3 jump 

            }while(playerChooseMoveResult == 1);




            //jump or move accordingly
            if(playerChooseMoveResult == 2){
                Board.move(playerPieceChooseX, playerPieceChooseY, playerMoveChooseX, playerMoveChooseY, team);
            } else{
                Board.jump(playerPieceChooseX, playerPieceChooseY, playerMoveChooseX, playerMoveChooseY, team);

                if(team == 1){
                    bluePiece --;
                } else{
                    redPieces --;
                }
            }

            System.out.println(Color.CLR);
            b.printArray();





            //check if there is a winner
            if (redPieces == 0){
                gameActive = false;
            } else if (bluePiece == 0){
                gameActive = false;
            }




            //change team from one to two and vice versa
            if(team == 1){
                team = 2;
            } else{
                team = 1;
            }
        } while(gameActive);

        if (redPieces == 0){
            System.out.println(Color.BLUE_BOLD + "---BLUE WINS---" + Color.RESET);
        } else {
            System.out.println(Color.RED_BOLD + "---RED WINS---" + Color.RESET);
        }
    }


















    //checks if chosen space is valid
    public static boolean chooseSpace(int x, int y){
        if(Board.tiles[x][y].getTeam() == 1 || Board.tiles[x][y].getTeam() == 2){
            Board.tiles[x][y].isSelected(true);
            return true;
        } else{
            return false;
        } 
    }

    //checks what chosen move is and if it is valid
    public static int chooseMove(int x, int y, int spaceX, int spaceY){
        if(Board.tiles[x][y].getTeam() != 3){
            return 1;
        } else if(Board.tiles[spaceX][spaceY].getTeam() != 1){ //red team
            if(y - 1 != spaceY){ //jump or mistake
                if (Board.tiles[x - 1][y - 1].getTeam() != 2 || Board.tiles[x + 1][y - 1].getTeam() != 2){ //checking to see if a jump is being atempted
                    return 1;
                } else{ //yes jump
                    Board.tiles[x][y].isSelected(true);
                    return 3;
                }
            } else{ //move
                Board.tiles[x][y].isSelected(true);
                return 2;
            }
        } else{ //blue team
            if(y - 1 != spaceY){ //jump or mistake
                if (Board.tiles[x - 1][y + 1].getTeam() != 2 ||Board.tiles[x + 1][y + 1].getTeam() != 2){ //checking to see if a jump is being atempted
                    return 1;
                } else{ //yes jump
                    Board.tiles[x][y].isSelected(true);
                    return 3;
                }
            } else{ //move
                Board.tiles[x][y].isSelected(true);
                return 2;
            }

        }

    }



    


}

