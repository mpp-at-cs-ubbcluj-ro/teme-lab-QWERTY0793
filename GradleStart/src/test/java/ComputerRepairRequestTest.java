import ro.mpp2025.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest crr=new ComputerRepairRequest();
        assertEquals("",crr.getOwnerName());
        //assertEquals("",crr.getOwnerAdress());

    }

    @Test
    @DisplayName("Test Exemplu")
    public void testExample2(){
        assertEquals(2,2,"Numerele ar trebui sa fie egale");
    }
}