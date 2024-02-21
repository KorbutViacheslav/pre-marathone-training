package start;

import configuration.ApplicationSpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: Viacheslav Korbut
 * Date: 21.02.2024
 */
public class AppStart {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationSpringConfig.class);

        //TODO:Implements

        context.close();
    }

}
