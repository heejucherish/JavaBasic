import java.util.ArrayList;

public class LengthClass {
    public static void main(String[] args) {
        int [] score = {10, 20, 30 , 40 , 50};
        int count = score.length;
//        System.out.println(count);

        String[] names = new String[2];

        ArrayList<Integer> scoreList= new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);
        scoreList.add(40);
        scoreList.add(50);

        scoreList.add(2,200);
        scoreList.remove(2);

//        System.out.println(score[score.length -1]);
//        System.out.println(names[0].length());
        System.out.println(scoreList);

    }
}
