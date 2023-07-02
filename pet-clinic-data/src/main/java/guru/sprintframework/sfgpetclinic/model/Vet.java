package guru.sprintframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> specialitySet;

    public Set<Speciality> getSpecialitySet() {
        return specialitySet;
    }

    public void setSpecialitySet(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
