/**
 * @author dzq
 * @date createtime： 2017年4月25日下午8:13:31
 * @version 1.0
 */
package career_test;

public class QuickSort
{
	public static void quick(int[] array, int l, int r)
	{
		if (l < r)
		{
			int i = l, j = r;
			int mid = array[l];
			while (i < j)
			{
				while (i<j && array[j] >= mid)
				{
					j--;
				}
				array[i] = array[j];
				while (i<j && array[i] <= mid)
				{
					i++;
				}
				array[j] = array[i];
			}
			array[i] = mid;
			quick(array, l, i - 1);
			quick(array, i + 1, r);
		}

	}

	public static void main(String[] args)
	{
		int[] array = { 4, 1, 6, 8, 7, 2, 5, 9 };
		for (int a : array)
		{
			System.out.print(a + " ");
		}
		System.out.println("\r");
		int n = array.length - 1;
		quick(array, 0, n);
		for (int a : array)
		{
			System.out.print(a + " ");
		}
	}
}
