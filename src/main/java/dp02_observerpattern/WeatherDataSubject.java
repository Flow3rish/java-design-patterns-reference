package dp02_observerpattern;

import java.util.List;

public interface WeatherDataSubject {
    void registerStation(Station station);

    void removeStation(Station station);

    void notifyStations(List<Station> stations);

}
