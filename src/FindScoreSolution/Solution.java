package FindScoreSolution;

import java.util.PriorityQueue;
import java.util.List;

public class Solution 
{
    public long findScore(int[] nums) 
    {
        // Get the length of the input array
        int n = nums.length;

        // Array to track visited indices
        boolean[] vis = new boolean[n];

        // Priority queue to hold numbers with their indices, sorted by number and then by index
        PriorityQueue<int[]> q = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        // Populate the priority queue with numbers and their indices
        for (int i = 0; i < n; ++i) 
        {
            q.offer(new int[] {nums[i], i});
        }

        // Variable to accumulate the score
        long ans = 0;

        // While there are still elements in the priority queue
        while (!q.isEmpty()) 
        {
            // Get the smallest element from the priority queue
            var p = q.poll();

            // Add the value to the score
            ans += p[0];

            // Mark the index as visited
            vis[p[1]] = true;

            // Mark adjacent indices as visited
            for (int j : List.of(p[1] - 1, p[1] + 1)) 
            {
                if (j >= 0 && j < n) 
                {
                    vis[j] = true;
                }
            }

            // Remove any visited elements from the priority queue
            while (!q.isEmpty() && vis[q.peek()[1]]) 
            {
                q.poll();
            }
        }

        // Return the total score
        return ans;
    }

    public static void main(String[] args) 
    {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 3, 3, 5, 4};
        long result1 = solution.findScore(nums1);
        System.out.println("Test Case 1: " + result1); // Expected output: 8

        // Test case 2
        int[] nums2 = {5, 1, 3, 1, 5};
        long result2 = solution.findScore(nums2);
        System.out.println("Test Case 2: " + result2); // Expected output: 6

        // Test case 3
        int[] nums3 = {2, 4, 6, 8, 10};
        long result3 = solution.findScore(nums3);
        System.out.println("Test Case 3: " + result3); // Expected output: 30

        // Test case 4 (empty array)
        int[] nums4 = {};
        long result4 = solution.findScore(nums4);
        System.out.println("Test Case 4: " + result4); // Expected output: 0

        // Test case 5 (single element)
        int[] nums5 = {7};
        long result5 = solution.findScore(nums5);
        System.out.println("Test Case 5: " + result5); // Expected output: 7
    }
}
