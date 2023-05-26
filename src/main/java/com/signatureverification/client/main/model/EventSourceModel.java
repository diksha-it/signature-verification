package com.signatureverification.client.main.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventSourceModel {
	private String businessKey;

	private String application;

	private String comments;

	private String transactionCurrency;

	private Long transactionAmount;

	private Long amountInMur;

	private String debitAccountNumber;

	private String accountShortName;

	private String debitAccountCcy;

	private String paymentDetails1;

	private String paymentDetails2;

	private String paymentDetails3;

	private String paymentDetails4;

	private String sourceBu;

	private String verfied;

	private String discrepancyReason;

	private String createdBy;

	private Date createdOn;

	private String updatedBy;

	private Date updatedOn;

	private String priority;

	private String documentCaptureReference;

	private String status;

}
