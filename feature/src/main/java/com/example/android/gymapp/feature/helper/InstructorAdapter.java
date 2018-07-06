package com.example.android.gymapp.feature.helper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.android.gymapp.feature.R;
import com.example.android.gymapp.feature.models.Instructors;

import java.util.List;

import static android.R.id.list;
//
//public class InstructorAdapter extends RecyclerView.Adapter<InstructorAdapter.ViewHolder>{

//    private List<Instructor> instructors;
//    private Context mCtx;
//
//    public InstructorAdapter(List<Instructor> instructors, Context mCtx) {
//        this.instructors = instructors;
//        this.mCtx = mCtx;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.list_instructors, parent, false);
//        return new ViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(InstructorAdapter.ViewHolder holder, int position) {
//        Instructor instructor = instructors.get(position);
//        holder.textViewName.setText(instructor.getName());
//        holder.textViewGender.setText(instructor.getGender());
//        holder.textViewEmail.setText(instructor.getEmail());
//        holder.textViewContacts.setText(instructor.getContacts());
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return instructors.size();
//    }
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//
//        public TextView textViewName;
//        public TextView textViewGender;
//        public TextView textViewEmail;
//        public TextView textViewContacts;
//
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
//            textViewGender = (TextView) itemView.findViewById(R.id.textViewGender);
//            textViewEmail = (TextView) itemView.findViewById(R.id.textViewEmail);
//            textViewContacts = (TextView) itemView.findViewById(R.id.textViewContacts);
//
//        }
//    }
//}
