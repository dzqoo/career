/**
 * @author dzq
 * @date createtime： 2017年4月25日下午3:25:59
 * @version 1.0
 */
package career_test;


public class BubbleSort
{
	public static void bubbleSort(int[] array)
	{
		int n = array.length;
		if (n == 0)
		{
			System.out.println("输入非法");
		}
		else
		{
			int i, j;
			for (i = 0; i < n; i++)
			{
				for (j = 1; j < n - i; j++)
				{
					if (array[j-1] >= array[j])
					{
						int temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] array = { 4, 1, 6, 8, 7, 2, 3, 9 };
		for(int a:array){
			System.out.print(a+" ");
		}
		System.out.println("\n");
		bubbleSort(array);
		for(int a:array){
			System.out.print(a+" ");
		}
	}
}
