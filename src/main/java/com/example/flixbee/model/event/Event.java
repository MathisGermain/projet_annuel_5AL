package com.example.flixbee.model.event;

import com.example.flixbee.model.Image;
import com.example.flixbee.model.event.DateEvent;

import java.util.ArrayList;

public class Event {

    private DateEvent date;
    private String name;
    private String description;
    private String detail;
    private String id;
    private Image image;
    private String url;
    private String social;
    private String price;
    private String location;
    private Objectif objectif;
    private Integer numberOfPlaces;
    private ArrayList<Guest> guestList;
    private ArrayList<ScheduleEvent> schedule;
    private ArrayList<Partner> partners;
    private ArrayList<FAQ> faqs;
    private ArrayList<String> photos;

    public Event(DateEvent date,String id, String name, String description) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public DateEvent getDate() {
        return date;
    }

    public void setDate(DateEvent date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Objectif getObjectif() {
        return objectif;
    }

    public void setObjectif(Objectif objectif) {
        this.objectif = objectif;
    }

    public Integer getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(Integer numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public ArrayList<ScheduleEvent> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<ScheduleEvent> schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Partner> getPartners() {
        return partners;
    }

    public void setPartners(ArrayList<Partner> partners) {
        this.partners = partners;
    }

    public ArrayList<FAQ> getFaqs() {
        return faqs;
    }

    public void setFaqs(ArrayList<FAQ> faqs) {
        this.faqs = faqs;
    }

    public ArrayList<String> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<String> photos) {
        this.photos = photos;
    }
}
