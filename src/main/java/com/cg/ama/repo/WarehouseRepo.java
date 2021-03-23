package com.cg.ama.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ama.entity.WarehouseEntity;


@Repository
public interface WarehouseRepo  extends JpaRepository<WarehouseEntity, Long>{

}
