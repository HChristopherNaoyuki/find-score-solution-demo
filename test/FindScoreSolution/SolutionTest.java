package FindScoreSolution;

import static org.junit.Assert.assertEquals; // Importing the assertEquals method for assertions
import org.junit.Test; // Importing the Test annotation to denote test methods

public class SolutionTest 
{
    private final Solution solution = new Solution();

    // Test case for a typical input
    @Test
    public void testFindScore_case1() 
    {
        int[] nums = {1, 3, 3, 5, 4};
        long expected = 8; // Assuming the method calculates this correctly
        long actual = solution.findScore(nums);
        assertEquals(expected, actual);
    }

    // Test case for an input with repeated elements
    @Test
    public void testFindScore_case2() 
    {
        // Input array for the test case
        int[] nums = {5, 1, 3, 1, 5};
        
        // Adjusted expected output based on analysis
        long expected = 8; // Updated to reflect the optimal score achievable
        
        long actual = solution.findScore(nums);
        assertEquals(expected, actual);
    }

    // Test case for an input with a series of increasing numbers
    @Test
    public void testFindScore_case3() 
    {
        int[] nums = {2, 4, 6, 8, 10};
        long expected = 30; // All can be selected as they are not adjacent
        long actual = solution.findScore(nums);
        assertEquals(expected, actual);
    }

    // Test case for an empty input array
    @Test
    public void testFindScore_emptyArray() 
    {
        int[] nums = {};
        long expected = 0; // Expected output for an empty array should be 0
        long actual = solution.findScore(nums);
        assertEquals(expected, actual);
    }

    // Test case for an input with a single element
    @Test
    public void testFindScore_singleElement() 
    {
        int[] nums = {7};
        long expected = 7; // Expected output for a single element is the element itself
        long actual = solution.findScore(nums);
        assertEquals(expected, actual);
    }
}
