package com.example.android.gymapp.feature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.gymapp.feature.R;
import com.example.android.gymapp.feature.api.APIService;
import com.example.android.gymapp.feature.api.APIUrl;
//import com.example.android.gymapp.feature.helper.InstructorAdapter;
import com.example.android.gymapp.feature.models.Instructors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GymInstructorsActivity extends AppCompatActivity {

//    private RecyclerView recyclerViewInstructors;
//    private RecyclerView.Adapter adapter;
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_gym_instructors, container, false);
//    }
//
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        getActivity().setTitle("Home");
//
//        recyclerViewInstructors = (RecyclerView) view.findViewById(R.id.recyclerViewUsers);
//        recyclerViewInstructors.setHasFixedSize(true);
//        recyclerViewInstructors.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(APIUrl.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        APIService service = retrofit.create(APIService.class);
//
//
//        Call<Instructors> call = service.getAllInstructors();
//
//        call.enqueue(new Callback<Instructors>() {
//            @Override
//            public void onResponse(Call<Instructors> call, Response<Instructors> response) {
//                adapter = new InstructorAdapter(response.body().getAllInstructors(), getActivity());
//                recyclerViewInstructors.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<Instructors> call, Throwable t) {
//
//            }
//        });
//    }

}
