package animals;
import java.util.Scanner;
import cats.*;
import dogs.*;
public class animal {

    private int foodWeight;
    private int weight_dog;
    private int weight;
    public String getName() {
        Scanner tik = new Scanner(System.in);
        String name;
        name=tik.nextLine();
        return name;
    }
    public void  eat(){
        Scanner tot = new Scanner(System.in);

        weight = tot.nextInt();
        foodWeight= tot.nextInt();

        int Weight_cat =weight + foodWeight;
        System.out.println("Meo-meow, when i am fed my w is:" + Weight_cat);
    }

    public void eat(Food food){
        Scanner tak = new Scanner(System.in);
        weight_dog=tak.nextInt();
        int Weight_dog= weight_dog + foodWeight;
        System.out.println("Gaw-gaw, when i am fed my w is:" + Weight_dog);
    }

    static interface Food{
        public void getDoseWeight();
    }

    public class Foood implements animal.Food{
        public void getDoseWeight() {

            System.out.println("my normal doseweight if i am a dog : " + weight_dog);
            System.out.println("my normal doseweight if i am a cat : " + weight);
        }
    }


}

