package com.tcs.certificacion.traductorgoogle.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Traductor {
public static final Target LISTA_IDIOMA_ORIGEN=Target.the("despliega la lista de idioma origen")
.locatedBy("//div[@id='gt-sl-gms']");

public static final Target IDIOMA_ORIGEN=Target.the("Idioma origen")
.locatedBy("//div[@id='gt-sl-gms-menu']//div[.='{0}']");

public static final Target LISTA_IDIOMA_DESTINO=Target.the("despliega la lista de idioma destino")
.locatedBy("//div[@id='gt-tl-gms']");

public static final Target IDIOMA_DESTINO=Target.the("Idioma destino")
.locatedBy("//div[@id='gt-tl-gms-menu']//div[.='{0}']");


public static final Target PALABRA_A_TRADUCIR=Target.the("Palabra origen a traducir")
.locatedBy("//textarea[@id='source']");

public static final Target PALABRA_TRADUCIDA=Target.the("Palabra traducida")
.locatedBy("//div[@id='gt-res-dir-ctr']");



}
