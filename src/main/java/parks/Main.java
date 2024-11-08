package parks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import parks.beans.Park;
import parks.beans.Watchman;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }
    private static void example3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        Park p = context.getBean("park", Park.class);
        Watchman w = context.getBean("mainWatchman", Watchman.class);
        w.whistle();
        p.doNoise();
        p.walkOnTheGrass();
    }
    private static void example2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        Park p = context.getBean("park", Park.class);
        Watchman w = context.getBean("mainWatchman", Watchman.class);
        w.whistle();
        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        Park p = context.getBean("parkOtd", Park.class);
        Watchman w = context.getBean("watchmanP", Watchman.class);
        w.whistle();
        p.doNoise();
        p.walkOnTheGrass();
    }
}