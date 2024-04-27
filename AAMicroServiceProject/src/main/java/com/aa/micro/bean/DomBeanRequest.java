package com.aa.micro.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DomBeanRequest {
	@Getter
	private int textbox;
	@Getter
    private int select;
	@Getter
    private int checkbox;
	@Getter
    private List<String> data;
	

}
