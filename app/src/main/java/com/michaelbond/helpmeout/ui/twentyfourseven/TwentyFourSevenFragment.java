package com.michaelbond.helpmeout.ui.twentyfourseven;

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

public class TwentyFourSevenFragment extends Fragment {

    private TwentyFourSevenViewModel twentyFourSevenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_twentyfour,container,false);


        Button buttonCallKidsHelpline = v.findViewById(R.id.twentyfourButtonOne);
        Button buttonCallRespect = v.findViewById(R.id.twentyfourButtonTwo);

        Button buttonCallMens = v.findViewById(R.id.twentyfourButtonThree);
        Button buttonCallLifeLine = v.findViewById(R.id.twentyfourButtonFour);
        Button buttonCallSuicideCBS = v.findViewById(R.id.twentyfourButtonFive);

        Button buttonCallBeyondBlue = v.findViewById(R.id.twentyfourButtonSix);
        Button buttonCall000 = v.findViewById(R.id.twentyfourEmergency);


        // Call function when user clicks button - Kids Helpline
        buttonCallKidsHelpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800551800"));
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


        // Call function when user clicks button - 1800 Respect
        buttonCallRespect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800737732"));
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


            twentyFourSevenViewModel =
                    new ViewModelProvider(this).get(TwentyFourSevenViewModel.class);
            View root = inflater.inflate(R.layout.fragment_twentyfour, container, false);

            twentyFourSevenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                @Override
                public void onChanged(@Nullable String s) {
                }
            });
            return v;


    }
    }

