package com.michaelbond.helpmeout.ui.states;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.michaelbond.helpmeout.R;
import com.michaelbond.helpmeout.ui.home.HomeViewModel;

public class StatesFragment extends Fragment {

    private StatesViewModel statesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_states,container,false);

        Button buttonCallNSW = v.findViewById(R.id.statesButtonOne);
        Button buttonCallQLD = v.findViewById(R.id.statesButtonTwo);

        Button buttonCallVIC = v.findViewById(R.id.statesButtonThree);
        Button buttonCallSA = v.findViewById(R.id.statesButtonFour);

        Button buttonCallNT = v.findViewById(R.id.statesButtonFive);
        Button buttonCallWA = v.findViewById(R.id.statesButtonSix);

        Button buttonCallTAS = v.findViewById(R.id.statesButtonSeven);
        Button buttonCallNational = v.findViewById(R.id.statesButtonEight);


        // Call function when user clicks button - NSW Mental Health
        buttonCallNSW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800011511"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - QLD Mental Health
        buttonCallQLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800642255"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - VIC Mental Health
        buttonCallVIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800595212"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - SA Mental Health
        buttonCallSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:131465"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - NT Mental Health
        buttonCallNT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800682288"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - WA Mental Health
        buttonCallWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:130055788"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - TAS Mental Health
        buttonCallTAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800332388"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - National Mental Health
        buttonCallNational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300643287"));
                startActivity(intent);
            }
        });


        statesViewModel =
                new ViewModelProvider(this).get(StatesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_states, container, false);

        statesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return v;


    }
}