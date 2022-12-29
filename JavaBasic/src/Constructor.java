import models.Person;
import models.Magician;
import models.Hero;
import models.Character;
import models.ICharacter;

import java.util.ArrayList;

public class Constructor {
    public static void main(String[] args) {
        System.out.println(add(50,100));
        System.out.println(add(30,10,30));
        System.out.println(add(1,2,3,4,5,6,7));
        Person person = new Person();
        Person person2 = new Person("홍길동",128);


        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("아이언맨");
        hero.attack(hero2);

        Character character = new Hero("슈퍼맨");
        Magician magician = new Magician();
        Magician magician2 = new Magician();

        ICharacter magician3 = new Magician();

        if(magician2 instanceof Magician){
            System.out.println("true");
        }

        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(magician);
        characterArrayList.add(magician2);
        characterArrayList.add(hero);

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

