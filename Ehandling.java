class Ehandling{  
  public static void main(String args[]){  
   
    try{  
      int data=100/0;  
   }catch(ArithmeticException  e){System.out.println(e);}  
   System.out.println(" program is still running ");
  

 try{String str = null; 
        System.out.println(str.length());}
catch(NullPointerException e) {System.out.println(e);}
System.out.println(" program is still running ");
  
} }