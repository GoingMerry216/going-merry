package com.sdu.software.goingmerry.common;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public enum GoingMerryErrorCode {
	// BEGIN
	// common
	SYSTEM_ERROR,
	COMMON_DATA_TRANSFER_PO_MERGE_ERROR,
	COMMON_TO_BO_FIELD_ERROR,
	COMMON_TO_PO_FIELD_ERROR,
	PARAM_IS_NULL,
	PARAM_IS_BLANK,
	OBJECT_TO_JSON_ERROR,
	JSON_TO_OBJECT_ERROR,
	LOCK_ENTITY_ACQUIRED_TIMEOUT,
	K8S_ERROR,
	DATE_PARSE_ERROR,
	JSON_TO_OBJ_ERROR,
	OBJ_TO_JSON_ERROR,
	NULL_PARA_ERROR,
	BLANK_PARA_ERROR,
	ILLEGAL_PARAMETER_ERROR,
	INVALID_NAME,
	INVALID_EMAIL,
	INVALID_PHONE,
	PASSWORD_LEN_TOO_SHORT,
	PASSWORD_TOO_SIMPLE,
	PASSWORD_CONTAIN_INVALID_CHAR,
	K8S_YAML_DUMP_FAILED,    // TODO 添加国际化翻译
	K8S_DEPLOYMENT_PARAMETER_REPLACE_ERROR,    // TODO 添加国际化翻译
	STRING_TO_DATE_ERROR,    // TODO 添加国际化翻译
	
	// sysconfig
	SYSCONFIG_NOT_FOUND_BY_ID_ERROR,
	
	
	// cluster
	CLUSTER_HTTPS_CONFIG_INCOMPLETE,
	CLUSTER_NOT_FOUND_WITH_ID,
	CLUSTER_DUPLICATE_CODE,
	
	
	// users
	TOKEN_GENERATE_ERROR,
	TOKEN_PARSE_ERROR,
	TOKEN_INVALID_NO_USERID,
	TOKEN_INVALID_EXPIRED,
	TOKEN_INVALID_NOT_FOUND_USER,
	TOKEN_INVALID_LOGOUT,
	AUTHENTICATION_FAILED,
	USER_STATUS_IS_DISABLED,
	USER_NOT_FOUND_WITH_ID,
	USER_DUPLICATE_ID,
	USER_DUPLICATE_NAME,
	USER_DUPLICATE_EMAIL,
	OLD_PASSWORD_NOT_MATCHED,
	AUTH_TOKEN_IS_NULL,
	AUTH_TOKEN_IS_EXPIRED,
	AUTH_TOKEN_IS_INVALID,
	
	// harbor
	HARBOR_LOGIN_FAILED,
	HARBOR_CALL_INNER_ERROR,
	HARBOR_CALL_ERROR,
	HARBOR_PROJECT_NAME_DUPLICATED,
	HARBOR_REPOSITORIES_NAME_DUPLICATED,
	HARBOR_PROJECT_NOT_FOUND_BY_NAME,
	HARBOR_USER_NOT_FOUND_BY_NAME,
	HARBOR_USER_CREATE_FAILED_BY_UNSATISFIED_CONSTRAINTS,
	HARBOR_USER_REGISTION_INVALID,
	
	
	// app
	APP_DUPLICATE_CODE,
	APP_DUPLICATE_VERSION,
	APP_NOT_FOUND_WITH_CODE,   // TODO 添加国际化翻译
	NUM_LE,
	NUM_GE,
	APP_NOT_FOUND_WITH_ID,
	APP_VERSION_NOT_FOUND_WITH_ID,
	
	// service
	SVC_DUPLICATE_CODE,
	SVC_DUPLICATE_VERSION_NUM,
	SVC_NOT_FOUND_WITH_ID,
	SVC_NOT_FOUND_WITH_CODE,	// TODO 添加国际化翻译
	SVC_NOT_SUPPORTED_DEPLOY_RESOURCE_TYPE, 
	
	// system
	SYSTEM_NOT_CONFIG_ANY_IMAGE_SPACE,  
	SYSTEM_MEMBER_DUPLICATE,
	SYSTEM_NOT_FOUND_WITH_ID,
	
	// image repo
	IMAGE_REPO_DUPLICATE_NAME,
	IMAGE_REPO_NOT_FOUND_WITH_ID,
	
	// resSpace
	RESSPACE_NOT_FOUND_WITH_ID,
	
	// 
	

	// END
	;

	/*
	 * =====================
	 * =====================
	 */
	/**
	 * 创建受查异常.<br>
	 * 
	 * @param params
	 *            异常信息参数
	 * @return 受查异常
	 */
	public GoingMerryException exception(Object... params) {
		return new GoingMerryException(this, params);
	}

	/**
	 * 创建受查异常.<br>
	 * 
	 * @param cause
	 *            异常原因
	 * @param params
	 *            异常信息参数
	 * @return 受查异常
	 */
	public GoingMerryException exception(Throwable cause, Object... params) {
		return new GoingMerryException(this, params, cause);
	}

	/**
	 * 创建运行时异常.<br>
	 * 
	 * @param params
	 *            异常信息参数
	 * @return 运行时异常
	 */
	public GoingMerryRuntimeException runtimeException(Object... params) {
		return new GoingMerryRuntimeException(this, params);
	}

	/**
	 * 创建运行时异常.<br>
	 * 
	 * @param cause
	 *            异常原因
	 * @param params
	 *            异常信息参数
	 * @return 运行时异常
	 */
	public GoingMerryRuntimeException runtimeException(Throwable cause,
			Object... params) {
		return new GoingMerryRuntimeException(this, params, cause);
	}

	/*
	 * =====================
	 * =====================
	 */
	public String getCode() {
		return this.name();
	}

	public String getMessage() {
		return getMessage(Locale.getDefault(), (Object[]) null);
	}

	public String getMessage(Object... params) {
		return getMessage(Locale.getDefault(), params);
	}

	boolean hasMessageFormats() {
		try {
			ResourceBundle bundle = ResourceBundle.getBundle(GoingMerryErrorCode.class.getName());
			String message = bundle.getString(this.name());
			return new MessageFormat(message).getFormats().length > 0;
		} catch (Throwable e) {
			/* 不记入日志, 可以减少依赖 */
			e.printStackTrace();
		}
		return false;
	}

	private String getMessage(Locale locale, Object... params) {
		String message = "NO MESSAGE!!!";
		if (locale == null) {
			locale = Locale.getDefault();
		}
		try {
			ResourceBundle bundle = ResourceBundle.getBundle(GoingMerryErrorCode.class.getName(), locale);
			message = bundle.getString(this.name());
		} catch (Throwable e) {
			/* 不记入日志, 可以减少依赖 */
			e.printStackTrace();
		}
		try {
			return new MessageFormat(message).format(params);
		} catch (Throwable e) {
			return message;
		}
	}
}
