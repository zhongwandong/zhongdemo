package com.zhong.school.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class School implements Serializable{

	private Long id;
	private static final long serialVersionUID = -8852082436457745603L;
	private String sname;//学校名称
	private String scode;//学校编号

	
}
