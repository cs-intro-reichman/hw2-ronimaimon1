// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String s = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);
            String anLestters = "AEFHILMNORSX";

            for (int i=0; i<s.length(); i++){
                for (int j=0; j<anLestters.length(); j++){
                        if (s.charAt(i)==anLestters.charAt(j)){
                                System.out.println("Give me an " + s.charAt(i) + ": " + s.charAt(i) + "!");
                                j = anLestters.length();
                        }
                        else if (j==anLestters.length()-1)
                                System.out.println("Give me a " + s.charAt(i) + ": " + s.charAt(i) + "!");  
                }
            }

            System.out.println("What does that spell?");

            for (int k=0; k<times; k++)
            System.out.println(s + "!!!");
        }
}