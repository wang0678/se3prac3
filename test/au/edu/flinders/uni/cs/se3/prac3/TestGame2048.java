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
		
		old = new int[] { 2, 0, 0, 2 };
		after = processer.tilt_line_left(old);
		expected = new int[] { 2, 2, 0, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "", after, expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "", after, expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 2, 0, 0, 0 };
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
		int[] expected = null;
		int[] old = null;
		Game2048Core processer = new Game2048Core();

		old = new int[] { 1, 1, 0, 0 };
		int after[] = processer.combine_tiles(old);
		expected = new int[] { 2, 0, 0, 0 };

		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 1, 1, 1, 0 };
		after = processer.combine_tiles(old);
		expected = new int[] { 2, 1, 0, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 1, 1, 1, 1 };
		after = processer.combine_tiles(old);
		expected = new int[] { 2, 2, 0, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 1, 2, 3, 4 };
		after = processer.combine_tiles(old);
		expected = new int[] { 1, 2, 3, 4 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
		}

		old = new int[] { 1, 2, 3, 3 };
		after = processer.combine_tiles(old);
		expected = new int[] { 1, 2, 6, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
	}
		
		old = new int[] { 1, 2, 2, 3 };
		after = processer.combine_tiles(old);
		expected = new int[] { 1, 4, 3, 0 };
		if (GameUtil.compareExpectToActualLine(expected, after)) {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.PASSED);
		} else {
			GameUtil.printLine(old, "after combine_line_left became", after,
					expected, GameUtil.FAILED);
			fail();
		}
	}

	private boolean line_vector_test(int i1, int i2, int i3, int i4,
			String msg, int o1, int o2, int o3, int o4) {
		Game2048Core processer = new Game2048Core();
		int list[] = { i1, i2, i3, i4 };
		if (null != msg) {
			System.out.print(msg);
		} else {
			System.out.print(" Tilting "
					+ GameUtil.convertLineToTxtWithSep(i1, i2, i3, i4)
					+ " left yields "
					+ GameUtil.convertLineToTxtWithSep(o1, o2, o3, o4));
		}
		list = processer.tilt_line_left_combine(new int[] { i1, i2, i3, i4 });

		if ((list[0] != o1) || (list[1] != o2) || (list[2] != o3)
				|| (list[3] != o4)) {

			System.out.println(" FAILED: "
					+ GameUtil.convertLineToTxtWithSep(i1, i2, i3, i4)
					+ " became " + GameUtil.convertLineToTxtWithSep(list)
					+ " instead of "
					+ GameUtil.convertLineToTxtWithSep(o1, o2, o3, o4));

			return false;
		}
		System.out.println(" - PASSED.");
		return true;
	}

	public void test_tilt_left() {
		boolean e = true;
		e &= line_vector_test(0, 0, 0, 0, "Empty list is empty after shift", 0,
				0, 0, 0);
		e &= line_vector_test(1, 0, 0, 0,
				"Value on left stays on left after shift", 1, 0, 0, 0);
		e &= line_vector_test(0, 0, 0, 1,
				"Value on right shifts to left edge after shift", 1, 0, 0, 0);
		e &= line_vector_test(0, 0, 1, 0,
				"Value in middle shifts to left edge after shift", 1, 0, 0, 0);
		e &= line_vector_test(1, 2, 4, 8, "Distinct values don't combine", 1,
				2, 4, 8);
		e &= line_vector_test(1, 1, 1, 1, "Combinations don't cascade", 2, 2,
				0, 0);
		e &= line_vector_test(0, 0, 1, 1, null, 2, 0, 0, 0);
		e &= line_vector_test(4, 0, 1, 1, null, 4, 2, 0, 0);
		e &= line_vector_test(2, 0, 1, 1, null, 2, 2, 0, 0);
	
		assertTrue(e);

	}
}