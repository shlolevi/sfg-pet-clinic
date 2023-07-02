package guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.map;

import guru.sprintframework.sfgpetclinic.model.Speciality;
import guru.sprintframework.sfgpetclinic.model.Vet;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.SpecialtyService;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialitySet().size() > 0) {
            object.getSpecialitySet().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
