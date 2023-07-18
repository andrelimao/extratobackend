package br.com.banco.model;
import javax.persistence.*;

import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.Getter;
@Entity
@NoArgsConstructor
public class Conta {
	@Id
	@GeneratedValue
	@Getter private int conta_id;
	
	@Getter @Setter private String nome_responsavel;
	public Conta(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	
}
}