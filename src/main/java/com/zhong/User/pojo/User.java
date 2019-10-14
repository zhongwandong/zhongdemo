package com.zhong.User.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;


import lombok.Data;


@Data
@Entity
@Table(name="USER")
public class User implements Serializable{

	private static final long serialVersionUID = 7694099504234712548L;
	
	@Id
	@GeneratedValue(generator="USER",strategy=GenerationType.AUTO)
	private Long id;
	//姓名
	@NotNull(message = "姓名不能为空")
	@Column(name="NAME")
	private String name;
	@Column(name="AGE")
	private Integer age;
	//密码
	@Column(name="PASSWORD")
	private String password;
	//登录时间
	@Column(name="BIREHDAY")
	@Past
	private Date birthday;
	//出生地
	@Transient
	private String city;
	//性别
	@Column(name="SEX")
	private String sex;
	//职位
	@Column(name="POST")
	private String post;
}
