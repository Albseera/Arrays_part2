public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();

    }
    // Объявить метод Рандом
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalAmount=0;
        for (int elem:arr) {
            totalAmount+=elem;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n",totalAmount);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min=200_000;
        int max=-1;
        for (int elem:arr) {
            if (elem>max) {
               max=elem;
            }
            if (elem<min) {
                min=elem;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей %n",min);
        System.out.printf("Максимальная сумма трат за день составила %d рублей %n",max);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int totalAmount=0;
        float dayInMonth=30F;
        float middleAmount=0;
        for (int elem:arr) {
            totalAmount+=elem;
        }
        middleAmount=  totalAmount/dayInMonth;
        System.out.println("Сумма средних затрат за месяц составила "+middleAmount +" рублей");
    }


    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }



    }
}
