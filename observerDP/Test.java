package observerDP;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//test samples
		Magasine magazine = new Magasine();
		
		SubscriberType1 salah = new SubscriberType1("amine");
		
		SubscriberType2 hamza = new SubscriberType2("salah");
		
		magazine.ajtObserver(salah);
		
		magazine.ajtObserver(hamza);
		
		//Choisir Action 
		
		
		Scanner scan = new Scanner(System.in);  
        boolean iterer =true;
        
    do {
    	System.out.print("\n ********** Actions ************* ");
        System.out.print("\n- tap 1 to add Subscriber: ");
        System.out.print("\n- tap 2 to remove Subscriber: ");
        System.out.print("\n- tap 3 to add new edition: ");
        System.out.print("\n- tap 0 to quit: ");
        System.out.print("\nEnter number: ");
        
        	 int num = scan.nextInt();
             scan.nextLine();
	        switch(num) {
	        
	        	case 0: 
		    		iterer =false;
		    		break;	
		    		
	        	case 1: 
	                System.out.print("\n **************************** ");
	                System.out.print("\nEnter name: ");
	        		String name = scan.next();
	                System.out.print("\nEnter type: ");
	        		String type = scan.next();
		        		if (type.equals("SubscriberType1")){
		        			
		        			magazine.ajtObserver(new SubscriberType1(name));
	
		        		}
		        		else if (type.equals("SubscriberType2")){
		        			magazine.ajtObserver(new SubscriberType2(name));
		        			
		        		}
		        		else { System.out.print("Type doesn't exist ");}
		        		break;
		        		
		        		
	        	case 2: 
	                System.out.print("\n **************************** ");
	                System.out.print("\nEnter name: ");
	        		name = scan.next();
	            	
		        		magazine.removeObserver(name);
		        		break;
		        	
	        	
	        	case 3: 
	        		
		        	System.out.print("\n **************************** ");
		            System.out.print("\nEnter number: ");
		            int number = scan.nextInt();
		            System.out.print("\nEnter date: ");
		            int date = scan.nextInt();
		            magazine.setInfo(number,date);
		            break;
		            
	        	default: 
		            System.out.print("\nEnter a valid number! ");
		            break;

        	
	        }
        

	      
        }
    	while (iterer =true);
	}

}
