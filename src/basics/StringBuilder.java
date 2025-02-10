package basics;

public class StringBuilder {
    public static void main(String[] args) {
//         this is mutable unlike string which is immutable
        java.lang.StringBuilder sb = new java.lang.StringBuilder("t");
        sb.append("o");
        sb.append("n");
        sb.append("y");
        System.out.println(sb);
        // it has many functions
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // second functions
        sb.insert(2,'s');
        sb.delete(2,3);// delete function of string builder
        System.out.println(sb);



        // write a program to reverse an array
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder("hello");
        for(int i=0; i<sb1.length()/2; i++){
        int Front = i;
        int back = sb1.length()-i-1;
        char frontchar = sb1.charAt(Front);
        char backchar = sb1.charAt(back);

        sb1.setCharAt(Front, backchar);
        sb1.setCharAt(back, frontchar);

        }
        System.out.println("the reverse string is  " + sb1);
        // stringBuffer is similar to string buffer but the difference is that buffer is thread safe due to synchronization while
        // builder is not threaded safe due to asynchronization and buffer is slow while builder is fast..

    }
}
