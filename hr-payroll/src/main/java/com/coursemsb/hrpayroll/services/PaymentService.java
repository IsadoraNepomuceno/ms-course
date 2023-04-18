package com.coursemsb.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.coursemsb.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getpayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
