package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer {

	@Id
	private int tid;
	private String tname;
	@OneToOne
	private Course course; // one trainer can handle one course
	@OneToMany
	private List<Students> listOfStd; // one trainer can handle more than one student

}
