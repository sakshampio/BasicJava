package basics;

public class Practice {
    int roll;
    String name;
    int age;

    Practice(int roll  , String name, int age){
    this.roll = roll;
    this.name = name;
    this.age = age;
}
public String toString(){// tostring  will overwride the objects output
        return roll + " " +name+" " + age;
}


    public static void main(String[] args) {
        Practice p1 = new Practice(101,"rahul", 21);
        Practice p2 = new Practice(102,"vishal", 25);
        System.out.println(p1); // here without tostring function it will print hashcode/reference values of these objects to overcome this w create an tostring methos which is overwride by the java itself
        System.out.println(p2);
        // string forating there are format specifiers are :- %s, %c,%d,%x,%f
        String s1 = "Saksham";
        String s2 = "Garg";
//        System.out.println(String.format("%s %s ", s1,s2));
        String s3 = String.format("%s %s ", s1,s2) ;
//        System.out.println(s3);

    }
}
