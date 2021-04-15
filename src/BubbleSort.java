public class BubbleSort 
{
	public static void main(String[] args) {
		int i, j, temp;
		int a[] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
		for(i=0; i<10; i++)
		{
			for(j=i+1; j<10; j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Printing the Sorted array : ");
		for(i=0; i<10; i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}
}
