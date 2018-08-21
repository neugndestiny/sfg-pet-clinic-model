package warakorn.framework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import warakorn.springframework.sfgpetclinic.model.Owner;
import warakorn.springframework.sfgpetclinic.model.PetType;
import warakorn.springframework.sfgpetclinic.model.Vet;
import warakorn.springframework.sfgpetclinic.services.OwnerService;
import warakorn.springframework.sfgpetclinic.services.PetTypeService;
import warakorn.springframework.sfgpetclinic.services.VetService;

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
        dog.setName("doggo");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("catto");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Neung");
        owner1.setLastName("Warakorn");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("M");
        owner2.setLastName("-150");

        ownerService.save(owner2);

        System.out.println("Loading Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Dog");
        vet1.setLastName("Doggo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Cat");
        vet2.setLastName("Catty");

        vetService.save(vet2);

        System.out.println("Loading Vets...");
    }
}
