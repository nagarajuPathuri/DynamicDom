package com.aa.micro.service;

import java.util.List;

import com.aa.micro.bean.DomBeanRequest;
import com.aa.micro.bean.DomBeanResponse;

public interface DomGenreatorService {

	List<DomBeanResponse> createDom(DomBeanRequest domBeanRequest);
}
