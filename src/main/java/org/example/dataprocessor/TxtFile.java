package org.example.dataprocessor;

import java.io.FileWriter;
import java.io.IOException;

public class TxtFile implements OutputMethodology{
    @Override
    public void output(double result) throws IOException {
        FileWriter fw = new FileWriter("target/result.txt");
        fw.write("Result = "+result);
        fw.close();
    }
}
