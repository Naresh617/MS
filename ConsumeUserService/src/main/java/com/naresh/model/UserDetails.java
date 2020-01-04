package com.naresh.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
public class UserDetails {
	
	private Long id;
	private String name;
	private Integer age;
	public UserDetails(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
