class Sum{
 public int sum(int x,int y){
 return x+y;}
  public int sum(int x, int y , int z)
{
 return z+x+y;
}
public double sum( double x, double y)
{
 return x+y;
 }}
 class Mloading{
  public static void main ( String []args)
{
Sum s=new Sum();
 System.out.println( s.sum(10,20));
 System.out.println( s.sum(10,20,30));
System.out.println( s.sum(10.3,20.4));
}}