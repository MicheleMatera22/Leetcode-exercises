package Es2;

import java.util.Queue;
import java.util.LinkedList;
public class solution {
    public static void main(String[] args)
    {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        Queue<Integer> idx  = new LinkedList<Integer>();
        Boolean find = false;

        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("i: " + i);
            if(nums[i] != val)
            {
                k++;
                System.out.println("K = " + k);
                if(find)
                {
                    nums[idx.poll()] = nums[i];
                    idx.add(i);
                    //find = false;
                }
            }
            else
            {
                find = true;
                idx.add(i);
                System.out.println("Head: " + idx.peek());
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        return k;
    }
}
