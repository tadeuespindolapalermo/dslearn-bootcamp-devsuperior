package com.devsuperior.dslearnbds.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;

	private List<FieldMessage> erros = new ArrayList<>();

	public ValidationError(StandardError error) {
		setTimestamp(error.getTimestamp());
		setStatus(error.getStatus());
		setError(error.getError());
		setMessage(error.getMessage());
		setPath(error.getPath());
	}

	public List<FieldMessage> getErros() {
		return erros;
	}

	public void addError(String fieldName, String message) {
		erros.add(new FieldMessage(fieldName, message));
	}

}
