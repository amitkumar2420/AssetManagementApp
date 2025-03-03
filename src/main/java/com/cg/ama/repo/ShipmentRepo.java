package com.cg.ama.repo;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ama.entity.ShipmentEntity;


@Repository
public interface ShipmentRepo extends JpaRepository<ShipmentEntity, Long>{
	
	@Query(value  = 
		    " select * from shipments where ship_date >= :startDate AND ship_date <= :endDate", nativeQuery = true)
		public List<ShipmentEntity> getShipmentsInfo(
		    @Param("startDate") LocalDate startDate, 
		    @Param("endDate") LocalDate endDate);
	
	@Modifying
	@Transactional
	@Query(value = "update shipments set status = 'DELIVERED' where shipment_id = :shipmentId", nativeQuery = true)
	public void setDeliveryStatus(@Param("shipmentId") Long shipmentId);
	
	@Query(value = 
			"select * from shipments  where ship_date > now() - interval '1 week'", nativeQuery = true)
		List<ShipmentEntity> getShipmentsInfoWeekly();
	
	@Query(value = 
			"select * from shipments  where ship_date > now() - interval '4 week'", nativeQuery = true)
		List<ShipmentEntity> getShipmentsInfoMonthly();

}