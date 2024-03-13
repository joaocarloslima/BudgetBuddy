package br.com.fiap.budgetbuddy.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Locacao {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(min = 3, max = 255, message = "Descrição muito curta. Deve ter pelo menos 3 caracteres")
    private String descricao;

    @Positive(message = "Valor inválido. Dever ser positivo")
    private BigDecimal valor;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    @NotEmpty(message = "Selecione um carro")
    private List<Long> carros;

    @Positive(message = "Quantidade inválida. Dever ser positivo")
    private Integer quantidadeDias;

    private String status;

}