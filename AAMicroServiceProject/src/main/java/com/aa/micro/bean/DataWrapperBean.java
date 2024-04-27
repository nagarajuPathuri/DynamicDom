package com.aa.micro.bean;

import java.util.List;

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
public class DataWrapperBean<T> {

//	@JsonInclude(JsonInclude.Include.NON_NULL)
//    private List<CheckBoxBean> cData;
//    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<T> data;
}
