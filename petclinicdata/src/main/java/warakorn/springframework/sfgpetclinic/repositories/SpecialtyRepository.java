package warakorn.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
