package com.msaggik.homeworke;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class eatAdapter extends RecyclerView.Adapter<eatAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Eat> eats;

    public eatAdapter(Context context, List<Eat> eats){
        this.inflater = LayoutInflater.from(context);
        this.eats = eats;
    }


    @Override
    public eatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Eat eat = eats.get(position);
    holder.eatView.setImageResource(eat.getEatResource());
    holder.nameView.setText(eat.getName());
    holder.eatDescriptionView.setText(eat.getEatResource());
    holder.ingredientsView.setText(eat.getIngredients());
    }

    @Override
    public int getItemCount() {
        return eats.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView eatView;
        final TextView nameView, eatDescriptionView, ingredientsView;

        ViewHolder(View view){
            super(view);
            eatView = view.findViewById(R.id.eatResource);
            nameView = view.findViewById(R.id.name);
            eatDescriptionView = view.findViewById(R.id.eatDescription);
            ingredientsView = view.findViewById(R.id.ingredients);
        }
    }
}
