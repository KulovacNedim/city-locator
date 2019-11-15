package dev.ned.city.locator.repositories;

import dev.ned.city.locator.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
