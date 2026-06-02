package WeeklyAssignments;

public class Assignment4_DigitTransformationLogic {
	public static void main(String[] args) {
	
	int num = 57243;
	String newNum ="";
	int pos= 0;
	while( num>0) {
		pos++;
		int lastdigit = num%10;
		
		if(pos%2!=0 && lastdigit<=4 ) {
			newNum = newNum+""+lastdigit*2;
		}
		else if(pos%2!=0 && lastdigit>4){
			newNum = newNum+""+lastdigit;
		}
		else if (pos%2 ==0 ){
			newNum = newNum+""+1;
		}
		num = num/10;
	}
	System.out.println(newNum);
	StringBuilder sb = new StringBuilder(newNum);
	sb.reverse();
	System.out.println(sb);
	int output = Integer.parseInt(sb+"");
System.out.println(output);
	}
}

