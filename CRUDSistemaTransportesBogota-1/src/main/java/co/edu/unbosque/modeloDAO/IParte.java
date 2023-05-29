package co.edu.unbosque.modeloDAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Parte;

@Repository
public interface IParte extends CrudRepository<Parte, Integer>{

    List<Parte> findByPlaca(String placa);
 //   List<Parte> findByNombre(String nombre);

}
