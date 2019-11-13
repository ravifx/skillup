package com.examples.ds;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str="";
    while(true) {
      
      String input=sc.nextLine();
      if(input.equals("-1")) { 
        break;
       
      }else {
        String[] op=input.split(" ");
        Stack<String> stack=new Stack<>();
        switch(op[0]) {
          case "1": str=append(str, op[1]);
                    stack.push(str);
                    break;
                    
          case "2" :str=delete(str,Integer.valueOf(op[1]));
                   stack.push(str);
                    break;
          case "3" :System.out.println(print(str,Integer.valueOf(op[1])));
                   break;
          case "4" : str=stack.pop();
                     break;
          
        }
      }
      
    }
  }



public static String append(String str,String appendWith) {
  return str.concat(appendWith);
}


public static String delete(String str ,int k) {
  return str.substring(k);
}

public static char print(String str,int k) {
  return str.charAt(k);
}

}