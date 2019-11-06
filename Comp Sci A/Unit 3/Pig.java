//Ben McDaniel

public class Pig{
    public static void main(String[]args){
        PairOfDice cpu = new PairOfDice();
        PairOfDice player = new PairOfDice();
        int cpuCount = 0;
        int playerCount = 0;
        int choice;

        Char[] ret = cpu.roll();
        System.out.println(ret);
        






        while (cpuCount < 100 || playerCount < 100){
            System.out.println("1 to roll, 0 to pass");
            choice = input.nextInt();
            if (choice != 0){

            } else{
                
            }











        }


        if (playerCount < cpuCount){
            System.out.println("CPU wins!");
        } else{
            System.out.println("Player Wins!");
        }


        System.out.println(cpu.roll());
        
    }
}

