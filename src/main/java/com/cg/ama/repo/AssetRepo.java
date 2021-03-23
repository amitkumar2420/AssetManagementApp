package com.cg.ama.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.ama.entity.AssetEntity;

@Repository
public interface AssetRepo extends JpaRepository<AssetEntity, Long>{
	
}
