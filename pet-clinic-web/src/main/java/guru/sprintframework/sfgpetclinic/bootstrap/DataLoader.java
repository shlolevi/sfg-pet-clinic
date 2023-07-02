package guru.sprintframework.sfgpetclinic.bootstrap;

import guru.sprintframework.sfgpetclinic.model.Owner;
import guru.sprintframework.sfgpetclinic.model.Pet;
import guru.sprintframework.sfgpetclinic.model.PetType;
import guru.sprintframework.sfgpetclinic.model.Vet;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.OwnerService;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.PetTypeService;
import guru.sprintframework.sfgpetclinic.model.guru.sprintframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDay( LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Botimore Blv");
        owner2.setCity("Miami Beach");
        owner2.setTelephone("98765432");

        Pet fionaCat = new Pet();
        fionaCat.setPetType(savedCatPetType);
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDay( LocalDate.now());
        fionaCat.setName("Just Cat");
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets......");
    }
}
