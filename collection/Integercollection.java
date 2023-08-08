package collection;

import java.util.*;

public class Integercollection {
	    public static void main(String[] args) {
	        List<Integer> i = new ArrayList<>();
	        i.add(1);
	        i.add(89);
	        i.add(14);
	        i.add(67);
	        i.add(90);
	        i.add(44);
	        i.add(1900);
	        i.add(232);
	        i.add(111);
	        i.add(97);
	        i.add(33);
	        i.add(25);
	        i.add(80);
	        i.add(2);
	        i.add(50);
	        i.add(7);
	        i.add(19);
	        i.add(71);
	        i.add(88);
	        i.add(55);
	        System.out.println("Before Update-----------------------------------");
	        System.out.println(i);
	      
	        System.out.println("After Update------------------------------------");
	        //update
	        for (int j = 0; j < i.size(); j++) {
	            if (i.get(j) > 50) {
	                i.set(j, i.get(j) + 5);
	            }
	        }
	        System.out.println(i);

	      
	        System.out.println("Elements in reverse order----------------------");
	        ListIterator<Integer> iterator = i.listIterator(i.size());
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
	        
	        // Display 
	        System.out.println("Elements less than 60---------------------------");
	        for (int num : i) {
	            if (num < 60) {
	                System.out.println(num);
	            }
	        }
	    }
	}
