// Подключаем библиотеку
import java.util.Arrays;
import java.util.Random;

public class Xtwoarray {

    public static void main(String[] args) {

        // Переменные и массивы и рандом.
        Random randomnumber = new Random(); // Создаём рандом
        int size = randomnumber.nextInt(20);
        int [] number = new int[size]; // Первый массив


        // Заполнение массива рандомными числами.
        for (int i = 0; i < size ; i++) {
            number[i] = randomnumber.nextInt(20);
        }
        System.out.println(Arrays.toString(number)); // Выводим на консоль элементы первого массива

        for (int i = 0; i < size / 2; i++){
            int tem = number[size - i - 1];
            number[size - i - 1] = number[i];
            number[i] = tem;
        }
        System.out.println(Arrays.toString(number)); // Выводим на консоль элементы первого массива
    }
}
