public class TabularOutput {
    public static void main(String[] args) {
        // Print the header
        System.out.println("N\tN^2\tN^3\tN^4");

        // Loop to generate table values
        for (int n = 1; n <= 5; n++) {
            System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n) + "\t" + (n * n * n * n));
        }
    }
}
