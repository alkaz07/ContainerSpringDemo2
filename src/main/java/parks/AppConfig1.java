package parks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parks.beans.Park;
import parks.beans.Watchman;

@Configuration  //данный класс конфигурирует контекст
public class AppConfig1 {
    @Bean(name="watchmanP")
    public Watchman watchman(){
        return new Watchman("Пупкин");
    }

    @Bean(name="parkOtd")
    public Park park(){
        return new Park(5, "Отдельный");
    }

}
