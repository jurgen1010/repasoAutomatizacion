package com.tcs.certificacion.AdvantageShoping.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resourses/features/inventarioproductos.feature",
glue="com.tcs.certificacion.AdvantageShoping.stepdefinitions",
snippets = SnippetType.CAMELCASE
//tags="@Cantidad_Disponible_Stock"
)
public class InventarioProductosRunner {

	
}
