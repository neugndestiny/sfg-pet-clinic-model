package warakorn.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import warakorn.springframework.sfgpetclinic.model.Vet;
import warakorn.springframework.sfgpetclinic.repositories.VetRepositiory;
import warakorn.springframework.sfgpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepositiory vetRepositiory;

    public VetSDJpaService(VetRepositiory vetRepositiory) {
        this.vetRepositiory = vetRepositiory;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepositiory.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepositiory.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepositiory.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepositiory.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepositiory.deleteById(aLong);
    }
}
