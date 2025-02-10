package basics;

public class BasicsOfArrays {
    public static void main(String[] args){
//        int arr[] = new int[5];// array declearation and allocation
//        String names[] = new String[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your names");
//        // taking user input in an array
//        for(int i=0;i<5;i++){
//            names[i] = sc.next();
//        }
//        // printing names data using "for each loops"
//        for(String name : names){
//            System.out.println("for each  " + name);
//        }

        // fin minimum no. in an array
        int age[] = new int[]{23,45,65,98,32};
//for size we can use age.length
        int mini = Integer.MAX_VALUE;
        for(int it : age)
        {
            if(mini > it){
            mini = it;
            }
        }
        System.out.println("the minimunm no. is "+ mini);

    }

}
