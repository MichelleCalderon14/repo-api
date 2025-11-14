package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.AlumnoRepresentante;
import com.mateo.colegio.Entidades.AlumnoRepresentanteId;  // <-- IMPORT NECESARIO
import com.mateo.colegio.Repositorios.AlumnoRepresentanteRepositorio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AlumnoRepresentanteServicio {

    private final AlumnoRepresentanteRepositorio repo;

    public List<AlumnoRepresentante> listar() { 
        return repo.findAll(); 
    }

    public Optional<AlumnoRepresentante> porId(AlumnoRepresentanteId id) { 
        return repo.findById(id); 
    }

    public AlumnoRepresentante guardar(AlumnoRepresentante e) { 
        return repo.save(e); 
    }

    public void eliminar(AlumnoRepresentanteId id) { 
        repo.deleteById(id); 
    }
}
