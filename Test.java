import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tam sayı giriniz: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        System.out.print(number + " sayısının küçükten büyüğe çarpanları yığına ekleniyor...\n");

        // En küçük asal çarpanları bulup yığına ekliyoruz
        int factor = 2;
        int tempNumber = number;

        while (tempNumber > 1) {
            if (tempNumber % factor == 0) {
                stack.push(factor); // Çarpanı yığına at (2, 2, 2, 3, 5 şeklinde eklenecek)
                tempNumber /= factor;
            } else {
                factor++;
            }
        }

        // Yığından çıkan elemanlar LIFO (Son Giren İlk Çıkar) prensibiyle tersten (büyükten küçüğe) yazdırılır
        System.out.print("Çarpanların azalan sırayla dizilimi: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        input.close();
    }
}