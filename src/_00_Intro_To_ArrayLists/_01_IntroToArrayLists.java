package _00_Intro_To_ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class _01_IntroToArrayLists {
	
    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	 ArrayList<String> names = new ArrayList<String>();
        // 2. Add five Strings to your list
    	 names.add("Shivam");
         names.add("Kishan");
         names.add("Archana");
         names.add("Saurin");
         names.add("Kiwi");
    
        // 3. Print all the Strings using a standard for-loop
         for(int i = 0; i < names.size(); i++){
             String s = names.get(i);
             System.out.println(s);
         }

        // 4. Print all the Strings using a for-each loop
         for(String s : names){
             System.out.println(s);
         }
        // 5. Print only the even numbered elements in the list.
         System.out.println("Archana"+"Kiwi");
         
        // 6. Print all the Strings in reverse order.
         for(int i = 0; i < 5; i++){
             String a = names.get(i);
             if(i==0) {
            	 i=5;
             }
             if(i==1) {
            	 i=4;
             }
             if(i==2) {
            	 i=3;
             }
             if(i==3) {
            	 i=2;
             }
             if(i==4) {
            	 i=1;
             }
             
             System.out.println(a);
         }
        // 7. Print only the Strings that have the letter 'e' in them.
        for(int i = 0; i < names.size(); i++){
        	String s = names.get(i);
        	 if(s=="e") {
        		 System.out.println(names.get(i));
        	 }
         }
    }
}
