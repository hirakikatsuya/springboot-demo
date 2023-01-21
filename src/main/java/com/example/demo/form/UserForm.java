package com.example.demo.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

@Data
public class UserForm {

	@Size(min = 1, max = 200)
	private String name;

	@Email
	@Size(min = 1, max = 200)
	private String email;
}