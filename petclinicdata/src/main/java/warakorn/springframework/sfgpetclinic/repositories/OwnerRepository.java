package warakorn.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {  //Long came from BaseEntity
    Owner findByLastName(String lastName);
}
