package dev.ned.city.locator.services;

import dev.ned.city.locator.models.Location;
import dev.ned.city.locator.repositories.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    private LocationRepository repository;

    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public Location saveOrUpdateLocation(Location location) {
        return repository.save(location);
    }

    public List<Location> getLocations() {
        return repository.findAll();
    }

    public Optional<Location> getLocationById(Long id) {
        return repository.findById(id);
    }

    public void deleteLocation(Long id) {
        repository.deleteById(id);
    }
}
