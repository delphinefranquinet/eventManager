package be.afelio.eventManagerJava.teamZDRR.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Event implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String place;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDateTime startEvent;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDateTime endEvent;
	private String description;
	private Integer idManager;
	private List<Activity> activities = new ArrayList<>();
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", place=" + place + ", startEvent=" + startEvent + ", endEvent="
				+ endEvent + ", description=" + description + ", idManager=" + idManager + ", activities=" + activities
				+ "]";
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
	public LocalDateTime getStartEvent() {
		return startEvent;
	}
	public void setStartEvent(LocalDateTime startEvent) {
		this.startEvent = startEvent;
	}
	public LocalDateTime getEndEvent() {
		return endEvent;
	}
	public void setEndEvent(LocalDateTime endEvent) {
		this.endEvent = endEvent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIdManager() {
		return idManager;
	}
	public void setIdManager(Integer idManager) {
		this.idManager = idManager;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
	
	
}
