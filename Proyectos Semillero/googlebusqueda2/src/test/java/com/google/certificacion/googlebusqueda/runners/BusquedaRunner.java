package com.google.certificacion.googlebusqueda.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/busqueda.feature"
,glue="com.google.certificacion.googlebusqueda.definitions"
,snippets=SnippetType.CAMELCASE
		)
public class BusquedaRunner {

}