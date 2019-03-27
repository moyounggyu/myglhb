package com.sample.bootTest.main.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "SAMPLE")
@Data
public class Sample {

	@Id
	@GeneratedValue
	@Column(name = "SAMPLE_ID")
	private int sampleId;

	@Column(name = "SAMPLE_NAME")
	private String sampleName;
	
	@Column(name = "SAMPLE_DESC")
	private String sampleDesc;
}
