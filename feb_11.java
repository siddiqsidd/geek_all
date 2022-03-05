package f7;
import java.util.Arrays;
//1.
public class feb_11 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxProduct(new int[] {10,20,30,40,50})));
		}
	public static int[] maxProduct(int[] arr) {
		int size=arr.length;
		int max1=arr[0],max2=Integer.MIN_VALUE;
		int min1=arr[0],min2=Integer.MAX_VALUE;
		for(int i=1;i<size;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2) {
				max2=arr[i];
			}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		if(max1*max2>min1*min2)
			return new int[]{max2,max1,max1*max2};
		else
			return new int[]{min2,min1,min1*min2};
	}
}
//2.
public class unique {
    public static void main(String[] args){
        System.out.println(isUnique(new int[] {1,2,3,4,5,6}));
    }

public static boolean isUnique(int[] arr) {
		int temp[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]=temp[arr[i]]+1;
		}
		for(int val:temp) {
			if(val>1)	return false;
		}
		return true;
	}
}
//3.
public class permutaion{
    public static void main(String[] args){
      int array1[]= {5,1,2,3,4};
      int array2[]= {1,2,3,4,5};
		System.out.println(permute(new int[]{5,1,2,3,4},new int[] {1,2,3,4,5},0));
    }
	public static boolean permute(int[] array1, int[] array2, int start) {
		if(start==array2.length-1) {
		}
		for(int i=start;i<array2.length;i++) {
			int temp=array2[start];
			array2[start]=array2[i];
			array2[i]=temp;
			permute(array1,array2,start+1);
			if(Arrays.toString(array1).equals(Arrays.toString(array2)))
				return true;
			array2[i]=array2[start];
			array2[start]=temp;
		}
		return false;
	}
}
//4.
public class middleprogram{
    public static void main(String[] args){
      
		System.out.println(Arrays.toString(middle(new int[] {1,2,3,4})));

    }
	public static int[] middle(int[] arr) {
		int temp[]=new int[arr.length-2];
		int count=0;
		for(int i=1;i<=arr.length-2;i++) {
			temp[count++]=arr[i];
		}
		return temp;
	}
}