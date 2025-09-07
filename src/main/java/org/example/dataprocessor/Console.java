package org.example.dataprocessor;

public class Console implements OutputMethodology{
    @Override
    public void output(double result) {
        System.out.println("Result = "+result);
    }
}
