package IOVIO.IOVIOFW;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.cli.Main;
import okhttp3.internal.platform.Platform;

public class Demo {
static ArrayList al=new ArrayList();
	static int count=0;
	public static void main(String[] args) {
		
	
		int[] a= {8,5,4,8,4,9};
		Bubble_Sort(a);
		check_separate(a, al);

	}
	public static void Bubble_Sort(int[] input)
	{
	
	int n=input.length;
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(input[i]>input[j])
					{temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					}
		}
	}
	
	for(int k=0;k<n;k++)
	{
		System.out.println(input[k]);
	}
	System.out.print(Arrays.toString(input));
	}
	 
	
	public static void check_separate(int[] input,ArrayList al)
	{
		Object[] subarray = null ;
		int n=input.length;
		int temp;
		for(int i=1;i<n;i++)
		{
			
			if((input[i]-input[i-1])>1)
			{
				
				
				break;
				
			}
			else
			{
				al.add(input[i]);
				count++;
				removeTheElement(input, 
                        count-1);
				
			}
			 
					
		}
		
		
		System.out.println(al);
		System.out.println(count);
		
		}
	
	// Function to remove the element
    public static int[] removeTheElement(int[] arr, 
                                           int index)
    {
  System.out.println(index);
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
            || index < 0
            || index >= arr.length) {
  
            return arr;
        }
  
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
  
        // Copy the elements from starting till index
        // from original array to the other array
        System.arraycopy(arr, 0, anotherArray, 0, index);
  
        // Copy the elements from index + 1 till end
        // from original array to the other array
        System.arraycopy(arr, index + 1,
                         anotherArray, index,
                         arr.length - index - 1);
        
        System.out.println(anotherArray);
 
        // return the resultant array
        return anotherArray;
    }
	}
	


