package NormalPractice;

public class SegrigateIntegersFromAnArray {

	public static void main(String[] args) {
int[] num= {3,5,1,7,3,2,8,9,1,4,6};
for(int i=0;i<num.length;i++)
{
	for(int j=i+1;j<num.length;j++)
	{
		if(num[i]==num[j])
		{
		System.out.print(num[i]+" ");	
		}
	}
}
}
	}


