public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int cumulativeSum = 0; // Initialize cumulative sum

        while (x <= 9) { // Change condition to include 9
            cumulativeSum += x; // Update cumulative sum
            System.out.print(cumulativeSum + " "); // Print cumulative sum
            x++; // Increment x
        }
    }
}
