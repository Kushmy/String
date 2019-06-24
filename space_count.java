package strings;
import java.util.Scanner;
public class space_count {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int space=0;
		for(int count=0;count<str.length();count++)
		{
			if(str.charAt(count)==' ')
				space++;
		}
		System.out.println(space-1);
	}
}
