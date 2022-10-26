public class Main {
    public static void main(String[] args) {
        String helloWorld;
        final int NUM = 34;
        String word = "hello world";
        helloWorld = NUM + word;
        System.out.println(NUM + " " + word + " " + helloWorld);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    }
}