/**
 * @author Abdul Qadir
 * @date 3 Mar 2026
 * @time 11:27:35 am
 */
package oops;
abstract class Super {
   public Super(){
       System.out.println("Super Constructor");
   }
   
   public void meth1(){
       System.out.println("meth1 of super");
   }
   abstract public void meth2();
   
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub meth2");
    }
}

public class TestAbs {
    public static void main(String args[]){
        Super s = new Sub();
        s.meth1() ;
    }
    
}