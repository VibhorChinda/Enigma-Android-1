package com.example.enigma.Fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enigma.Adapters.RulesAdapter;
import com.example.enigma.Models.Rules;
import com.example.enigma.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;


public class RulesFragment extends Fragment {

    private MaterialButton play;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Rules> rulesList = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;

    public RulesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        initializeViews(rootView);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        prepareRulesData();
        return rootView;
    }

    private void initializeViews(View rootView) {
        play = (rootView).findViewById(R.id.fragment_rules_material_button_play);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new RulesAdapter(rulesList);
        recyclerView = rootView.findViewById(R.id.recyclerView_rules);
    }

    private void prepareRulesData() {
        Rules rule = new Rules("For every correct answer without using hints,you will get x points ");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
        rule = new Rules("For every correct answer without using hints,you will get x points");
        rulesList.add(rule);
    }
}