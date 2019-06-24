package strings;

import java.util.Scanner;
public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int count=1;
		for(int counter=0;counter<str.length()-1;counter++)
		{
			if((str.charAt(counter)==' ') && (str.charAt(counter+1)!=' '))
				count++;
		}
		System.out.println(count);

	}

}
