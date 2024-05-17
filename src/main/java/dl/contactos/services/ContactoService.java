package dl.contactos.services;

import dl.contactos.models.Contacto;
import dl.contactos.repositories.ContactoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService implements IContactoService{
  //inyeccion de dependencia por campos
  private final ContactoRepository contactoRepositorio;
  public ContactoService(ContactoRepository repository){
    this.contactoRepositorio = repository;
  }


  @Override
  public List<Contacto> listarContactos() {
    return contactoRepositorio.findAll();
  }

  @Override
  public Contacto buscarContactoPorId(Integer idContacto) {
    Contacto contacto = contactoRepositorio.findById(idContacto).orElse(null);
    return contacto;
  }

  @Override
  public void guardarContacto(Contacto contacto) {
    contactoRepositorio.save(contacto);
  }

  @Override
  public void eliminarContacto(Contacto contacto) {
    contactoRepositorio.delete(contacto);
  }
}
