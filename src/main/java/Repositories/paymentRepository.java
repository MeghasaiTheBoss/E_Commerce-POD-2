package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Payment;

public interface paymentRepository extends JpaRepository<Payment, Integer> 
{

}
