package guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services;

import guru.sprintframework.sfgpetclinic.model.Owner;


public interface OwnerService extends  CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
