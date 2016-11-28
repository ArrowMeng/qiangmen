/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qiangmen.auth.server.exception;

public class InvalidUserException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidUserException() {
	}

	public InvalidUserException(String message) {
		super(message);
	}

	public InvalidUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUserException(Throwable cause) {
		super(cause);
	}

	public InvalidUserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
