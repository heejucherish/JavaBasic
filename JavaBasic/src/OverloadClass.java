public class OverloadClass {
    public static void main(String[] args) {
        System.out.println(add(50,100));
        System.out.println(add(30,10,30));
        System.out.println(add(1,2,3,4,5,6,7));

    }
    public static int add(int x, int y ) {
        return x+y;
    }

    public static int add(int x, int y, int z) {
        return x+y+z;

    }

    public static int add(int... numbers) {
        int sum  = 0;
        for (int i = 0; i < numbers.length; i ++){
            sum = sum+i;
        }
        return sum;
    }
}
