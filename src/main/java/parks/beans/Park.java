package parks.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Park {
    int id;
    String name;
    @Autowired
    Watchman watchman;

    public Park(@Value("321") int id, @Value("Екатерингоф") String name) {
        this.id = id;
        this.name = name;
        System.out.println("создан парк "+name);
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void doNoise(){
        System.out.println(this+" шумит");
    }

    public void walkOnTheGrass(){
        System.out.println("Шаг на газон");
        if(watchman != null)
            watchman.whistle();
        else
            System.out.println("вытаптывание газона");
    }

    public void setWatchman(Watchman watchman) {
        this.watchman = watchman;
    }
}
