package com.app.visa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="USER_REG_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int experience;
    private String country;
    
    public User() {
    }
    
	public String getName() {		
		return name;
	}
		public String getEmail() {		
			return email;
		}
			public int getExperience()  {	
				return experience;
		}
			public String getCountry() {		
				return country;
			}
	}
