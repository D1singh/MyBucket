package com.deepak.mybucket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.deepak.mybucket.networkconnection.BucketModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SettingActivity extends AppCompatActivity {
    Button button;

    private BottomSheetBehavior bottomSheetBehavior;

    LinearLayout linearLayout;
    TextView textViewLink, two, three, four, five, siz, seven, eight, nine, ten, eleven, twelve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();
        linkEvent();

        button.setOnClickListener(v -> {
            button.setText(R.string.description_about_app_close);
            if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

            } else {
                button.setText(R.string.description_about_app);
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

            }
        });

    }


    private void initView() {
        button = findViewById(R.id.bottom_description);
        linearLayout = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);
        textViewLink = findViewById(R.id.textViewLink);
        two = findViewById(R.id.textViewLinktwo);
        three=findViewById(R.id.textViewLinkthree);
        four = findViewById(R.id.textViewLinkfour);
        five = findViewById(R.id.textViewLinkfive);
        siz = findViewById(R.id.textViewLinksix);
        seven = findViewById(R.id.textViewLinkseven);
        eight = findViewById(R.id.textViewLinkeight);
        nine = findViewById(R.id.textViewLinknine);
        ten = findViewById(R.id.textViewLinkten);
        eleven = findViewById(R.id.textViewLinkeleven);
        twelve = findViewById(R.id.textViewLinkeltwelve);
    }

    private void linkEvent() {
        textViewLink.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        two.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        three.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        four.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        five.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        siz.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        seven.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        eight.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        nine.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        ten.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        eleven.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
        twelve.setOnClickListener(v -> {
            Intent netIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/"));
            startActivity(netIntent);
        });
    }



}