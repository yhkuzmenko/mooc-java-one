import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println("");

        System.out.print("Program's maximum duration? ");
        int maximumDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram televisionProgram : programs) {
            if (televisionProgram.getDuration() <= maximumDuration) {
                System.out.println(televisionProgram);
            }
        }

        scanner.close();
    }
}
