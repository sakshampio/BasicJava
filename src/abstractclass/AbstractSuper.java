package abstractclass;

public  abstract  class AbstractSuper {
    public abstract int foo();
    public abstract int bar();
 public int inc1;
 public int inc2;
 protected AbstractSuper(int inc1, int inc2){
     this.inc1 = inc1;
     this.inc2 = inc2;
 }
 protected AbstractSuper(){

 }


 public int compute(){
     int fooval =  foo();
     if(fooval > 5){
         fooval += inc1;
     }
     int barval = bar();
     if(barval > 6 )
     {
         barval += inc2;
     }
     return fooval + barval;
 }

}
