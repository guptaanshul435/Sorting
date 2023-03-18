//Bubble Sort
class BubSort{
  public static void main(String[] args)
  {
   int[] a={12,10,13,14,9};
   int temp;
   for(int i=0;i<5;i++)
   {
    for(int j=0;j<5-1;j++)
	{
	 if(a[j+1]<a[j])
	 {
	  temp=a[j+1];
	  a[j+1]=a[j];
	  a[j]=temp;
	 }
	}
   }
   for(int i=0;i<5;i++)
   {
   System.out.println(a[i]);
   }
  }
}