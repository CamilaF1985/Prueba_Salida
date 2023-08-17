package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Usuario;
import model.repository.IUsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
    private IUsuarioRepository usRepo;
  
  public UsuarioService(IUsuarioRepository usRepo) {
       this.usRepo = usRepo;
    }
  
  public Usuario registrarUsuario(Usuario usuario) {
	    Usuario usuarioRegistrado = usRepo.save(usuario); // Llamada única a save
	    return usuarioRegistrado;
	}

  
  public Usuario getUsuarioById(Long id) {
        return usRepo.getOne(id);
       
    }
  
    public List<Usuario> getUsuarios() {
    
    	
    	return usRepo.findAllUsuarios();
        
    }
    public void update(Usuario u) {
		usRepo.save(u);
	}
    @Transactional
    public Long getUsuarioIdFromDatabase(Long usuarioId) {
        Usuario usuario = usRepo.getOne(usuarioId);
        if (usuario != null) {
            return usuario.getId();
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    
    }
}
