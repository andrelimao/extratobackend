package br.com.banco.model;
import javax.persistence.*;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@hashCode(of = "id")
@ToString
@Entity
public class Transferencia {
	 @Id
	 @GeneratedValue
	private Long id;
	@Getter @Setter private Timestamp data_transferencia;
	@Getter @Setter private float valor;
	@Getter @Setter private String tipo;
	@Getter Setter private String nome_operador;
	@Getter @Setter private int conta_id;

}
