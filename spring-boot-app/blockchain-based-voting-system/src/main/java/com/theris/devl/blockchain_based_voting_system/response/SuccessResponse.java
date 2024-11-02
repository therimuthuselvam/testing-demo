package com.theris.devl.blockchain_based_voting_system.response;

import com.theris.devl.blockchain_based_voting_system.response.interfce.Response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SuccessResponse implements Response{
	
	@Getter(AccessLevel.NONE) // Prevent Lombok from generating a getter
	private String successMessage;

	@Override
	public String getMessage() {
		return this.successMessage;
	}
	
}
