package abstractclass;

public  abstract class AbstractSubclass extends AbstractSuper {
    public AbstractSubclass(int inc1, int inc2){
        super(inc1, inc2);
    }
    public int foo(){
//        System.out.println("foo : " + 10);
        return 10;
    }

}
