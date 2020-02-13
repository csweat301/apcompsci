package scanner.labs;

import base.Lab;

public class SCANN_1 implements Lab {

    @Override
    public void go() {
        while (scanner.hasNextLine()) {

            int index = 0;

            String line = scanner.nextLine();

            String[] numStr = line.trim().split("\\s+");

            for (int i = 0; i < numStr.length; i++)
                index++;

            System.out.println("count = " + index);

        }
    }
}
