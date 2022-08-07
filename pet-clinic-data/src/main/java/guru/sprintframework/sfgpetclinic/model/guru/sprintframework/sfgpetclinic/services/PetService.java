package guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services;

import guru.sprintframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
