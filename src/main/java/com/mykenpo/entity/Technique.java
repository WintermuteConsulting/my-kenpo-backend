package com.mykenpo.entity;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Technique {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String name;

    @OneToMany
    private Collection<TechniqueStep> techniqueSteps;

    @ManyToOne(cascade = {CascadeType.ALL})
    @RestResource(exported = false)
    private Attack attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<TechniqueStep> getTechniqueSteps() {
        return techniqueSteps;
    }

    public void setTechniqueSteps(List<TechniqueStep> techniqueSteps) {
        this.techniqueSteps = techniqueSteps;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
