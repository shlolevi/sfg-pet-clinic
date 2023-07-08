package guru.sprintframework.sfgpetclinic.repositories;

import guru.sprintframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
