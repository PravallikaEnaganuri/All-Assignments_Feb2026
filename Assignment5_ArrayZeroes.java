package WeeklyAssignments;

public class Assignment5_ArrayZeroes {
	static void moveZeroes (int arr[])
	{
		int pos =0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				int temp = arr[pos];
				arr[pos] = arr[i];
				arr[i]= temp;
				pos++;
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {1,0,2,0,3};
	
}
}

