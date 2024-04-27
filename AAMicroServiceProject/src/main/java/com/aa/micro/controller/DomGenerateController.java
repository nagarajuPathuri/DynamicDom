package com.aa.micro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aa.micro.bean.DomBeanRequest;
import com.aa.micro.bean.DomBeanResponse;
import com.aa.micro.service.DomGenreatorService;



@RestController
@CrossOrigin("*")

public class DomGenerateController {
	
	@Autowired
	DomGenreatorService domGenreatorService;
	
 @PostMapping("/generateDom")
 public ResponseEntity<List<DomBeanResponse>> generateItems(@RequestBody DomBeanRequest request) {
     List<DomBeanResponse> items = new ArrayList<>();
     
     items = domGenreatorService.createDom(request);
     
     return new ResponseEntity<>(items, HttpStatus.OK);

     
 }
}
