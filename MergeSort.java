/**
 * @author dzq
 * @date createtime： 2017年4月26日上午9:05:19
 * @version 1.0
 */
package career_test;

public class MergeSort
{
	public static void merge(int[] array, int left, int right, int temp[])
	{
		if (left < right)
		{
			int mid = (left + right) / 2;
			merge(array, left, mid, temp);
			merge(array, mid + 1, right, temp);
			mergearray(array, left, mid, right, temp);
		}
	}

	private static void mergearray(int[] array, int left, int mid, int right,
			int[] temp)
	{
		int i = left, j = mid + 1;
		int m = mid, n = right;
		int k = 0;
		while (i <= m && j <= n)
		{
			if (array[i] <= array[j])
			{
				temp[k++] = array[i++];
			}
			else
			{
				temp[k++] = array[j++];
			}
		}
		while (i <= m)
		{
			temp[k++] = array[i++];
		}
		while (j <= n)
		{
			temp[k++] = array[j++];
		}
		for (i = 0; i < k; i++)
		{
			array[left + i] = temp[i];
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
		int n = array.length;
		int[] temp = new int[n];
		merge(array, 0, n - 1, temp);
		for (int a : array)
		{
			System.out.print(a + " ");
		}
	}
}
