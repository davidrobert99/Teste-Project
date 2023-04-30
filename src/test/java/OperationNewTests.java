import org.junit.Test;
import org.test.project.operations.DivideOperation;
import org.test.project.operations.Operation;

import static junit.framework.TestCase.assertEquals;

public class OperationNewTests {

    @Test
    public void DivideOperationTest(){
        Operation op = new DivideOperation();

        assertEquals(op.makeOperation(5,5), 1);
    }

}
