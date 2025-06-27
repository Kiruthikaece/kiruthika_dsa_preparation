import java.util.Arrays;

public class ArraysJava {

	public static void main(String[] args) {
			
		int[] arr= {10,20,30};
		
		//reverse1(arr);   // the first method original array changed
		//System.out.println();
	    //printfirstLast(arr);  // in the first method reflection original array is return of first method
		
		//findElement(arr,30);
		
		float[] arr2= {10.2f,11.2f,12.3f};
		copyArray(arr2);

	}

	private static void copyArray(float[] arr) {
		float[] res=Arrays.copyOf(arr, 5);
		System.out.println("length of copy array:"+res.length+" first element:"+res[4]);
		
		float[] res2=new float[9];
				res2=Arrays.copyOfRange(arr, 0, 6);
				System.out.println(Arrays.toString(res2));
	}

	private static void findElement(int[] arr, int ele) {
		System.out.println(Arrays.binarySearch(arr,ele));
	}

	private static void printfirstLast(int[] arr) {
		System.out.println(arr[0]+"first.."+arr[arr.length-1]+"last..");
	}

	private static void reverse1(int[] arr) {
		int first=0,last=arr.length-1;
		
		while(first<last) {
			int temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			first++;
			last--;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}

//Arrays Method

// 1. Arrays.fill- fill the certain value to whole array  Arrays.fill(arrname,-1);

// 2. binarySearch-  return index of the element 
//  if there is no element get negative insert position. ex:ele=5 get -1,ele=90 get -4 in above array.


// 3. copyOf() - used for copy the old array to new Array and also change the size of new Array.

// copyofRange()- used for copy the old array but we have assign index to index-1 only copy.

// 4. equals() - compare value only b/w 2 arrays. deepEquals() - compare values and also "reference" are same or null.

//





