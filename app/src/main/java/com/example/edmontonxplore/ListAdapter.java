package com.example.edmontonxplore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Places> {
    public ListAdapter(Context context, ArrayList<Places> placesArrayList){
        super(context,R.layout.list_item,placesArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
// itho sara dta jaanda a list da vich show krn lai whatsapp aang
        Places place = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        ImageView imageview = convertView.findViewById(R.id.place_picF);
        TextView title = convertView.findViewById(R.id.title);
        TextView description = convertView.findViewById(R.id.description);

        imageview.setImageResource(place.imageId);
        title.setText(place.title);
        description.setText(place.description);

        return convertView;
    }
}
