package de.dhbw.ravensburg.wp.be219thenextchapter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BusStop {
    @Id
    @GeneratedValue
    private long id;

    private String name;

}
