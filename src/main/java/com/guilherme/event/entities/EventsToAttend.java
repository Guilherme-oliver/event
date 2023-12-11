package com.guilherme.event.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_events_attend")
public class EventsToAttend {

    @EmbeddedId
    private EventsToAttendPK id = new EventsToAttendPK();

    private Integer quantity;
    private Double price;

    public EventsToAttend(){}

    public EventsToAttend(Activity activity, Participant participant, Integer quantity, Double price) {
        id.setActivity(activity);
        id.setParticipant(participant);
        this.quantity = quantity;
        this.price = price;
    }

    public Activity getActivity() {
        return id.getActivity();
    }

    public void setActivity(Activity activity) {
        id.setActivity(activity);
    }

    public Participant  getParticipant() {
        return id.getParticipant();
    }

    public void setParticipant(Participant participant) {
        id.setParticipant(participant);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsToAttend that = (EventsToAttend) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}