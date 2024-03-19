package br.com.fiap.budgetbuddy.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Constraint(validatedBy = TipoMovimentacaoValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoMovimentacao {

    String message() default "{movimentacao.tipo}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
