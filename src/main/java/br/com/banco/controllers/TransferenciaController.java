package br.com.banco.controllers;
import javax.persistence.*;

@Controller
@RequestMapping('transferencias')
public class TransferenciaController {
	
@GetMapping
public List<Transferencia> mostraTransferencias{
	return tr.findAll();
}
}
