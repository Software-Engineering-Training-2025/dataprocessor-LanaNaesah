package org.example.dataprocessor;

import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static OutputMethodology create (OutputType type){
        if (type==OutputType.CONSOLE)
            return new Console();
        else if (type==OutputType.TEXT_FILE) {
            return new TxtFile();

        }
        throw new IllegalArgumentException("Invalid OutputType");
    }

}
