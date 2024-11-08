package parks.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mainWatchman")
public class Watchman {
    String fio;
    @Autowired
    private Park park;


    public Watchman(@Value("Иванов") String fio) {
        this.fio = fio;
        System.out.println("создан сторож "+fio);
    }

    public void whistle(){
        System.out.println(fio + " свистит");
    }

    @Override
    public String toString() {
        return "Watchman{" +
                "fio='" + fio + '\'' +
                ", park=" + park +
                '}';
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
        System.out.println(fio + " назначен сторожем в "+park);
       // park.watchman = this;
    }
}
