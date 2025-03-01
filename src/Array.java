public class Array {
    public static void main(String[] args) {
        System.out.println("For-loop: ");
        forLoop();
        System.out.println("For-each");
        forEach();
        System.out.println("Sum and Average :");
        sumOrAverage();
        System.out.println("Searching Element: ");
        searchingElement();
    }

    public static int[] numbers = {1,2,3,4,5};

    public static void forLoop() {
        for (int i = 0; i < numbers.length; i++)
        System.out.println("Element at index " + i + ": " + numbers[i]);
    }

    public static void forEach(){
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void sumOrAverage(){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum " + sum + ", Average: " + average);
    }

    public static void searchingElement(){
        int target = 50;
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + target + (found ? " found." : " not found."));
    }
}
