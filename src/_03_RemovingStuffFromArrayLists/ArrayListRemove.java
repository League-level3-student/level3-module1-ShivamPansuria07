package _03_RemovingStuffFromArrayLists;

import java.awt.Window.Type;
import java.util.ArrayList;

import _03_RemovingStuffFromArrayLists.ArrayListRemove.Stuff;

public class ArrayListRemove {

    class Stuff {
        public String type;

		public void type(String string) {
			// TODO Auto-generated method stub
			
		}
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
         
      for (int i = 0; i < yard.size(); i++) {
    	  
			yard.remove(i).type("dirt");
	     if(yard.size()>2) {
	    	 yard.remove(i).type("dirt");
	     }
	}
        return yard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
    	for (int i = 0; i < list.size(); i++) {

      	if(list.get(i).equals('#')) {
      		list.remove(i).equals('#');
      		
      	}
      
  	}
        return list;
    }
}
