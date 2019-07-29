package be.afelio.eventManagerJava.teamZDRR.beans;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Activity {
	
	private Integer id;
	private String name;
	private String place;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDateTime startActivity;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDateTime endActivity;
	private String description;
	private Integer idEvent;
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + ", place=" + place + ", startActivity=" + startActivity
				+ ", endActivity=" + endActivity + ", description=" + description + ", idEvent=" + idEvent + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDateTime getStartActivity() {
		return startActivity;
	}
	public void setStartActivity(LocalDateTime startActivity) {
		this.startActivity = startActivity;
	}
	public LocalDateTime getEndActivity() {
		return endActivity;
	}
	public void setEndActivity(LocalDateTime endActivity) {
		this.endActivity = endActivity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Integer idEvent) {
		this.idEvent = idEvent;
	}
	
	
	

}
