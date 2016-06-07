package cats;

import animals.animal;
import java.util.Scanner;

interface  cCat{
    public abstract void doMeow();
    public  abstract void eat();

}
public class cat extends animal implements cCat{
    public void doMeow(){
        Scanner name_cat = new Scanner(System.in);
        String Name_cat;

        Name_cat= name_cat.nextLine();
        System.out.println("my name is " + Name_cat + " Meow-meow");
    }

    public void eat() {

    }
}