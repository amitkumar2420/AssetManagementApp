package com.cg.ama.service.report;

import java.util.List;

import com.cg.ama.model.ShipmentModel;

public interface IReportService {
		List<ShipmentModel> getShipmentsByWeek(int week, int month, int year);
		List<ShipmentModel> getShipmentsByMonth(int month, int year);
		List<ShipmentModel> findAllByWeekly();
		List<ShipmentModel> findAllByMonthly();
}
