package warakorn.framework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import warakorn.springframework.sfgpetclinic.model.Owner;
import warakorn.springframework.sfgpetclinic.model.Vet;
import warakorn.springframework.sfgpetclinic.services.OwnerService;
import warakorn.springframework.sfgpetclinic.services.VetService;
import warakorn.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import warakorn.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
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
