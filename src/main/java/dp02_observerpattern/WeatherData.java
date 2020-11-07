package dp02_observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherDataSubject {

    private ArrayList<Station> stations;

    public WeatherData() {
        this.stations = new ArrayList<>();
    }

    @Override
    public void registerStation(Station station) {
        this.stations.add(station);
    }

    @Override
    public void removeStation(Station station) {
        this.stations.remove(station);
    }

    @Override
    public void notifyStations(List<Station> stations) {
        for (Station station : stations) {
            station.update(this);
        }
    }

}
