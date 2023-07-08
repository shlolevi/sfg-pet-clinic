package guru.sprintframework.sfgpetclinic.repositories;

import guru.sprintframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
