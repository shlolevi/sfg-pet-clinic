package bootstrap;

import guru.sprintframework.sfgpetclinic.model.Owner;
import guru.sprintframework.sfgpetclinic.model.Vet;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.OwnerService;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.VetService;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gleanna");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);
        System.out.println("Loaded Vets......");
    }
}
