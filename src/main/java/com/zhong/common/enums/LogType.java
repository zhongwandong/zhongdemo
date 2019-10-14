package com.zhong.common.enums;

import lombok.Getter;
import lombok.Setter;


public enum LogType {
	ERRORS(1,"error"),
	WARNS(2,"warn")
	;
	@Setter @Getter
	private Integer key;
	
	@Setter @Getter
	private String value;
	
	private LogType(Integer key,String value) {
		this.key=key;
		this.value=value;
	}
	/**
	 * 获取value
	 * @param key
	 * @return
	 */
	public static String getName(int key) {
		for(LogType type : LogType.values()) {
			if(type.getKey().equals(key)) {
				return type.getValue();
			}
		}
		
		return null;
	}
	/**
	 * 获取key
	 * @param type
	 * @return
	 */
	public static Integer fromInt(LogType type) {
		
		for(LogType types : LogType.values()) {
			if(type.equals(types)) {
				return types.getKey();
			}
		}
		return null;
	}
	
}
