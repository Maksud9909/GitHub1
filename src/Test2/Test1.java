package Test2;

public class Test1 {
    public static void main(String[] args) {
        System.out.println( intMax(10,40,32));
    }
    public static int intMax(int a, int b, int c) {
        int max;

        if(a>b){
            max = a;
        }else {
            max = b;
        }
        if (max<c){
            max = c;
        }

        return max;


    }

}
