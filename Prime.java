class Prime{
  public static void main(String []args)
{ 
  for(int i=0 ;i<100;i++)
{ int count=0;
for( int j=i;j>=1;j--)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println(i);
}
}
}