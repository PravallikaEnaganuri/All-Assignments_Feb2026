package WeeklyAssignments;

public class Assignment5_CheckSorted {

	static boolean isSorted(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<arr[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,4,5,6,7};
	
System.out.println(isSorted(arr));
	}

}
