
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {3, 87, 12, 98, 2, 4, 66};
        double[] doubleArray = {5.0, 4.3, 5.2, 7.5, 5.5, 6.4};
        int[] arrays = {6, 117, 44, 5, 32, 81, 9};
        System.out.println(Arrays.toString(getReverse(array)));
        System.out.println(Arrays.toString(sortArray(doubleArray)));
        sortByEven(arrays);
        System.out.println(Arrays.toString(getEven(arrays)));
    }
    public static int [] getReverse(int [] array){
         for(int i = 0; i < array.length / 2; i++){
             int temp = array[i];
             array[i] = array[array.length - 1 -i];
             array[array.length - 1 -i] = temp;
         }
         return array;
    }
    public static double [] sortArray(double [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++)
             if(array[j] < array[j + 1]){
                double temp = array[j];
                array[j] = array[j + 1];
                array[j +1] = temp;
            }
        }
        return array;
    }
    //Вывод в консоль чётных элементов массива. Первый вариант.
public static void sortByEven(int[] array){
    System.out.print("Вывод чётных элементов массива : ");
         for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print( + array[i] + " " );
            }
        }
    System.out.println();

}
/*Также можно вывести чётные элементы уже ввиде
 отсортированного по чётным элементам массива, записанного в новый массив.
 Второй вариант
 */
    public static int [] getEven(int [] array){
        int j = 0;
        int [] even = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                even[j] = array[i];
                j++;
            }
        }
        return Arrays.copyOf(even, j);
    }
}