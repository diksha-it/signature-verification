package com.signatureverification.client.main.model;

public class VerificatioCountModel {

	private String label;

	private Long count;

	public VerificatioCountModel(String label, Long count) {
		super();
		this.label = label;
		this.count = count;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	
	

}
