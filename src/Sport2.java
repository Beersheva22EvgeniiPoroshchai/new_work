
public class Sport2 {



public class random {
		 
	    public static void main(String[] args) {
	 
	        int x1 = (int) (getRandomInt(1, 49));
	        int x2 = (int) (getRandomInt(1, 49));
	        int x3 = (int) (getRandomInt(1, 49));
	        int x4 = (int) (getRandomInt(1, 49));
	        int x5 = (int) (getRandomInt(1, 49));
	        int x6 = (int) (getRandomInt(1, 49));
	        while (x2 == x1 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == x6) {
	            x2 = (int) (getRandomInt(1, 49));
	        }
	        while (x3 == x1 || x3 == x2 || x3 == x4 || x3 == x5 || x3 == x6) {
	            x3 = (int) (getRandomInt(1, 49));
	            }
	        while (x4 == x1 || x4 == x2 || x4 == x3 || x4 == x5 || x4 == x6) {
	            x4 = (int) (getRandomInt(1, 49));
	        }
	        while (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == x6) {
		         x5 = (int) (getRandomInt(1, 49));
	        }
	        while (x6 == x1 || x6 == x2 || x6 == x3 || x6 == x4 || x6 == x5) {
		         x6 = (int) (getRandomInt(1, 49));
	            
	        }
	        
	        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5 + " " + x6 + " ");
	    }
	        
	    
}   
	        
	        
public static int getRandomInt(int min, int max) {
	return (int) (min + Math.random() * (max - min + 1));
}
}
	