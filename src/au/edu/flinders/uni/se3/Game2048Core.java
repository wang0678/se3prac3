package au.edu.flinders.uni.se3;


import au.edu.flinders.uni.se3.Game2048ProcesserIf;

public class Game2048Core implements Game2048ProcesserIf {
	
	
	
	
	/**
	 * Method to tilt line to left without same number merge.
	 */
	public int[] tilt_line_left(int[] oldLine) {
		
			return null;}
		
	
	
	/**
	 * Method to merge same number in adjacent cells. The input line should
	 * comply with all numbers tilt left without merge (return value of
	 * tilt_line_left method).
	 */
	public int[] combine_tiles(int[] oldline) {
		
		return null;
	}
	
	/**
	 * Tilt line number to left with merge.
	 */
	public int[] tilt_line_left_combine(int[] oldline) {
		return combine_tiles(tilt_line_left(oldline));
	}
}


	
