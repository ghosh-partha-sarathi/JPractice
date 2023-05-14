package array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MoveZeroesToEndTests {

	@Test
    @DisplayName("CASE: Input is Empty")
	public void emptyInputTest() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {};
        int[] expectedArray = {};
		assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
	}

	@Test
	@DisplayName("CASE: Single input")
	public void singleInputCase() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {1};
        int[] expectedArray = {1};
		assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
	}

	@DisplayName("CASE: Single element input {0}")
	public void singleInputZeroCase() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {0};
        int[] expectedArray = {0};
		assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
	}

	@Test
	@DisplayName("CASE: 1")
	public void testCase1() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {0, 2};
        int[] expectedArray = {2, 0};
		assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
	}

    @Test
	@DisplayName("CASE: 2")
	public void testCase2() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {0, 2, 3, 4, 5, 2, 1, 0};
        int[] expectedArray = {2, 3, 4, 5, 2, 1, 0, 0};
		assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
	}

	@Test
	@DisplayName("😱")
	public void testCase3() {
		MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        int[] inputArray = {0, 1, 3, 8, 0, 0, 5, 7, 4};
        int[] expectedArray = {1, 3, 8, 5, 7, 4, 0, 0, 0};
        assertArrayEquals("NOT a valid mountain", expectedArray, moveZeroesToEnd.moveZeroesToEnd(inputArray));
    }

}
