package com.marcelo.bookstore.resources.exceptions;

public class StandardError {

	private Long timestamp;
	private Integer status;
	private String erros;

	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardError(Long timestamp, Integer status, String erros) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.erros = erros;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErros() {
		return erros;
	}

	public void setErros(String erros) {
		this.erros = erros;
	}

}
