package CollatzPorblem;
import java.math.*;

/**
 * 
 * @author CannachrisN
 * 
 * @version 0.1
 *
 */
public class CollatzProblem {
	private static BigInteger counter = new BigInteger("1");
	private Writer writer;
	private boolean schreiben;
	
	
	public CollatzProblem(Writer writer, boolean schreiben) {
		this.writer = writer;
		this.schreiben = schreiben;
	}
	
	/**
	 * 
	 * @param number
	 * @return the BigInteger("1")
	 */
	public BigInteger collatz(BigInteger number) {
		BigInteger zwei = new BigInteger("2");
		
		if (schreiben)
			writer.write( "\n" +  "(" + counter.toString() +","  + number.toString() + ")");
		
		counter.add(counter);
		//if (number.compareTo(number) < 0)
		//	throw new RuntimeException("STOP");
		
		if(number.equals(new BigInteger("1"))) {
			
			writer.write( "\n" + "Fertig");
			counter.add(counter);
			return new BigInteger("1");
			
		} else if(number.mod(zwei).equals(new BigInteger("0"))) {
			number = number.divide(zwei);
			
			return collatz(number);
			
		} else {
			number = number.multiply(new BigInteger("3")).add(new BigInteger("1"));
			
			return collatz(number);
		} 
	}
}
