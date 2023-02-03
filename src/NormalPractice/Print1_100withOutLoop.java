package NormalPractice;

public class Print1_100withOutLoop {

	public static void main(String[] args) {
printNum(1);
	}
public static void printNum(int num)
{
	if(num<=100)
	{
		System.out.print(num+" ");
		num++;
			printNum(num);
	}
}
}
