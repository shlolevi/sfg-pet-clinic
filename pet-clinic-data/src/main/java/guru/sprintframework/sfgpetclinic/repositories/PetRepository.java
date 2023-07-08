package guru.sprintframework.sfgpetclinic.repositories;

import guru.sprintframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
