package com.signatureverification.client.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "event_source")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventSource {
	@Id
	@Column(name = "business_key")
	private String businessKey;

	@Column(name = "application")
	private String application;

	@Column(name = "comments")
	private String comments;

	@Column(name = "transaction_currency")
	private String transactionCurrency;
	
	@Column(name = "transaction_amount")
	private Long transactionAmount;
	
	@Column(name = "amount_in_mur")
	private Long amountInMur;
	
	@Column(name = "debit_account_number")
	private String debitAccountNumber;
	
	@Column(name = "account_short_name")
	private String accountShortName;
	
	
	@Column(name = "debit_account_ccy")
	private String debitAccountCcy;
	
	
	@Column(name = "payment_details_1")
	private String paymentDetails1;
	
	@Column(name = "payment_details_2")
	private String paymentDetails2;
	
	@Column(name = "payment_details_3")
	private String paymentDetails3;
	
	@Column(name = "payment_details_4")
	private String paymentDetails4;
	
	@Column(name = "source_bu")
	private String sourceBu;
	
	@Column(name = "verfied")
	private String verfied;
	
	@Column(name = "discrepancy_reason")
	private String discrepancyReason;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	private Date  createdOn;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedOn")
	private Date updatedOn;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "document_capture_reference")
	private String documentCaptureReference;
	
	@Column(name = "status")
	private String status;

}
