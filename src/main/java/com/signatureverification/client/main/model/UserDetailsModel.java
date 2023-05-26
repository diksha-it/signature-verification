package com.signatureverification.client.main.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDetailsModel {

	@NotEmpty(message = "user nam is required")
	private String userName;

	private String userBuInfo;

	@NotEmpty(message = "user nam is required")
	private String userPwd;
}
