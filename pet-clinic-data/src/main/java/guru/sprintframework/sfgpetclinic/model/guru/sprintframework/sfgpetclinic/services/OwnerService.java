package guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services;

import guru.sprintframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
