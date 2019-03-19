package com.lopez.rafael.sfgpetclinic.services;

import com.lopez.rafael.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
