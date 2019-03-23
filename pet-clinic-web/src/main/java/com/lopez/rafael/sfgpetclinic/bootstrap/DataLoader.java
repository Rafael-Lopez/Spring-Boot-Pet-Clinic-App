package com.lopez.rafael.sfgpetclinic.bootstrap;

import com.lopez.rafael.sfgpetclinic.model.Owner;
import com.lopez.rafael.sfgpetclinic.model.Vet;
import com.lopez.rafael.sfgpetclinic.services.OwnerService;
import com.lopez.rafael.sfgpetclinic.services.VetService;
import com.lopez.rafael.sfgpetclinic.services.map.OwnerServiceMap;
import com.lopez.rafael.sfgpetclinic.services.map.VetServiceMap;
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
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        owner1.setId(1L);
        owner1.setFirstName("Sam");
        owner1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        owner1.setId(2L);
        owner1.setFirstName("Jessie");
        owner1.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
;    }
}
