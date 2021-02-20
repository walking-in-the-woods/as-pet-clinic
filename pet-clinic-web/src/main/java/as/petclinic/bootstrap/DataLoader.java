package as.petclinic.bootstrap;

import as.petclinic.model.Owner;
import as.petclinic.model.Vet;
import as.petclinic.services.OwnerService;
import as.petclinic.services.VetService;
import as.petclinic.services.map.OwnerServiceMap;
import as.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    //private final PetService petService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        //petService = new PetServiceMap();
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
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Load Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setLastName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Load Vets...");
    }
}
