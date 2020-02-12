package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	
	@Column
	private String description;
	
	@ManyToOne
	private StaffActivite staffActivite;
}
