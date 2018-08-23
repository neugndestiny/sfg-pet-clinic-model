package warakorn.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.sfgpetclinic.model.Visit;

public interface visitRepository extends CrudRepository<Visit, Long> {

}
