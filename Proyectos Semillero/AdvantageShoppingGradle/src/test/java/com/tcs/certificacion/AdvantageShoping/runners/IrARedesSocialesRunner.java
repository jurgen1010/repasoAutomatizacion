package com.tcs.certificacion.AdvantageShoping.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resourses/features/redessociales.feature",
glue="com.tcs.certificacion.AdvantageShoping.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags="@Linkedin"
)
public class IrARedesSocialesRunner {

	
}
