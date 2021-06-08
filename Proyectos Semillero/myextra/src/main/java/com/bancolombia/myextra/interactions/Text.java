package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.objects.TargetMyExtra;

public class Text {

	private static String name;
	private static int row,col,lenght;
	
	
	public static String of(TargetMyExtra targetMyExtra) {
		name=targetMyExtra.getName();
		row=targetMyExtra.getRow();
		col=targetMyExtra.getCol();
		lenght=targetMyExtra.getLenght();
		return MyExtra.sesion().LeerTexto(row, col, lenght);
	}
	
	public static String of(TargetMyExtra targetMyExtra, MyExtra extra) {
		name=targetMyExtra.getName();
		row=targetMyExtra.getRow();
		col=targetMyExtra.getCol();
		lenght=targetMyExtra.getLenght();
		return extra.LeerTexto(row, col, lenght,extra);
	}

}
