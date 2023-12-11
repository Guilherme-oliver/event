package com.guilherme.event.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class EventsToAttendPK {

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;

    public EventsToAttendPK(){}

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsToAttendPK that = (EventsToAttendPK) o;

        if (!Objects.equals(activity, that.activity)) return false;
        return Objects.equals(participant, that.participant);
    }

    @Override
    public int hashCode() {
        int result = activity != null ? activity.hashCode() : 0;
        result = 31 * result + (participant != null ? participant.hashCode() : 0);
        return result;
    }
}