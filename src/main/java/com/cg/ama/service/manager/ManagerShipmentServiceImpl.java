package com.cg.ama.service.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ama.exception.ShipmentNotFoundException;
import com.cg.ama.model.ShipmentModel;
import com.cg.ama.repo.ShipmentRepo;
import com.cg.ama.service.admin.EMParser;

@Service
public class ManagerShipmentServiceImpl implements IManagerShipmentService {
	
	@Autowired
	private EMParser parser;
	
	@Autowired
	private ShipmentRepo shipmentRepo;
	
	@Override
	public ShipmentModel getShipmentById(Long shipmentId) throws ShipmentNotFoundException {
		if (!shipmentRepo.existsById(shipmentId)) {
			throw new ShipmentNotFoundException("No shipment present with the given ID");
		}
		return parser.parse((shipmentRepo.findById(shipmentId).orElse(null)));
	}


	@Override
	public List<ShipmentModel> getShipments() throws ShipmentNotFoundException {
		if (shipmentRepo.count() == 0) {
			throw new ShipmentNotFoundException("No Shipment present with the given ID");
		}
		return shipmentRepo.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}
	
	@Override
	public ShipmentModel modifyShipment(Long shipmentId, ShipmentModel shipmentModel) throws ShipmentNotFoundException {
		if(shipmentModel != null) {
			if (!shipmentRepo.existsById(shipmentId)) {
				throw new ShipmentNotFoundException("Shipment Not present in DB.");
			}
			shipmentModel = parser.parse((shipmentRepo.save(parser.parse(shipmentModel))));
		}
		return shipmentModel;
	}


	@Override
	public String modifyShipmentStatus(Long shipmentId) throws ShipmentNotFoundException {
		if (!shipmentRepo.existsById(shipmentId)) {
			throw new ShipmentNotFoundException("No Shipment present with the given ID");
		}
		shipmentRepo.setDeliveryStatus(shipmentId);;
		return "Shipment Status set to DELIVERED";
	}




}
