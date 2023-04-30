import org.junit.Test;
import org.test.project.operations.*;

import static junit.framework.TestCase.assertEquals;

public class OperationTests {


    @Test
    public void SumOperationTest(){
        Operation op = new SumOperation();

        assertEquals(op.makeOperation(5,5),10);
    }

    @Test
    public void SubtractOperationTest(){
        Operation op = new SubtractOperation();

        assertEquals(op.makeOperation(5,10),-5);
    }

    @Test
    public void MultiplyOperationTest(){
        Operation op = new MultiplyOperation();

        assertEquals(op.makeOperation(5,1),5);
    }


}
