package com.aa.micro.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckBoxBean {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String text;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean isChecked;

}
