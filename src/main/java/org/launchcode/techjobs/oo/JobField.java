package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField(String value){
        this(); // used for calling the constructor and, we can only use it in the constructor.
        this.value = value;
    }
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField optionsField = (JobField) o;
        return getId()== optionsField.getId();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
