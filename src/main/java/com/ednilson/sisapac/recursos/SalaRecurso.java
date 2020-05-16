package com.ednilson.sisapac.recursos;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ednilson.sisapac.dto.SalaDTO;
import com.ednilson.sisapac.modelo.Sala;
import com.ednilson.sisapac.servicos.SalaServico;

@RestController
@RequestMapping("/salas")
public class SalaRecurso {
	
	@Autowired
	private SalaServico servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Sala>> findAll(){
		List<Sala> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Sala> find(@PathVariable Integer id) {
		
		Sala obj = servico.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody SalaDTO objDto){
		Sala obj = servico.fromDTO(objDto);
		obj = servico.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody SalaDTO objDto, @PathVariable Integer id){
		Sala obj = servico.fromDTO(objDto);
		obj.setId(id);
		
		servico.update(obj);
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		servico.delete(id);
		return ResponseEntity.noContent().build();
	}
}
