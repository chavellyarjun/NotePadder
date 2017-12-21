package com.example.samsung.notepadder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.TimeZone;

public class NoteAdapter extends ArrayAdapter<Note> {
    public NoteAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Note> notes) {
        super(context, resource, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_notes, null);
        }
        Note note = getItem(position);
        if (note != null) {
            TextView title = (TextView) convertView.findViewById(R.id.notesTitle);
            TextView date = (TextView) convertView.findViewById(R.id.notesDate);
            TextView content = (TextView) convertView.findViewById(R.id.notesContent);
            title.setText(note.getmTitle());
            date.setText(note.getDateTimeFormatted(getContext()));
            if (note.getmContent().length() > 50) {
                content.setText(note.getmContent().substring(0, 50));
            } else {
                content.setText(note.getmContent());
            }
        }
        return convertView;
    }

}