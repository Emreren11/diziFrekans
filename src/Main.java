import java.util.Arrays;

public class Main {
    static boolean repeatNumbers(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) // Bu metotta karşılaştırma yaptığımız sayı daha önceden kontrol edildiyse, kontrol edilmesiyse true döndürüyoruz
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Dizide Frekans => Bir dizideki elemanın tekrar ettiği sayısıdır
        int[] numbers = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(numbers) + "\nTekrar Sayıları");
        for (int i = 0; i < numbers.length; i++) {
            int repeat = 1;
            for (int j = i; j < numbers.length; j++) {
                if ((i != j) && numbers[i] == numbers[j])
                    repeat++;
            }
            if (repeatNumbers(numbers, i)) // dizi elemanının kontrolu yapılmadıysa kaç kere tekrar ettiğini yazdırıyoruz
                System.out.println(numbers[i] + " sayısı " + repeat + " kere tekrar edildi.");
        }
    }
}