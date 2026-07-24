class SortREVNor
{
	public static void main(String args[])
	{
	int a[]={9,1,3,5,6,11,22,66,10,19};
	
	for( int i=0; i<a.length/2; i++ )
	{
		for(int j=i+1; j<a.length/2 ; j++)
		{
			if(a[i]<a[j])
			{
				int temp  = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}

	
	for( int i=a.length-1 ; i<a.length/2; i-- )
	{
		for(int j=i-1; j>=a.length/2 ; j--)
		{
			if(a[i]>a[j])
			{
				int temp=a [i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
/*
=======================================
OUTPUT:

9 6 5 3 1 11 22 66 10 19

*/
	
	