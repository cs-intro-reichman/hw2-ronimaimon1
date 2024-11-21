// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mood = args[1];
		
		if (mood.equals("v")){
			for (int i=1; i<n+1; i++){
				int curNum = i;
				int steps = 1;
				do {
					System.out.print("" + curNum + " ");
					if (curNum%2 == 0)
						curNum = curNum/2;
					else
						curNum = 3*curNum + 1;
			
					steps++;
				}
				while (curNum != 1);

				System.out.println("1 (" + steps + ")");
			}
		}
	System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	
	}
}
