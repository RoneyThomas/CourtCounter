package me.roney.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;

import com.google.android.material.elevation.SurfaceColors;

import me.roney.courtcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make statusbar have same color as actionbar
        getWindow().setStatusBarColor(SurfaceColors.SURFACE_2.getColor(this));
        setContentView(R.layout.activity_main);
        ScoreViewModel mViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setScoreViewModel(mViewModel);
        binding.setLifecycleOwner(this);
    }
}