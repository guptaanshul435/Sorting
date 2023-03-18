//Selection Sort
class SelSort
{
  public static void main(String[] args1){
  int a[]={10,3,4,2,5,5,5,4,3,4};
  int min,temp;
  for(int i=0;i<10;i++)
  {
	  min=i;
	  for(int j=i+1;j<10;j++){
		  if(a[j]<a[min])
		  {
			  min=j;
		  }
	  }
	  temp=a[i];
	  a[i]=a[min];
	  a[min]=temp; 
  }
  for(int i=0;i<10;i++)
  {
	  System.out.println(a[i]);
  }
  }
}