package problem3;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {

		int i=1;

		final int MAXSIZE = 5;  //Change this to change n
		
		while(!(i>MAXSIZE))  
		{
			System.out.print(String.join("", Collections.nCopies(MAXSIZE-i, ".")));
			System.out.print(String.join("", Collections.nCopies(i, Integer.toString(i))));
			System.out.println("");
			i++;
		}
	}
}