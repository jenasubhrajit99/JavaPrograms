public class SwapAdjacent
{
	public static void main(String[] args) {
		int[] arr= {56, 57, 58, 59, 60, 61};
		new SwapAdjacent().swap(arr);
	}

//	private void swap(int[] arr) 
//	{
//		int temp=0;
//		for(int i=0; i<arr.length-1; i=i+2)
//		{
//			temp=arr[i];
//			arr[i]=arr[i+1];
//			arr[i+1]=temp;
//		}
//		for(int a:arr)
//		{
//			System.out.print(a+" ");
//		}
//		
//	}
	
	private void swap(int[] arr) {
		int temp=0;
		if(arr.length%2!=0)
		{
			for(int i=0; i<arr.length-1;i+=2)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		else
		{
			for(int i=0; i<arr.length;i+=2)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}
	
	
}
