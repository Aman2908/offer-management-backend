package com.mypathshala.OfferManagementBackend.models;


public class OfferModel {
	
	private int offerId;
	private String offerType;
	private String useType;
	private String creator;
	private String displayType;
	private String displayContent;
	private String status;
	private int useCount;
	private int minCartValue;
	private int maxDiscount;
	private int percentDiscount;
	private int flatDiscount;
	
	public int getMinCartValue() {
		return minCartValue;
	}

	public void setMinCartValue(int minCartValue) {
		this.minCartValue = minCartValue;
	}

	public int getMaxDiscount() {
		return maxDiscount;
	}

	public void setMaxDiscount(int maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	public int getPercentDiscount() {
		return percentDiscount;
	}

	public void setPercentDiscount(int percentDiscount) {
		this.percentDiscount = percentDiscount;
	}

	public int getFlatDiscount() {
		return flatDiscount;
	}

	public void setFlatDiscount(int flatDiscount) {
		this.flatDiscount = flatDiscount;
	}

	public int getOfferId() {
		return offerId;
	}
	
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	
	public String getOfferType() {
		return offerType;
	}
	
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	
	public String getUseType() {
		return useType;
	}
	
	public void setUseType(String useType) {
		this.useType = useType;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getDisplayType() {
		return displayType;
	}
	
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	
	public String getDisplayContent() {
		return displayContent;
	}
	
	public void setDisplayContent(String displayContent) {
		this.displayContent = displayContent;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getUseCount() {
		return useCount;
	}
	
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	
	public OfferModel(int offerId, String offerType, String useType, String creator, String displayType,
			String displayContent, String status, int useCount) {
		this.offerId = offerId;
		this.offerType = offerType;
		this.useType = useType;
		this.creator = creator;
		this.displayType = displayType;
		this.displayContent = displayContent;
		this.status = status;
		this.useCount = useCount;
	}
	
	public OfferModel() {
		
	}
	
	
	
}