public class GenericMethod {
    public static void main(String[] args) {
    print("안녕");
    print(1);
    }

    public static <T> void print(T type) {
        System.out.println(type);
    }

}
