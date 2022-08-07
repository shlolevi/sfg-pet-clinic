package guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services;

import guru.sprintframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetServcie {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
