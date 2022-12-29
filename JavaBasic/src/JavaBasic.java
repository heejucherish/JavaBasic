public class JavaBasic {
    public static void main(String[] args) {
       // 정수
        long l = 30L;
        int x = 30 ;
        short s = 30;
        byte b = 30;

        int i = (int) 30L;
        long ll = 30; // int

        double dd = 30.0;
        float ff = 30.0f;
        dd = ff;
        ff = (float) dd;

        boolean isMarried = false;
        isMarried = true;


        char c = 'a';
        char cc = '한';

        String str = "여러 글자";

        System.out.printf("저는 %s입니다. 나이는 %d살 이구요, 키는 %fcm입니다 \n", "홍길동", 20, 160.5f);

        String str2 = String.format("저는 %s 입니다. 나이는 %d이고요, 키는 %fcm 입니다.", "홍길동", 20, 170.5f);

        System.out.println(str2);
    }
}
