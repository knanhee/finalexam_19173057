package com.example.movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item) {
        items.add(item);
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }

    public Movie getItem(int position) {
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView6;
        TextView textView7;
        TextView textView5;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView14;
        TextView textView15;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);
            textView7 = itemView.findViewById(R.id.textView7);
            textView8 = itemView.findViewById(R.id.textView8);
            textView9 = itemView.findViewById(R.id.textView9);
            textView10 = itemView.findViewById(R.id.textView10);
            textView14 = itemView.findViewById(R.id.textView14);
            textView15 = itemView.findViewById(R.id.textView15);

        }

        public void setItem(Movie item) {
            textView.setText(item.movieNm);
            textView2.setText("일일관객수 : " + item.audiCnt + "명" + "(" + item.audiChange + "%)");
            textView3.setText(item.openDt + " 개봉");
            textView5.setText(item.rankOldAndNew);
            textView6.setText(item.rank + "등" + "(" + item.rankInten + ")");
            textView7.setText("누적관객수 : " + item.audiAcc + "명");
            textView8.setText("스크린수 : " + item.scrnCnt);
            textView9.setText("상영횟수 : " + item.showCnt);
            textView10.setText("매출액점유율 : " + item.salesShare + "%");
            textView14.setText("일일매출액: " + item.salesAmt + "원" + "(" + item.salesChange + "%)");
            textView15.setText("누적매출액 : " + item.salesAcc + "원");
        }
    }

}
