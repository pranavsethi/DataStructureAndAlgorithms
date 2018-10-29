package examples.personal.StringOperations;


/**
 * 
 * Below class has the method which will find all the permutations from a string 
 * We will use recursive approach to solve this issue
 * 
 * Algorithm : Suppose we have a string a b c so by maths we should have factorial(4) permutations for this = 3*2*1=6
 * We will start recursive function to which we will pass, str, left index =0 and right index =string length-1
 * Base condition will be if left ==right, print string
 * 
 * Else
 * Run the loop from i=l to i<=r
 * We will swap i with l element and pass it to permutation function
 * 
 * Dry Run :
 * a b c
 * 
 * l=0, r=2 since l != r go to the loop swap l=0 with i=0 same element, i.e swap a with a and pass func(abc,1,2)
 * swap again a with a so string is same "a b c"
 * 
 * 
 * 
 * 
 * @author swetavk
 *
 */

public class StringPermutation {
	
	
	
	public void FindAllPerm(String str, int l, int r)
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				FindAllPerm(str,l+1,r);
				str=swap(str,l,i);
			}
		}
		
		
	}
	
	public String swap(String str, int i, int j)
	{
		char[] strChar= str.toCharArray();
		char temp=strChar[i];
		strChar[i]=strChar[j];
		strChar[j]=temp;
		
		return String.valueOf(strChar);
	}
	
	public static void main(String args[])
	{
		String str="abc";
		
		int n= str.length();
		StringPermutation obj = new StringPermutation();
		obj.FindAllPerm(str,0,n-1);
		
	}

}
