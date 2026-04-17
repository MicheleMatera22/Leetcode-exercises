package Es1;

public class solution {
    public static void main(String[] args){
        int nums1[] = {0};
        int nums2[] = {1};
        int m = 0;
        int n = 1;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i-m];
        }

        /**/
        
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = i + 1; j < nums1.length; j++)
            {
                if(nums1[i] > nums1[j])
                {
                    int t = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = t;
                }
            }
        }

        for(int i = 0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }

    }
}
