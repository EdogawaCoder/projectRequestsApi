package entities;

import java.time.LocalDateTime;
import java.util.UUID;

import enums.RequestStatus;

public class Request {

	private UUID id;
	private LocalDateTime date;
	private String clientName;
	private String description;
	private Double valueRequest;
	private RequestStatus status;

	/*
	* Constructor that sets an automatic ID 
	* and the current time for the request
	* 注文の自動IDと現在時刻を設定する構築子
	* ちゅうもんのじどう アイディー と げんざい じこく を せってい する こうちくし
	*/
	
	public Request() {

		this.id = UUID.randomUUID();
		this.date = LocalDateTime.now();

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Double getValueRequest() {
		return valueRequest;
	}

	public void setValueRequest(Double valueRequest) {
		this.valueRequest = valueRequest;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
