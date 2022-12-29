import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(4) +5; //5~9
        //0 ~ 4 => 5~ 14
        //5 ~ 9

        System.out.println(rand);
    }
}
