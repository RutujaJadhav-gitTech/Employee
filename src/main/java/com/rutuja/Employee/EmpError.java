package com.rutuja.Employee;

public class EmpError {

	private String errCode;
	private String errMsg;

	public EmpError(String errCode,String errMsg) {
		super();
		this.errCode=errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return "EmpError [errCode=" + errCode + ", errMsg=" + errMsg + "]";
	}
	
	
}
