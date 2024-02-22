package com.example.reelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reelapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<Model> arrayList=new ArrayList<>();
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.a, R.drawable.user, "Shailly"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.b, R.drawable.user, "Shailly"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.c, R.drawable.user, "Shailly"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.d, R.drawable.user, "Shailly"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.e, R.drawable.user, "Shailly"));

        adapter=new Adapter(MainActivity.this, arrayList);
        binding.vpg2.setAdapter(adapter);
    }
}