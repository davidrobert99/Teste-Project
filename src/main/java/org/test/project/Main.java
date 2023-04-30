package org.test.project;

import org.test.project.operations.DivideOperation;
import org.test.project.operations.MultiplyOperation;
import org.test.project.operations.SubtractOperation;
import org.test.project.operations.SumOperation;

public class Main {
    public static void main(String[] args) {
        SumOperation sum = new SumOperation();
        System.out.println(sum.makeOperation(1,2));

        MultiplyOperation mul = new MultiplyOperation();
        System.out.println(mul.makeOperation(1,2));

        DivideOperation div = new DivideOperation();
        System.out.println(div.makeOperation(2,1));

        SubtractOperation sub = new SubtractOperation();
        System.out.println(sub.makeOperation(2,1));
    }
}