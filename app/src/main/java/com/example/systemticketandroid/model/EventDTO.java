package com.example.systemticketandroid.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EventDTO implements Serializable {

    private Long eventID;

    private String eventTypeName;

    private String location;

    private String eventName;

    private String date;

    private String description;

    private Integer eventImage;

    private Double price;

    public EventDTO() {
    }

    public EventDTO(String eventTypeName, String location, String eventName, String date, String description, Integer eventImage, Double price) {
        this.eventTypeName = eventTypeName;
        this.location = location;
        this.eventName = eventName;
        this.date = date;
        this.description = description;
        this.eventImage = eventImage;
        this.price = price;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEventImage() {
        return eventImage;
    }

    public void setEventImage(Integer eventImage) {
        this.eventImage = eventImage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "eventID=" + eventID +
                ", eventTypeName='" + eventTypeName + '\'' +
                ", location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", eventImage=" + eventImage +
                ", price=" + price +
                '}';
    }
}


