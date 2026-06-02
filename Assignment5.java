package WeeklyAssignments;

public class Assignment5 {

	public static void main(String[] args) {
		//Second Smallest num
		int [] arr = {4,3,7,2,9,1};
		int smallest = arr[0];
		int secSmallest = arr[0];
	
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println(smallest);
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<secSmallest && arr[i]>smallest)
				secSmallest = arr[i];
		}
		System.out.println(secSmallest);
	}

}
