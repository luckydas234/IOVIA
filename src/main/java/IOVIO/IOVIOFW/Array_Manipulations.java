package IOVIO.IOVIOFW;

public class Array_Manipulations 
{
	/*
	 * bubblesort binarysearch swapping in array duplicates in array array to list
	 * common elements between two arrays
	 */
	
	public static void main(String[] args) {
		
		duplicates_in_Array();
		addition_2D_array();
		bubblesort();
		binarySearch();
		swapArray();
	}
	
	public static void duplicates_in_Array()
	{
		int[] a= {1,2,8,9,0};
		int[] b= {1,2,3,4,6,7};
		
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<b.length;j++)
		{if(a[i]==b[j])
			{
			System.out.println(a[i]);
			
			}}
			
		
		}
	}
	
	public static void addition_2D_array()
	{
		int[][] a= {{1,2,3},{5,6,8}};
		int[][] b= {{2,6,3},{9,6,8}};
		int[][] c= new int [2][3];
		for(int i=0;i< 2;i++)
		{for(int j=0;j< 3;j++)
			{
			
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]);
			}}
		
		
	}
	
	public static void bubblesort()
	{
		int[] a= {1,2,3,6,8,9};
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
						{temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						}
			}
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
	}
	
	public static void binarySearch()
	{
		int[] a= {1,2,3,4,5,6};
		int end=a.length-1;
		int start=0;
		int key=5;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==a[mid])
			{
				System.out.println(mid);
				break;
			}
			else if(key>a[mid])
			{start=mid+1;}
			else if(key<a[mid])
			{end=mid-1;}
			
		}
	}
	
	public static void swapArray()
	{int[] a= {1,2,3,4,5,6};
	int temp;
	
	for(int i=0;i<=a.length/2-1;i++)
	{
		temp=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=temp;
	}
	System.out.println("--------");
	for(int j=0;j<a.length;j++)
	{System.out.println(a[j]);}
	
	}

}
