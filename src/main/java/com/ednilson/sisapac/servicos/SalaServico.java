package com.ednilson.sisapac.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.ednilson.sisapac.dto.SalaDTO;
import com.ednilson.sisapac.exeption.DateIntegrityException;
import com.ednilson.sisapac.exeption.ObjectNotFoundException;
import com.ednilson.sisapac.modelo.Sala;
import com.ednilson.sisapac.repositorios.SalaRepositorio;

@Service
public class SalaServico {

	@Autowired
	private SalaRepositorio repo;
	
	public List<Sala> findAll(){
		return repo.findAll();
	}
	
	public Sala find(Integer id) {
		Optional<Sala> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: "+ Sala.class.getName()));
	}
	
	public Sala insert(Sala obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Sala update(Sala obj) {
		Sala newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	public void delete(Integer id) {
		find(id);
		
		try {
			repo.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DateIntegrityException("Não é possível excluir pois está relacionado alguma tabela.");	
		}	
	}
	
	private void updateData(Sala newObj, Sala obj) {
		newObj.setSigla(obj.getSigla());
		newObj.setDescricao(obj.getDescricao());
	}
	
	public Sala fromDTO(SalaDTO objDto) {
		return new Sala(objDto.getId(), objDto.getSigla(),objDto.getDescricao());
	}
	
}
