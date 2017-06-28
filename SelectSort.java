/**
 * @author dzq
 * @date createtime： 2017年4月25日下午4:35:15
 * @version 1.0
 */
package career_test;

public class SelectSort
{
	public static void select(int[] array){
		int n = array.length;
		int i,j,min=0;
		for(i=0;i<n;i++){
			min = i;
			for(j=i+1;j<n;j++){
				if(array[j]<array[min]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp; 
		}
	}
	public static void main(String[] args)
	{
		int[] array = { 4, 1, 6, 8, 7, 2, 5, 9 };
		for(int a:array){
			System.out.print(a+" ");
		}
		System.out.println("\r");
		select(array);
		for(int a:array){
			System.out.print(a+" "); 
		}
	}
}
