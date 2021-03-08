package com.michaelbond.helpmeout.ui.depression;

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

public class DepressionFragment extends Fragment {

    private DepressionViewModel depressionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Each button will call a specific Helpline.
        // Declare each button
        View v = inflater.inflate(R.layout.fragment_depression,container,false);


        Button buttonCallMindSpot = v.findViewById(R.id.depressionButtonOne);
        Button buttonCallSANE = v.findViewById(R.id.depressionButtonTwo);
        Button buttonCallEHeadspace = v.findViewById(R.id.depressionButtonThree);

        Button buttonCallBeyondBlue = v.findViewById(R.id.depressionButtonFour);
        Button buttonCallMens = v.findViewById(R.id.depressionButtonFive);
        Button buttonCallKidsHelpline = v.findViewById(R.id.depressionButtonSix);

        Button buttonCall000 = v.findViewById(R.id.depressionEmergency);


        // Call function when user clicks button - MindSpot
        buttonCallMindSpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800614434"));
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

       // Call function when user clicks button - EHeadSpace
        buttonCallEHeadspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800650890"));
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

        // Call function when user clicks button - MensLine
        buttonCallMens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1300789978"));
                startActivity(intent);
            }
        });

        // Call function when user clicks button - KidsHelpline
        buttonCallKidsHelpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1800551800"));
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



        depressionViewModel =
                new ViewModelProvider(this).get(DepressionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_depression, container, false);

        depressionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return v;


    }
}