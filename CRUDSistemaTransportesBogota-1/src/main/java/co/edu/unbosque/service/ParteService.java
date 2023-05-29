package co.edu.unbosque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.modelo.Parte;
import co.edu.unbosque.modeloDAO.IParte;
import co.edu.unbosque.serviceInterface.IParteService;

@Service
public class ParteService implements IParteService{
	
	@Autowired
	private IParte dao;

	@Override
	public List<Parte> listar() {
		return (List<Parte>) dao.findAll();
	}

	@Override
	public Optional<Parte> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public int save(Parte p) {
		int res=0;
		Parte par=dao.save(p);
		if(!par.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}

	@Autowired
	private IParte parteRepository;

	@Override
	public List<Parte> buscarPorPlaca(String placa) {
	    return parteRepository.findByPlaca(placa);
	}

}
