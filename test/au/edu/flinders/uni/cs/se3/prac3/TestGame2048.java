package au.edu.flinders.uni.cs.se3.prac3;

import au.edu.flinders.uni.se3.Game2048Core;
import au.edu.flinders.uni.se3.util.GameUtil;
import junit.framework.TestCase;

/**
 * This is the Junit TestGame2048 class which is used to test Game2048Core class
 * for Prac 3
 * 
 */
public class TestGame2048 extends TestCase {

	public void test_tilt_line_left() {
		int[] expected = null;
		int[] old = null;
		int[] after = null;
		Game2048Core processer = new Game2048Core();

		old = new int[] { 0, 0, 2, 2 };
		after = processer.tilt_line_left(old);
		expected = new int[] { 2, 2, 0, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "", after, expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "", after, expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 0, 0, 0, 2 };
		after = processer.tilt_line_left(old);
		expected = new int[] { 2, 0, 0, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "", after, expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "", after, expected, GameUtil.FAILED);
			fail();
	}
	}
		
	
	public void test_combine_tiles() {
		}
	}
		

	