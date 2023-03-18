//Selection Sort
class InsSort{
  public static void main(String[] args){
  int a[]={12,11,14,9,10,5,60,40,20,30};
  int value,hole;
  for(int i=0;i<10;i++)
  {
	 value=a[i];
	 hole=i;
	 while(hole>0 && a[hole-1]>value)
	 {
		 a[hole]=a[hole-1];
		 hole=hole-1;
	 }
	 a[hole]=value;
  }
  for(int i=0;i<10;i++)
  {
  System.out.println(a[i]);
  }
  }

}