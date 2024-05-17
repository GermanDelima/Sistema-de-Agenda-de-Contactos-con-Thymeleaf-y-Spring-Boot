package dl.contactos.repositories;

import dl.contactos.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto,Integer> {
}
