package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Algo Test")
@Tag("DateTime")
class SortingExamplesTest {

    @Test
    void insertElementAtGivenPositionInArray() {
        int[] numbers = {1, 3, 4};
        int[] expected = {1, 3, 4, 10};
        int[] output = SortingExamples.insertElementAtGivenPositionInArray(3, 10, numbers);
        assertArrayEquals(expected, output);
    }

    @Test
    void insertElementAtGivenPositionInArrayBegin() {
        int[] numbers = {1, 3, 4};
        int[] expected = {10, 1, 3, 4};
        int[] output = SortingExamples.insertElementAtGivenPositionInArray(0, 10, numbers);
        assertArrayEquals(expected, output);
    }

}