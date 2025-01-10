public class Statistics {
    private int count;
    private int sum;

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = 0;

        if (count > 0) {
            average = (double) sum / count;
        }

        return average;
    }
}