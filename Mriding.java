class Parent{
 void show(){
  System.out.println("parent show");
}}
class Child extends Parent {
 void show (){
  System.out.print("child show");}
}
class Mriding{
  public static void main(String args[]){
 Parent obj= new Parent();
obj.show();
Child obj1= new Child();
 obj1.show();
}}