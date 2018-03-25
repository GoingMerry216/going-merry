package com.sdu.software.goingmerry.common;

public class GoingMerryException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2589624963588917690L;
	
	private String code;
	private String message;

	/**
	 * 构造方法.
	 * 
	 * @param errorCode
	 *            异常码
	 */
	public GoingMerryException(GoingMerryErrorCode errorCode) {
		this(errorCode, null, null);
	}

	/**
	 * 构造方法.
	 * 
	 * @param errorCode
	 *            异常码
	 * @param param
	 *            消息参数
	 */
	public GoingMerryException(GoingMerryErrorCode errorCode, Object... param) {
		this(errorCode, param, null);
	}

	/**
	 * 构造方法.
	 * 
	 * @param errorCode
	 *            异常码
	 * @param param
	 *            消息参数
	 * @param cause
	 *            异常原因
	 */
	public GoingMerryException(GoingMerryErrorCode  errorCode, Object[] param,
			Throwable cause) {
		if (errorCode == null) {
			this.code = "NO CODE";
			this.message = "NO MESSAGE";
		} else {
			this.code = errorCode.getCode();
			this.message = errorCode.getMessage(param);
			if (!errorCode.hasMessageFormats() && cause != null) {
				this.message += "\r\nCause: " + cause.getMessage();
			}
		}
		if (cause != null) {
			initCause(cause);
		}
	}
	

	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}

}
