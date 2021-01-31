package de.dhbw.ravensburg.wp.be219thenextchapter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BusSchedule {

    @Id
    @GeneratedValue
    private long id;
}
