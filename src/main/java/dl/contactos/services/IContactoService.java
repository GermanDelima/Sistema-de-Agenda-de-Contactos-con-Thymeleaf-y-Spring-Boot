package dl.contactos.services;

import dl.contactos.models.Contacto;

import java.util.List;

public interface IContactoService {
  public List<Contacto> listarContactos();

  public Contacto buscarContactoPorId(Integer idContacto);

  public void guardarContacto(Contacto contacto);

  public void eliminarContacto(Contacto contacto);
}
