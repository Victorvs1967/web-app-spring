package com.vvs.web.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Member {
	
	@Id
	@Email
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "MEMBER_ROLES", joinColumns = {
			@JoinColumn(name = "MEMBER_EMAIL", referencedColumnName = "email")}, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name")})
	
	private List<Role> role;

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailString) {
		this.email = emailString;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public Member(@Email @NotEmpty String email, @NotEmpty String password, @NotEmpty String firstName,
			@NotEmpty String lastName) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Member() {
	}
	
}
