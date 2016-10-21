package servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;

/**
 * Created by shiqining on 10/21/16.
 */
public class ServletContextListenerImpl implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("===============context has initialized");
        System.out.println("===============context has initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("===============context has destroyed");
    }

    public static void main(String[] args) {
        long mills = 1477037174236L;
        System.out.println(new Date(mills));
    }
}
