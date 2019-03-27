package com.sample.bootTest.main.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long>{
	public void deleteBySampleId(String sampleId);
	
}
