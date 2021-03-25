package com.cg.ama.service.admin;

import java.util.List;
import com.cg.ama.exception.DuplicateEntryException;
import com.cg.ama.exception.ShipmentNotFoundException;
import com.cg.ama.model.ShipmentModel;


public interface IAdminShipmentService {
	ShipmentModel getShipmentById(Long shipmentId) throws ShipmentNotFoundException;
	ShipmentModel addShipment(ShipmentModel shipmentModel) throws DuplicateEntryException;
	List<ShipmentModel> getShipments() throws ShipmentNotFoundException;
	ShipmentModel modifyShipment(Long shipmentId, ShipmentModel shipmentModel) throws ShipmentNotFoundException;
	String deleteShipmentById(Long shipmentId) throws ShipmentNotFoundException;
}
