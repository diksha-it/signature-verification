package com.signatureverification.client.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userdetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userBuInfo")
	private String userBuInfo;

	@Column(name = "userPwd")
	private String userPwd;
}
