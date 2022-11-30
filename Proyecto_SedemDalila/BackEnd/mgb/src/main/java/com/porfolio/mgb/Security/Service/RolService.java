package com.porfolio.mgb.Security.Service;

import com.porfolio.mgb.Security.Entity.Rol;
import com.porfolio.mgb.Security.Enums.RolNombre;
import com.porfolio.mgb.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        iRolRepository.save(rol);
    }
}
