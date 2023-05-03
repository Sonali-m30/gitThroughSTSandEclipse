package com.web.main.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QualificationInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int qid;
	private String nameOfDegree;
	private String subject;
	private String university;
	private String state;
	private String percentage;

	@OneToMany(cascade = CascadeType.ALL)
	private List<AddressInformation> address=new ArrayList<>();
	
}
