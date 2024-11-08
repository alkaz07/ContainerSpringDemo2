package parks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parks.beans.Park;
import parks.beans.Watchman;

@Configuration
public class AppConfig2 {
    @Bean(name="mainWatchman")
    public Watchman watchman(){
        return new Watchman("Васян");
    }

    @Bean(name="park")
    public Park park(){
        return new Park(6, "Павловский");
    }
}
