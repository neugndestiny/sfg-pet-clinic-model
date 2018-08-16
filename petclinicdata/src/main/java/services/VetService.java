package services;

import warakorn.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
