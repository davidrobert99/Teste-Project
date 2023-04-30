package org.test.project.operations;

public class SumOperation implements Operation {
    @Override
    public int makeOperation(int num1, int num2) {
        return num1+num2;
    }
}
