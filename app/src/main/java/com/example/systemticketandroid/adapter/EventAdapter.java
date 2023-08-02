package com.example.systemticketandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.systemticketandroid.MainActivity;
import com.example.systemticketandroid.R;
import com.example.systemticketandroid.model.EventDTO;
import com.example.systemticketandroid.viewHolder.EventViewHolder;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventViewHolder> {

    List<EventDTO> eventDTOS;
    Context context;

    public EventAdapter(List<EventDTO> eventDTOS, MainActivity activity) {
        this.eventDTOS = eventDTOS;
        this.context = activity;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.events_list, parent,false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        final EventDTO eventDTO = this.eventDTOS.get(position);

        holder.getTextViewName().setText(eventDTO.getEventName());
        holder.getTextViewDescription().setText(eventDTO.getDescription());
        holder.getTextViewDate().setText(eventDTO.getDate().toString());
        holder.getEventImage().setImageResource(eventDTO.getEventImage());

    }

    @Override
    public int getItemCount() {
        return eventDTOS.size();
    }


}
