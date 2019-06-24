package guvi1;
import java.util.Scanner;
public class count_the_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(str.replaceAll(" ","").length());

	}

}
