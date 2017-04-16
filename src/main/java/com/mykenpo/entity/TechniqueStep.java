package com.mykenpo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class TechniqueStep {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private int stepValue;

    @OneToMany
    private Collection<TechniqueAction> techniqueActions;

    public int getStepValue() {
        return stepValue;
    }

    public void setStepValue(int stepValue) {
        this.stepValue = stepValue;
    }

    public Collection<TechniqueAction> getTechniqueActions() {
        return techniqueActions;
    }

    public void setTechniqueActions(List<TechniqueAction> techniqueActions) {
        this.techniqueActions = techniqueActions;
    }
}
