package NormalPractice;

public class PalindromeNumber {

	public static void main(String[] args) {
int n=222,c,s=0,r;
c=n;
while(n>0)
{
	r=n%10;
	s=(s*10)+r;
	n=n/10;
}
if(c==s)
{
	System.out.println("It is Palindrome number .  ");
}
else
{
	System.out.println("It is not a Palidrome Number .");
}
	}

}
