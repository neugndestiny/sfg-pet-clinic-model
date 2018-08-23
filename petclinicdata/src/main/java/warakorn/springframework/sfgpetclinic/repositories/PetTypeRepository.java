package warakorn.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
