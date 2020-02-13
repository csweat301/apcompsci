package scanner.labs;

import base.Lab;

public class SCANN_2 implements Lab {

    @Override
    public void go() {
        while (scanner.hasNextLine()) {

            int sum = 0;

            String line = scanner.nextLine();

            String[] numStr = line.trim().split("\\s+");

            for (int i = 0; i < numStr.length; i++)
                sum += Integer.parseInt(numStr[i]);

            System.out.println("sum = " + sum);

        }
    }
}
