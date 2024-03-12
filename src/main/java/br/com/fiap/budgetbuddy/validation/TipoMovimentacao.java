package br.com.fiap.budgetbuddy.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;

@Target(ElementType.FIELD)
@Constraint(validatedBy = TipoMovimentacaoValidator.class)
public @interface TipoMovimentacao {
    
}
