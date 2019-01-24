package com.expertmedics.jwtauthentication;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootJwtAuthenticationApplication {

	public static void main(String[] args) throws StripeException {
		SpringApplication.run(SpringBootJwtAuthenticationApplication.class, args);
		/*Stripe.apiKey = "sk_test_2NGbHkJTAjNLW9opb77n9prJ";
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.put("amount", 20000);
		chargeParams.put("currency", "usd");
		chargeParams.put("description", "Charge for jenny.rosen@example.com");
		chargeParams.put("source", "tok_mastercard");
// ^ obtained with Stripe.js
		System.out.println(Charge.create(chargeParams));*/
	}
}
