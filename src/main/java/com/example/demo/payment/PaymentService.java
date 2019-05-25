package com.example.demo.payment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public List<Payment> getAllPayments(){

		List<Payment> payments = new ArrayList<>();
		paymentRepository.findAll()
		.forEach(payments::add);
		return payments;
	}
	
//	public Product getProduct(Iterable<String> id) {
//		 //return products.stream().filter( p -> p.getId().equals(id)).findFirst().get();
//		return (Product) productRepository.findAllById(id);
//	}
	
	public String addProduct(Payment payment) {
		if (payment.getId() != "" && payment.getAmount() != 0 && payment.getDate() != "" && payment.getOrderid() != "") {
			paymentRepository.save(payment);
			return "Payment added!";
		}
		return "ERROR: Values cannot be empty";
	}

	public void updateProduct(String id, Payment payment) {
		paymentRepository.save(payment);
	}

	public void deleteProduct(String id, Payment payment) {
		paymentRepository.deleteById(id);
		
	}
}
