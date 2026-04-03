package WeeklyAssignments;

public class Assignment4_DigitTransformationLogic {
	public static void main(String[] args) {
	
	int num = 57243;
	while( num!=0) {
		int lastdigit = num%10;
		num = num/10;
	
		if(lastdigit<=4 ) {
			System.out.print(lastdigit*2);
		}
		else if(lastdigit>4){
			System.out.print(lastdigit);
		}
		else {
			System.out.print("1");
		}
	}	
	}
}

