package com.techmine.gs.domain;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author Cedric Pemberton
 */
@Embeddable
public class Measure {

    @Basic
    private String value;
    @ManyToOne
    private UinitOfMeasure uinitOfMeasure;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UinitOfMeasure getUinitOfMeasure() {
        return uinitOfMeasure;
    }

    public void setUinitOfMeasure(UinitOfMeasure uinitOfMeasure) {
        this.uinitOfMeasure = uinitOfMeasure;
    }

}