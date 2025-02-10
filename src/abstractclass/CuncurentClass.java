package abstractclass;

public class CuncurentClass extends AbstractSubclass{
    public CuncurentClass(int inc1, int inc2){
        super(inc1, inc2);
    }
    public static void main(String[] args) {

        AbstractSuper c = new CuncurentClass(1,2);
        c.foo();
        c.bar();
      int cval = c.compute();
        System.out.println("cval : " + cval);
    }
    @Override
    public int bar(){
//        System.out.println("bar: " + 20);
        return 20;
    }
}
