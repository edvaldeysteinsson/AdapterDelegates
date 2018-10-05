package com.hannesdorfmann.adapterdelegates4.sample.adapterdelegates;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.adapterdelegates4.AbsFallbackAdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.sample.R;
import com.hannesdorfmann.adapterdelegates4.sample.model.DisplayableItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Hannes Dorfmann
 */
public class ReptilesFallbackDelegate extends AbsFallbackAdapterDelegate<List<DisplayableItem>> {

    private LayoutInflater inflater;

    public ReptilesFallbackDelegate(Activity activity) {
        inflater = activity.getLayoutInflater();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_unknown_reptile, parent, false);
        return new ReptileFallbackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List<DisplayableItem> items, int position,
                                 @NonNull RecyclerView.ViewHolder holder, @Nullable List<Object> payloads) {

    }

    class ReptileFallbackViewHolder extends RecyclerView.ViewHolder {
        public ReptileFallbackViewHolder(View itemView) {
            super(itemView);
        }
    }
}
