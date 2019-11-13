package com.examples.java8;

 public interface InterfaceDefault {
   
   void testOne();
   //void testTwo();
   
   default void testThree() {
     System.out.println("This is testThree");
   }
   
   default void testFour() {
     System.out.println("This is testFour");
   }
   
   static void testFive() {
     System.out.println("This is testFive");
   }
   
}
