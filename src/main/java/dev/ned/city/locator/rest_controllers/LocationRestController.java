package dev.ned.city.locator.rest_controllers;

import dev.ned.city.locator.models.Location;
import dev.ned.city.locator.services.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
public class LocationRestController {
    private LocationService service;
    private String locationNotFound = "Location Not Found";

    public LocationRestController(LocationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Location> createLocation(@Valid @RequestBody Location location) {
        return ResponseEntity.status(HttpStatus.OK).body(service.saveOrUpdateLocation(location));
    }

    @GetMapping
    public ResponseEntity<List<Location>> getLocations() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getLocations());
    }

//    @GetMapping(value = "/{id}", produces = "application/json")
//    public ResponseEntity<Optional<Location>> getLocationById(@PathVariable Long id) {
//        Optional<Location> location = service.getLocationById(id);
//        if (location.get() == null) {
//            System.out.println("fsdfdfdfd + " + location);
//            return (ResponseEntity<Optional<Location>>) ResponseEntity.notFound();
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(service.getLocationById(id));
//    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getLocationById(@PathVariable Long id) {
        try {
            Optional<Location> location = service.getLocationById(id);
            return ResponseEntity.status(HttpStatus.OK).body(location.get());
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, locationNotFound, exc);
        }
    }

    @PutMapping
    public ResponseEntity<Location> updateLocation(@Valid @RequestBody Location location) {
        return ResponseEntity.status(HttpStatus.OK).body(service.saveOrUpdateLocation(location));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable Long id) {
        try {
            service.deleteLocation(id);
            return ResponseEntity.status(HttpStatus.OK).body("Location deleted.");
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, locationNotFound, exc);
        }
    }
}
