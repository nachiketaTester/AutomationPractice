package NormalPractice;

public class Segrigate_Duplicate_elementFrom_anArray {

	public static void main(String[] args) {
String[] name= {"Pupun","Sipun","Pupun","Ditun","Datu","Latu","Datu"};
for(int i=0;i<name.length;i++)
{
	for(int j=i+1;j<name.length;j++)
	{
		if(name[i].equals(name[j]))
		{
			System.out.print(name[i]+" ");
		}
	}
}
	}

}
