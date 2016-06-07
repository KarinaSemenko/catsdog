package dogs;

import java.util.Scanner;
import animals.animal;

interface dDog{
    public abstract void doBark();
    public abstract void eat();

}
public class dog  extends animal implements dDog {
    public void doBark(){
        Scanner name_dog = new Scanner(System.in);
        String Name_dog;
        Name_dog=name_dog.nextLine();
        System.out.println("my name is " + Name_dog + " Gaw-gaw");
    }

    public void eat() {

    }
}