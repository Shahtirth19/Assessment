package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ImageView imageView;
    private RecyclerView recyclerView;
    private StaticRvAdapter staticRvAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        imageView = root.findViewById(R.id.bg);

        ArrayList<StaticRvModel> items = new ArrayList<>();
        items.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Tokyo","Mumbai"));
        items.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Chiba","Saitama"));
        items.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Osaka","Shizu Oka"));
        items.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"New York","Paris"));
        items.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Delhi","Los Angeles"));

        recyclerView = root.findViewById(R.id.rv_1);
        staticRvAdapter = new StaticRvAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRvAdapter);

        ArrayList<StaticRvModel> it = new ArrayList<>();
        it.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Music","Dance"));
        it.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Movie","Sport"));
        it.add(new StaticRvModel(R.drawable.ic_action_name,R.drawable.ic_action_name,"Dance","Games"));

        recyclerView = root.findViewById(R.id.rv_2);
        staticRvAdapter = new StaticRvAdapter(it);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRvAdapter);

        Glide.with(getActivity()).load("https://jw-webmagazine.com/wp-content/uploads/2019/06/jw-5d15d85019b651.95425187.jpeg").into(imageView);
        return root;
    }
}