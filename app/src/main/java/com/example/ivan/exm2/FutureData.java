package com.example.ivan.exm2;

import android.content.Context;

import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FutureData extends ListFragment {
    private static Exm2 exm2;
    Future future;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        exm2=Controller.getApi();
        exm2.getFuture().enqueue(new Callback<List<Future>>() {
            @Override
            public void onResponse(Call<List<Future>> call, Response<List<Future>> response) {
                future= (Future) response.body();
                ListAdapter adapter=new ArrayAdapter<String[]>(getActivity(),android.R.layout.simple_list_item_1, (List<String[]>) future);
                setListAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Future>> call, Throwable t) {

            }
        });




    }}
