package com.cg.ama.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset {
	
	@Id
	@Column(name="asset_id", unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long assetId;

	@ManyToOne
	@JoinColumn(name="wh_id")
	private Warehouse warehouse;
	
	private String model;
	
	@Enumerated(EnumType.STRING)
	private AssetType type;
	
	private String manufacturer;
}
