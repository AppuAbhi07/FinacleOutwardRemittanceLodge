package com.idbiintech.customException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.idbiintech.beans.ExceptionResponse;

public class GlobalBalanceexception extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleException(Exception ex) {

		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Internal Server Error ,Contact IT team");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;

	}

	@ExceptionHandler(Address1NotFoundExcpetion.class)
	public ResponseEntity<Object> handleExceptions(Address1NotFoundExcpetion exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Address details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(AdvAgainstExpNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(AdvAgainstExpNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Advance Export Type details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(BenificaryAdd1NotFoundException.class)
	public ResponseEntity<Object> handleExceptions(BenificaryAdd1NotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Benficiary address1 details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(ChargeDebitAcctIdNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(ChargeDebitAcctIdNotFoundException exception,
			WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Charge Debit Account id details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(ChargesPayableByNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(ChargesPayableByNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Charges Pay details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(DocEventNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(DocEventNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Document Event  details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(DocNumNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(DocNumNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Document Num  details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(DocRefCodeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(DocRefCodeNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Document Ref  details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(DraweeAdd1NotFoundException.class)
	public ResponseEntity<Object> handleExceptions(DraweeAdd1NotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Drawee Address 1  details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(DraweeBankAddressNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(DraweeBankAddressNotFoundException exception,
			WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Drawee Bank Address details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(ForAcidNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(ForAcidNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("ForAcid details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(InstrumentAmountNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(InstrumentAmountNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Instrument Amount details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(InstrumentCurNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(InstrumentCurNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Instrument Amount Currency details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(NameNotFoundExcpetion.class)
	public ResponseEntity<Object> handleExceptions(NameNotFoundExcpetion exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Name details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(PSTForwardContractNumNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(PSTForwardContractNumNotFoundException exception,
			WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("PSTForwardContractNum details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(PSTRefAmtCurNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(PSTRefAmtCurNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("PSTRefAmtCur details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(PSTRefAmtNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(PSTRefAmtNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("PSTRefAmt details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RefAmountNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RefAmountNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RefAmoun details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RefAmtCurNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RefAmtCurNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RefAmtCur details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RefCurCodeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RefCurCodeNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RefCur details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemitCurrencyNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemitCurrencyNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemitCurrency details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemitNameNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemitNameNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemitName details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemittanceAmountNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemittanceAmountNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemittanceAmount details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemittanceCurCodeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemittanceCurCodeNotFoundException exception,
			WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemittanceCurCode details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemittanceIdNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemittanceIdNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemittanceId details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemittanceTypeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemittanceTypeNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemittanceType details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(RemitTranForAcidNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(RemitTranForAcidNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemitTranForAcid details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(SolIdNotFoundExcpetion.class)
	public ResponseEntity<Object> handleExceptions(SolIdNotFoundExcpetion exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("RemitTranForAcid details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(TrnSubtypeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(TrnSubtypeNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("TrnSubtype details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(TrnTypeNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(TrnTypeNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("TrnType details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(ValueDateNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(ValueDateNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Value details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

}
