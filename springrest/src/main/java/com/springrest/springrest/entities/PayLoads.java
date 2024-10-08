package com.springrest.springrest.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class PayLoads {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(unique = true)
	    private String shipperId;

	    private String loadingPoint;
	    private String unloadingPoint;
	    private String productType;
	    private String truckType;
	    private Integer noOfTrucks;
	    private Integer weight;
	    private String comment;
	    private String status;
	    private LocalDateTime date;
	    
	    @PrePersist
	    protected void onCreate() {
	        date = LocalDateTime.now();
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getShipperId() {
			return shipperId;
		}
		public void setShipperId(String shipperId) {
			this.shipperId = shipperId;
		}
		public String getLoadingPoint() {
			return loadingPoint;
		}
		public void setLoadingPoint(String loadingPoint) {
			this.loadingPoint = loadingPoint;
		}
		public String getUnloadingPoint() {
			return unloadingPoint;
		}
		public void setUnloadingPoint(String unloadingPoint) {
			this.unloadingPoint = unloadingPoint;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public String getTruckType() {
			return truckType;
		}
		public void setTruckType(String truckType) {
			this.truckType = truckType;
		}
		public Integer getNoOfTrucks() {
			return noOfTrucks;
		}
		public void setNoOfTrucks(Integer noOfTrucks) {
			this.noOfTrucks = noOfTrucks;
		}
		public Integer getWeight() {
			return weight;
		}
		public void setWeight(Integer weight) {
			this.weight = weight;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDateTime getDate() {
			return date;
		}
		public void setDate(LocalDateTime date) {
			this.date = date;
		}
	  
	    
}
