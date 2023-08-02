package com.example.systemticketandroid;

import com.example.systemticketandroid.model.EventDTO;

import java.util.Arrays;
import java.util.List;

public class EventRepo {
    private List<EventDTO> eventDTOList;

    public EventRepo() {
        EventDTO[] eventDTOS = new EventDTO[]{
                new EventDTO("EventTypeName1", "loation1","Untold", "11/09/2024 - 16/09/2024","Muzica electronica si nu numai", R.drawable.untold, 500.0),
                new EventDTO("EventTypeName2", "loation2","Electric Castle", "12/09/2024 - 16/09/2024", "Muzica electronica si nu numai", R.drawable.electric, 350.0),
                new EventDTO("EventTypeName3", "loation3","Football Game", "18/09/2024 - 16/09/2024", "Fotbal", R.drawable.game, 1232.0),
                new EventDTO("EventTypeName4", "loation4","Wine Festival", "15/09/2024 - 16/09/2024", "Festival de vin", R.drawable.wine, 123.0),
        };

        this.eventDTOList = Arrays.asList(eventDTOS);
    }

    public List<EventDTO> getEventDTOList() {
        return eventDTOList;
    }

    public void setEventDTOList(List<EventDTO> eventDTOList) {
        this.eventDTOList = eventDTOList;
    }
}
