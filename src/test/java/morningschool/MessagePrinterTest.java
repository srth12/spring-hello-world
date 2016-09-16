package morningschool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class MessagePrinterTest {

    @Autowired
    MessagePrinter messagePrinter;

    @Test
    public void shouldReturnHelloWorldMessage(){
        String message = messagePrinter.getMessage();

        assertEquals("Hello World!",message);
    }

}