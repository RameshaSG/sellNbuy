package com.example.demo.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping("/payments")
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}
	
	@RequestMapping("/payments/{id}")
	public Payment getProduct(@PathVariable String id) {
		return null;
		//return productService.addProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/payments")
	public String addProduct(@RequestBody Payment payment) {
		return paymentService.addProduct(payment);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/payments/{id}")
	public void updateProduct(@RequestBody Payment payment, @PathVariable String id) {
		paymentService.updateProduct(id, payment);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/payments/{id}")
	public void deleteProduct(@RequestBody Payment payment, @PathVariable String id) {
		paymentService.deleteProduct(id, payment);
	}

}
