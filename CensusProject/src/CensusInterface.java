/**
 * The CensusInterface that holds the methods behind how to interact with the Census.csv file
 * @author Sunny Moran
 *
 */
public interface CensusInterface {
	/**
	 * 
	 * @return true if Census is valid, else false
	 */
	public boolean isCensus();
		
	/**
	 * Returns the string name for the specified fact
	 * @return String name
	 */
	public String getFact();
	
	/**
	 * Returns the int value for the specified fact
	 * @return int value 
	 */
	public int getValue();
	
}
