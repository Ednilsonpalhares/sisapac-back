package com.ednilson.sisapac.servicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilson.sisapac.modelo.Sala;
import com.ednilson.sisapac.repositorios.SalaRepositorio;

@Service
public class DBservice {

	@Autowired
	private SalaRepositorio salaRepo;

	public void instantiateTestDatabase() {
		Sala sala1 = new Sala(null, "Laboratório Acionamento de Máquinas","Lab. Aci.de Máq.");
		Sala sala2 = new Sala(null, "Laboratório Cabeamento","Lab. Cab.");
		Sala sala3 = new Sala(null, "Laboratório Eletrônica","Lab. Elet.");
		Sala sala4 = new Sala(null, "Laboratório Informática 01","Lab. Inf-01");
		Sala sala5 = new Sala(null, "Laboratório nformática 02","Lab. Inf-02");
		Sala sala6 = new Sala(null, "Laboratório Informática 03","Lab. Inf-03");
		Sala sala7 = new Sala(null, "Laboratório Informática 04","Lab. Inf-04 ");
		Sala sala8 = new Sala(null, "Laboratório Instrumentação","Lab. Instru.");
		Sala sala9 = new Sala(null, "Laboratório Línguas","Lab. Lín.");
		Sala sala10 = new Sala(null,"Laboratório Manutenção","Lab. Manut.");
		Sala sala11 = new Sala(null,"Laboratório Mecânica II","Lab. Mec. II");
		Sala sala12 = new Sala(null,"Laboratório Materias","Lab. Materiais.");
		Sala sala13 = new Sala(null,"Laboratório Mecânica I","Lab. Mec. I");
		Sala sala14 = new Sala(null,"Laboratório Metrologia","Lab. Metrologia");
		Sala sala15 = new Sala(null,"Laboratório de Redes 01","Lab. Red.");
		Sala sala16 = new Sala(null,"Laboratório de Robótica 01","Lab. Rob");
		Sala sala17 = new Sala(null,"Laboratório Soldagem","Lab. Soldagem");
		Sala sala18 = new Sala(null,"Sala 01","S01");
		Sala sala19 = new Sala(null,"Sala 02","S02");
		Sala sala20 = new Sala(null,"Sala 03","S03");
		Sala sala21 = new Sala(null,"Sala 04","S04");
		Sala sala22 = new Sala(null,"Sala 05","S05");
		Sala sala23 = new Sala(null,"Sala 06","S06");
		Sala sala24 = new Sala(null,"Sala 07","S07");
		Sala sala25 = new Sala(null,"Sala 09","S09");
		Sala sala26 = new Sala(null,"Sala 10","S10");
		Sala sala27 = new Sala(null,"Sala 68","S68");
		Sala sala28 = new Sala(null,"Sala 69","S69");
	    Sala sala29 = new Sala(null,"Sala 71","S71");
		Sala sala30 = new Sala(null,"Sala 72","S72");
		Sala sala31 = new Sala(null,"Sala 75","S75");
		Sala sala32 = new Sala(null,"Sala 76","S76");
		Sala sala33 = new Sala(null,"Sala 78","S78");
		Sala sala34 = new Sala(null,"Sala 79","S79");
		Sala sala35 = new Sala(null,"Sala 41","S41");

		
	   salaRepo.saveAll(Arrays.asList(sala1,sala2,sala3,sala4,sala4,sala5,sala6,sala7,sala8,sala9,sala10,sala11,sala12,sala13,sala14,sala15,
			   sala16,sala17,sala18,sala19,sala20,sala21,sala22,sala23,sala24,sala25,sala26,sala27,sala28,sala29,sala30,sala31,
			   sala32,sala33,sala34,sala35));
	}
}
