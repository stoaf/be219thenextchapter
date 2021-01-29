package de.dhbw.ravensburg.wp.be219thenextchapter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Bus {
    @Id
    @GeneratedValue
    private long id;
}
