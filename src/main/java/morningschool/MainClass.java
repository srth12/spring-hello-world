package morningschool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        MessagePrinter printer = context.getBean(MessagePrinter.class);

        System.out.println(printer.getMessage());
    }

}
