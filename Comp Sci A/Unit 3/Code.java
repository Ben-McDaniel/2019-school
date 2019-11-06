//Ben McDaniel

import java.util.*;
import java.lang.*;

public class Code{

    private char[] myCode;
    public StringBuilder finalCode = new StringBuilder("");
    public Code(String code){
        myCode = code.toCharArray();
        
    }



    public void getCode(){
        //Put instance vars here
        System.out.println(finalCode);
    }



    public void hide(int p1, int p2){
        int dif = p2 - p1;
        
        for (int i = 0; i < myCode.length; i++){
            if (i >= p1 && i < p2 ){
                finalCode.append("X");
            } else{
                finalCode.append(myCode[i]);
            }
            
        }

    }



    public void recover(int p1, int p2){
        for (int i = 0; i < myCode.length; i++){
            if (i >= p1 && i < p2 ){
                finalCode.append(myCode[i]);
            } else{
                finalCode.append(finalCode.charAt(i));
            }
        }
        int half = (finalCode.length() / 2);
        for (int i = 0; i < half; i++){
            finalCode = finalCode.deleteCharAt(0);
        }
        
    }



}
