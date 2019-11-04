class Solution 
{
    public void rotate(int[] nums, int k) 
    {
     k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) 
        {
            int current = start;
            int prev = nums[start];
            do 
            {
                nums[(current + k) % nums.length] = prev + nums[(current + k) % nums.length];
                prev = nums[(current + k) % nums.length] - prev;
                nums[(current + k) % nums.length] = nums[(current + k) % nums.length] - prev;
                current = (current + k) % nums.length;
                count++;
            } 
            while (start != current);
        }  
    }
}
