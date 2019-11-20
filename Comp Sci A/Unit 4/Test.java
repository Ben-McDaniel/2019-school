//Ben McDaniel

import java.lang.*;

public class Test implements Priority, Complexity, Comparable{
    int priority, complexity;

    public Test(int p, int c){
        priority = p;
        complexity = c;
    }


    public void setPriority(int a){
        priority = a;
    }

    public int getPriority(){
        return(priority);
    }

    public void setComplexity(int com) {
        complexity = com;
    }

    public int getComplexity() {
        return(complexity);
    }

    public int compareTo(Object o) {
        Test sec = (Test) o;

        if (priority < sec.priority){
            return(1);
        } else if (priority < sec.priority){
            return(-1);
        } else {
            return(0);
        }
        
    }

}