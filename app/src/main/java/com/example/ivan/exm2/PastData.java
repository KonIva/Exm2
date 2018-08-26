package com.example.ivan.exm2;

import android.content.Context;

import android.os.Bundle;


import android.support.annotation.Nullable;

import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PastData extends ListFragment {
    private static Exm2 exm2;
    Past past;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        exm2=Controller.getApi();
        exm2.getPast().enqueue(new Callback<List<Past>>() {
            @Override
            public void onResponse(Call<List<Past>> call, Response<List<Past>> response) {
                past=  (Past)response.body();
                ListAdapter adapter = new ArrayAdapter<String[]>(getActivity(),android.R.layout.simple_list_item_1,(List<String[]>)  past );
                setListAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Past>> call, Throwable t) {

            }
        });




    }
}
