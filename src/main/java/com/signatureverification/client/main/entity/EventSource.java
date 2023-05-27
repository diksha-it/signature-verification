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

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public Long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Long getAmountInMur() {
		return amountInMur;
	}

	public void setAmountInMur(Long amountInMur) {
		this.amountInMur = amountInMur;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getAccountShortName() {
		return accountShortName;
	}

	public void setAccountShortName(String accountShortName) {
		this.accountShortName = accountShortName;
	}

	public String getDebitAccountCcy() {
		return debitAccountCcy;
	}

	public void setDebitAccountCcy(String debitAccountCcy) {
		this.debitAccountCcy = debitAccountCcy;
	}

	public String getPaymentDetails1() {
		return paymentDetails1;
	}

	public void setPaymentDetails1(String paymentDetails1) {
		this.paymentDetails1 = paymentDetails1;
	}

	public String getPaymentDetails2() {
		return paymentDetails2;
	}

	public void setPaymentDetails2(String paymentDetails2) {
		this.paymentDetails2 = paymentDetails2;
	}

	public String getPaymentDetails3() {
		return paymentDetails3;
	}

	public void setPaymentDetails3(String paymentDetails3) {
		this.paymentDetails3 = paymentDetails3;
	}

	public String getPaymentDetails4() {
		return paymentDetails4;
	}

	public void setPaymentDetails4(String paymentDetails4) {
		this.paymentDetails4 = paymentDetails4;
	}

	public String getSourceBu() {
		return sourceBu;
	}

	public void setSourceBu(String sourceBu) {
		this.sourceBu = sourceBu;
	}

	public String getVerfied() {
		return verfied;
	}

	public void setVerfied(String verfied) {
		this.verfied = verfied;
	}

	public String getDiscrepancyReason() {
		return discrepancyReason;
	}

	public void setDiscrepancyReason(String discrepancyReason) {
		this.discrepancyReason = discrepancyReason;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDocumentCaptureReference() {
		return documentCaptureReference;
	}

	public void setDocumentCaptureReference(String documentCaptureReference) {
		this.documentCaptureReference = documentCaptureReference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
