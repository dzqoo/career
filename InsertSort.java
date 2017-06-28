/**
 * @author dzq
 * @date createtime： 2017年4月25日下午4:21:15
 * @version 1.0
 */
package career_test;

public class InsertSort
{
	public static void insert(int[] array){
		int n = array.length;
		for(int i=0;i<n;i++){
			for(int j=i;j>0 && array[j-1]>array[j];j--){
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] array = { 4, 1, 6, 8, 7, 2, 5, 9 };
		for(int a:array){
			System.out.print(a+" ");
		}
		System.out.println("\r");
		insert(array);
		for(int a:array){
			System.out.print(a+" "); 
		}
	}
}
