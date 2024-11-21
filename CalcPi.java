// Computes an approximation of PI.
public class CalcPi {
	public static void main (String [] args) { 
	    int terms = Integer.parseInt(args[0]);
		double sum = 0;
		double denominator = 1;

		for (int i=1; i<terms+1; i++){
			if (i%2 == 0)
				sum-= (1/denominator);
			else
				sum+=  (1/denominator);

			denominator = denominator+2;
		}
		
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*sum);
	}
}
