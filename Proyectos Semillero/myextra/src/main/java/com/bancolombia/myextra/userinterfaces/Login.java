package com.bancolombia.myextra.userinterfaces;

import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

	public static final TargetMyExtra OPCION_MENU = TargetMyExtra.the("numero opcion").locatedBy(23, 6, 1);
	public static final TargetMyExtra USUARIO = TargetMyExtra.the("numero opcion").locatedBy(20, 16, 8);
	public static final TargetMyExtra CONTRSEÑA = TargetMyExtra.the("numero opcion").locatedBy(21, 16, 8);
	public static final TargetMyExtra MENSAJE = TargetMyExtra.the("mensaje Logged").locatedBy(02, 01, 18);
	
			
}
