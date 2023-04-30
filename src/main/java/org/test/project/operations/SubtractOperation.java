package org.test.project.operations;

public class SubtractOperation implements  Operation{
    @Override
    public int makeOperation(int num1, int num2) {
        return num1 - num2;
    }
}
