package de.dhbw.ravensburg.wp.be219thenextchapter.repository;

import de.dhbw.ravensburg.wp.be219thenextchapter.model.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, Long> {
}
