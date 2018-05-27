import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");
        spin();

    }
    private static void spin() {
        int[] ints = {4, 5, 3};
        for (int i = 0; i < 100; i++) {

            System.out.println(Arrays.stream(ints).sum());
        }
    }
}