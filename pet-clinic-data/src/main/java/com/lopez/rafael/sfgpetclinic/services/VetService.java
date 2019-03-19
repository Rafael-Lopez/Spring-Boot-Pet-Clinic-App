package com.lopez.rafael.sfgpetclinic.services;

import com.lopez.rafael.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
