package practise;

public class app_TwoSum {

	public static void main(String[] args) 
	{	int[] a={2,7,11,15};
		int target=9;
		int[] ans;
		ans=twoSum(a,target);
		System.out.print("{");
		for(int i=0;i<ans.length;i++)
		{
			if(i==0) System.out.print(ans[i]+",");
			else System.out.print(ans[i]);
		}
		System.out.print("}");
		
	}
	public static int[] twoSum(int[] nums, int target) 
	{	int[] ans={0,0};
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        	{
        	if(target-nums[j]==nums[i])
        		{	ans[0]=nums[i];
        			ans[1]=nums[j];
        		}
        	}
        }
		return ans;
    }
}
