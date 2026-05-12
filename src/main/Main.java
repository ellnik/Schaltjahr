/**
 * 
 */
package main;

/**
  *Formatiere deine Code mit  Strg + Hochtaste +f
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int jahr = 2010;
	    boolean schaltjahr = false;
	    
	    if (jahr % 4 == 0){
	    	schaltjahr = true;
	    	if (jahr % 100 == 0){
			    schaltjahr = false;
			    
			    if (jahr % 400 == 0) {
				    schaltjahr = true;
			    }
		    }
	    }
	    boolean sj = jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0);
	   boolean ti = jahr % 400 == 0 || (jahr % 100 != 0 || jahr % 4 == 0);
	    System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr\n" + schaltjahr);
	    System.out.println("Nach Votor: " + sj);
	    System.out.println("Mit 400 zuerst : " + ti);
	  }
	}

