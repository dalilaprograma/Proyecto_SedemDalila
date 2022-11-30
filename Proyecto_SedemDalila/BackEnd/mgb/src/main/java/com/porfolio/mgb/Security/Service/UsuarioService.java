package com.porfolio.mgb.Security.Service;

import com.porfolio.mgb.Security.Entity.Usuario;
import com.porfolio.mgb.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existisByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.existByNombreUsuario(nombreUsuario);
    }
     public boolean existisByEmail(String email){
        return iUsuarioRepository.existByEmail(email);
    }
     public void save (Usuario usuario){
        iUsuarioRepository.save(usuario);
    }
}
