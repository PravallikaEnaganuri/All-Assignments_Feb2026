package WeeklyAssignments;

public class Assignment4_PrimeFactorsOfANumber {

	public static void main(String[] args) {
		// Prime Factors of A Number
		int num = 60;
		for(int i =2;i<=num;i++) {
			while(num%i==0) {
		System.out.println(i+ " ");	
			num=num/i;
			if(i==i) {
				i++;
			}
			}
		    }

	}

}
