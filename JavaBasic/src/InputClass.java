import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int i = scanner.nextInt();
        long l = scanner.nextLong();

        System.out.println(scanner.next());
    }
}
