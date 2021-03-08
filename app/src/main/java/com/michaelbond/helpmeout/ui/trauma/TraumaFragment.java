package com.michaelbond.helpmeout.ui.trauma;

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

public class TraumaFragment extends Fragment {

    private TraumaViewModel traumaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_trauma,container,false);

        Button buttonCallOpenArms = v.findViewById(R.id.traumaButtonOne);
        Button buttonCallMens = v.findViewById(R.id.traumaButtonTwo);

        Button buttonCallRespect = v.findViewById(R.id.traumaButtonThree);
        Button buttonCallBlueKnot = v.findViewById(R.id.traumaButtonFour);
        Button buttonCallSAMSN = v.findViewById(R.id.traumaButtonFive);

        Button buttonCallMenRS = v.findViewById(R.id.traumaButtonSix);
        Button buttonCall000 = v.findViewById(R.id.traumaEmergency);


        // Call function when user clicks button - Open Arms
        buttonCallOpenArms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800011046"));
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


        // Call function when user clicks button - BlueKnot Foundation
        buttonCallBlueKnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300657380"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - SAMSN
        buttonCallSAMSN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0283553711"));
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

        // Call function when user clicks button - Mens Referral Service
        buttonCallMenRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300766491"));
                startActivity(intent);
            }
        });


        traumaViewModel =
                new ViewModelProvider(this).get(TraumaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trauma, container, false);

        traumaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return v;


    }
}