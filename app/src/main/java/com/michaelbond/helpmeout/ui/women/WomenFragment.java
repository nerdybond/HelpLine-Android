package com.michaelbond.helpmeout.ui.women;

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

public class WomenFragment extends Fragment {

    private WomenViewModel womenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_women,container,false);

        Button buttonCallMindSpot = v.findViewById(R.id.womenButtonOne);
        Button buttonCallQLife = v.findViewById(R.id.womenButtonTwo);
        Button buttonCallSANE = v.findViewById(R.id.womenButtonThree);


        Button buttonCallRelationships = v.findViewById(R.id.womenButtonFour);
        Button buttonCallPANDA = v.findViewById(R.id.womenButtonFive);
        Button buttonCallParentLife = v.findViewById(R.id.womenButtonSix);

        Button buttonCall000 = v.findViewById(R.id.womenEmergency);


        // Call function when user clicks button - MindSpot
        buttonCallMindSpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800614434"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - QLife
        buttonCallQLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800184527"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - SANE Australia
        buttonCallSANE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800187263"));
                startActivity(intent);
            }
        });


        // Call function when user clicks button - Relationships Australia
        buttonCallRelationships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300364277"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - PANDA
        buttonCallPANDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300726306"));
                startActivity(intent);
            }
        });


        // Call function when user clicks button - Parent Life
        buttonCallParentLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300 30 1300"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - Emergency (000)
        buttonCall000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:000"));
                startActivity(intent);
            }
        });


        womenViewModel =
                new ViewModelProvider(this).get(WomenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_women, container, false);

        womenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return v;


    }
}