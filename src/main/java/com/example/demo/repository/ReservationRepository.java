package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	Optional<Reservation> findById(Long id );
	Optional<Reservation> findByNumRes(String numRes);
	Optional<Reservation> deleteBynumRes(String numRes);
	

}
