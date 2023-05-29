package co.edu.unbosque.serviceInterface;

import java.util.List;
import java.util.Optional;
import co.edu.unbosque.modelo.Parte;
import co.edu.unbosque.modeloDAO.IParte;

public interface IParteService {
	
	public List<Parte> listar();
	public Optional <Parte> listarId(int id);
	public int save(Parte p);
	public void delete(int id);
	List<Parte> buscarPorPlaca(String placa);

}
