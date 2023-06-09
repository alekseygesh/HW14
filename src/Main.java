import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] myArray = new int[15];

        for (int i = 0; i<15; i++){
            myArray[i] = (int) (Math.random()*42-21);
        }

        int min = myArray[0];
        for(int i : myArray){
            min = Math.min(min, i);
        }

        int max = myArray[0];
        for(int i : myArray){
            max = Math.max(max, i);
        }

        int maxMod = Math.abs(myArray[0]);
        for(int i : myArray){
            maxMod = Math.max(maxMod, Math.abs(i));
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Максимальное число по модулю: " + maxMod);

    }
}