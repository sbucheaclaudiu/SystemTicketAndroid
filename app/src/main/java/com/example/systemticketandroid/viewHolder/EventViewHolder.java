package com.example.systemticketandroid.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.systemticketandroid.R;

public class EventViewHolder extends RecyclerView.ViewHolder{
    private ImageView eventImage;
    private TextView textViewName;
    private TextView textViewDescription;
    private TextView textViewDate;

    public EventViewHolder(@NonNull View itemView) {
        super(itemView);
        eventImage = itemView.findViewById(R.id.imageview);
        textViewName = itemView.findViewById(R.id.eventNameTextView);
        textViewDescription = itemView.findViewById(R.id.descriptionTextView);
        textViewDate = itemView.findViewById(R.id.dateTextView);

    }

    public ImageView getEventImage() {
        return eventImage;
    }

    public void setEventImage(ImageView eventImage) {
        this.eventImage = eventImage;
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public TextView getTextViewDescription() {
        return textViewDescription;
    }

    public void setTextViewDescription(TextView textViewDescription) {
        this.textViewDescription = textViewDescription;
    }

    public TextView getTextViewDate() {
        return textViewDate;
    }

    public void setTextViewDate(TextView textViewDate) {
        this.textViewDate = textViewDate;
    }
}
