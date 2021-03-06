package com.expertmedics.jwtauthentication.controller;

import com.expertmedics.jwtauthentication.components.StripeClient;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/payment")
public class PaymentController {

  private StripeClient stripeClient;

  @Autowired
  PaymentController(StripeClient stripeClient) {
    this.stripeClient = stripeClient;
  }

  @PostMapping("/charge")
  public String chargeCard(HttpServletRequest request) throws Exception {
    System.out.println("Inside the Payment Process..");
    String token = request.getHeader("token");
    Double amount = Double.parseDouble(request.getHeader("amount"));
    System.out.println("End the Payment Process..");
    return this.stripeClient.chargeCreditCard(token, amount).toString();
  }
}
