//Ben McDaniel

import java.lang.*;
import java.util.*;


public class TestDriver{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int pri, com, choice = 1;
        Test obj1 = new Test(0,0);
        Test obj2 = new Test(0,0);
        Test obj3 = new Test(0,0);
        Test obj4 = new Test(0,0);
        Test obj5 = new Test(0,0);

        while (choice != 0){
            System.out.println("=======================================================================");
            System.out.println("Name    Priority   Complexity");
            System.out.println("Object1    " + obj1.getPriority() + "            " + obj1.getComplexity()); 
            System.out.println("Object2    " + obj2.getPriority() + "            " + obj2.getComplexity()); 
            System.out.println("Object3    " + obj3.getPriority() + "            " + obj3.getComplexity()); 
            System.out.println("Object4    " + obj4.getPriority() + "            " + obj4.getComplexity()); 
            System.out.println("Object5    " + obj5.getPriority() + "            " + obj5.getComplexity()); 
            System.out.println("=======================================================================");
    
            System.out.println("Change Priority (1) Change Complexity (2) Exit (0)");
            choice = in.nextInt();

            if (choice == 1){
                System.out.println("Which object do you want to change (1-5)");
                int num = in.nextInt();
                if (num == 1){
                    System.out.println("What is the new Priority: ");
                    int n = in.nextInt();
                    obj1.setPriority(n);
                }else if (num == 2){
                    System.out.println("What is the new Priority: ");
                    int n = in.nextInt();
                    obj2.setPriority(n);
                }else if (num == 3){
                    System.out.println("What is the new Priority: ");
                    int n = in.nextInt();
                    obj3.setPriority(n);             
                }else if (num == 4){
                    System.out.println("What is the new Priority: ");
                    int n = in.nextInt();
                    obj4.setPriority(n);
                }else{
                    System.out.println("What is the new Priority: ");
                    int n = in.nextInt();
                    obj5.setPriority(n);
                }
            } else if (choice == 2){
                System.out.println("Which object do you want to change (1-5)");
                int num = in.nextInt();
                if (num == 1){
                    System.out.println("What is the new Complexity: ");
                    int n = in.nextInt();
                    obj1.setComplexity(n);
                }else if (num == 2){
                    System.out.println("What is the new Complexity: ");
                    int n = in.nextInt();
                    obj2.setComplexity(n);
                }else if (num == 3){
                    System.out.println("What is the new Complexity: ");
                    int n = in.nextInt();
                    obj3.setComplexity(n);             
                }else if (num == 4){
                    System.out.println("What is the new Complexity: ");
                    int n = in.nextInt();
                    obj4.setComplexity(n);
                }else{
                    System.out.println("What is the new Complexity: ");
                    int n = in.nextInt();
                    obj5.setComplexity(n);
                }
            }
        }

        System.out.println("=======================================================================");

        if (obj1.getPriority() < obj2.getPriority()){
            System.out.println("Object two is more of a priority");
        } else {
            System.out.println("Object one is more of a priority");
        }


    }
}