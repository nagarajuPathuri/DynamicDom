package com.aa.micro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aa.micro.bean.CheckBoxBean;
import com.aa.micro.bean.DataWrapperBean;
import com.aa.micro.bean.DomBeanRequest;
import com.aa.micro.bean.DomBeanResponse;

@Service
public class DomGenreatorServiceImpl implements DomGenreatorService {

	@Override
	public List<DomBeanResponse> createDom(DomBeanRequest domBeanRequest) {
		
		int idValue = 1;
		List<DomBeanResponse> items = new ArrayList<>();
		 // Create textbox objects
        for (int i = 0; i < domBeanRequest.getTextbox(); i++) {
        	DomBeanResponse item = new DomBeanResponse();
        	item.setId(idValue++);
        	item.setType("text");
        	item.setValue("Hello world!");        	
        	items.add(item);
        }

        // Create select objects
        for (int i = 0; i < domBeanRequest.getSelect(); i++) {
        	DomBeanResponse item = new DomBeanResponse();
            item.setId(idValue++);
            item.setType("dropdown");
            
            item.setData(List.of("ICE", "WATER", "GAS"));
            
            items.add(item);
        }

        // Create checkbox objects
        for (int i = 0; i < domBeanRequest.getCheckbox(); i++) {
        	DomBeanResponse item = new DomBeanResponse();
        	 item.setId(idValue++);
             item.setType("checkbox");
             List<CheckBoxBean> checkboxData = new ArrayList<>();
             
             CheckBoxBean waterBean = new CheckBoxBean();
             
             waterBean.setText("isWater");
             waterBean.setChecked(false);
             
             checkboxData.add(waterBean);
             CheckBoxBean gasBean = new CheckBoxBean();
             
             gasBean.setText("isGas");
             gasBean.setChecked(true);
             checkboxData.add(gasBean);
             
             item.setData(checkboxData);
             
             items.add(item);
        }
		
		return items;
	}

}
