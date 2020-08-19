/**
 * 
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
	 * Returns the total population of a specified city
	 * @return int value for population
	 */
	public int getFact();
	
	
}
