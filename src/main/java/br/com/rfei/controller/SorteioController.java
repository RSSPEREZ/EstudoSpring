package br.com.rfei.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfei.model.Sorteio;



@RestController
public class SorteioController {

	@RequestMapping("/sorteio")
	public List<SorteioDto> lista(){
		
		SorteioDto sorteio = new Sorteio("Premio",111);
		
		return sorteio.converter(Arrays.asList(sorteio,sorteio,sorteio));
		
	}

}
