import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int[] people = new int[1];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }
        double summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
            System.out.println(" Средний возраст:" + summ / people.length);

        }
    }
}




