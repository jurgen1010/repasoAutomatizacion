package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.PaymentMethod;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerPaymentMethod implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaymentMethod.TEXTO_PAYMENT_METHOD).viewedBy(actor).asString();
	}
	public static VerPaymentMethod enPantalla() {
		return new VerPaymentMethod();
	}

}
