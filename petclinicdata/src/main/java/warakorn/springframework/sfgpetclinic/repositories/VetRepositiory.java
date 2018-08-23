package warakorn.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.sfgpetclinic.model.Vet;

public interface VetRepositiory  extends CrudRepository<Vet, Long> {
}
