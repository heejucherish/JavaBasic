public class TernaryOperator {

    public static void main(String[] args) {
        boolean isMarried = true;

        String str;
        str = isMarried ? "결혼했다" : "미혼이다";

        if (isMarried){
            str = "결혼 했다";
        } else {
            str = "결혼 안 했다";
        }

        switch (str){
            case "결혼 했다":
                System.out.println("O");
                break;
            case  "결혼 안 했다":
                System.out.println("X");
                break;
            default:
                System.out.println("?");
        }

        System.out.println(str);
    }
}
