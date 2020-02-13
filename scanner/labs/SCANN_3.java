package scanner.labs;

import base.Lab;

public class SCANN_3 implements Lab {

    @Override
    public void go() {
        while (scanner.hasNextLine()) {

            double avg = 0.0D;

            String line = scanner.nextLine();

            String[] numStr = line.trim().split("\\s+");

            for (int i = 0; i < numStr.length; i++)
                avg += Integer.parseInt(numStr[i]);

            avg /= numStr.length;

            System.out.println("avg = " + avg);

        }
    }
}
