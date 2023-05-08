package com.coursemsb.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursemsb.hrpayroll.entities.Payment;
import com.coursemsb.hrpayroll.entities.Worker;
import com.coursemsb.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClients workerFeignClient;
	
	public Payment getpayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
