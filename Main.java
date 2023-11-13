public class Main {
    public static void main(String[] args) {

        // Дано трехзначное число. Вывести на экран все цифры этого числа
        //Пример: 345
        //Вывод в консоль: Число 345 -> 3, 4, 5
        //Другой пример: 987
        //Вывод в консоль: Число 987 -> 9, 8, 7

        int main = 345;
        int i = main/100; //3
        int i1 = (main/10)%10; //4
        int i2 = main%10;//5
        System.out.println(i+", "+i1+", "+i2);


        int main1 = 987;
        int a = main1/100; //9
        int a1 = (main1/10)%10; //8
        int a2 = main1%10;//7
        System.out.println(a+", "+a1+", "+a2);


    }
}
