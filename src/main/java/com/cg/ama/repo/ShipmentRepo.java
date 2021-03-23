package com.cg.ama.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ama.entity.ShipmentEntity;

@Repository
public interface ShipmentRepo extends JpaRepository<ShipmentEntity, Long>{
	
}
