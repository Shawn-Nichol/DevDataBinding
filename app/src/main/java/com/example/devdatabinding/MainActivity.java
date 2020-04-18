package com.example.devdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.devdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Binding class is generated for each layout by default.Name of the class is based on the layout file
        // converting and converting it to Pascal case.
        ActivityMainBinding binding;

        // The recommend method to create the bindings is to do it while inflating the layout.
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        User user = new User("Shawn", "Nichol");
        MyList list = new MyList();



        // TODO: include
        // TODO: Hide view with button click.
        binding.setUser(user);

        binding.exampleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: ");
    }
}
