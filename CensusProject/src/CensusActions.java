import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Contains the methods that the user can utilize in the Census.java class
 * Implements the CensusInterface
 * @author Sunny Moran
 *
 */
public class CensusActions implements CensusInterface{
	
	public CensusActions(String filename) throws FileNotFoundException, InvalidFileFormatException {
		
		Scanner fileScan = new Scanner(new File(filename))
;	}
	
	@Override
	public boolean isCensus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getFact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public String toString() {
		return null;
		
	}
}
