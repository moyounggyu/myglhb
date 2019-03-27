package com.sample.bootTest.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootTestController {

	@Autowired
	SampleRepository sampleRepository;
	
	
	@GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
	}
	
	@GetMapping({"/", "/sample"})
    public String sample(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "sample";
	}
	
	@GetMapping({"/", "/sampleAllList"})
    public String sampleList(Model model) {
        model.addAttribute("list", sampleRepository.findAll());
        return "hello";
	}
	
	//@PostMapping({"/", "/sampleAdd"})
	//@ResponseBody
	@RequestMapping("/sampleAdd")
    public String sampleAdd(Model model, @RequestParam Sample sample) {
        model.addAttribute("list", sampleRepository.save(sample));
        return "hello";
	}
	
	@PostMapping({"/", "/sampleDel"})
    public String sampleDel(Model model, @RequestParam(value="sampleId", required=true) String sampleId) {
        sampleRepository.deleteBySampleId(sampleId);
        return "hello";
	}
	
	
	@GetMapping({"/", "/sampleInfo"})
    public String sampleInfo(Model model, @RequestParam(value="sampleId", required=true) String sampleId) {
        model.addAttribute("list", sampleRepository.findById(Long.getLong(sampleId)));
        return "hello";
	}
}
