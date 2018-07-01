package br.com.caelum.vraptor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.inject.Stereotype;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.exception.rest.ExceptionRest;

@Stereotype
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Controller
@ExceptionRest
public @interface ControllerRest {}
