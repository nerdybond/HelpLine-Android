package com.michaelbond.helpmeout.ui.crisis;

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


public class CrisisFragment extends Fragment {

    private CrisisViewModel crisisViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_crisis,container,false);

        Button buttonCallAHSSS = v.findViewById(R.id.crisisButtonOne);
        Button buttonCallSANE = v.findViewById(R.id.crisisButtonTwo);

        Button buttonCallMens = v.findViewById(R.id.crisisButtonThree);
        Button buttonCallLifeLine = v.findViewById(R.id.crisisButtonFour);
        Button buttonCallSuicideCBS = v.findViewById(R.id.crisisButtonFive);

        Button buttonCallBeyondBlue = v.findViewById(R.id.crisisButtonSix);
        Button buttonCall000 = v.findViewById(R.id.crisisEmergency);


        // Call function when user clicks button - All Hours Suicide Support Service
        buttonCallAHSSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800859585"));
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

        // Call function when user clicks button - MensLine
        buttonCallMens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300789978"));
                startActivity(intent);
            }
        });


        // Call function when user clicks button - LifeLine
        buttonCallLifeLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:131114"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - Suicide Callback Service
        buttonCallSuicideCBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300659467"));
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

        // Call function when user clicks button - Beyond Blue
        buttonCallBeyondBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300224636"));
                startActivity(intent);
            }
        });


        crisisViewModel =
                new ViewModelProvider(this).get(CrisisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_crisis, container, false);

        crisisViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return v;


    }
}