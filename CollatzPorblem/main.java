package CollatzPorblem;
import java.math.*;

/**
*@author CannachrisN
*
*@version 0.1
*
*/
public class main {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		BigInteger x = new BigInteger("1");
		Writer writer = new Writer("F:\\collatzProblem.txt");
		writer.start();
		writer.write("Programmiert von CannachrisN");
		
		
		while(true) {
		writer.write("\n" + "Zahl: " + x);
		System.out.println(x);
		CollatzProblem alpha = new CollatzProblem(writer, true);
		alpha.collatz(x);
		writer.write("\n");
		x = x.add(new BigInteger("1"));
		}
	}


}
;