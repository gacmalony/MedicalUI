package com.example.medicalappui;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.medicalappui.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    //Second Recycle
    private RecyclerView recyclerView2;
    private MyAdapterDoctors adapter2;
    private StaggeredGridLayoutManager manager2;
    private ArrayList<row2> data2;

    //Second Recycle
    int[] covers = new int[]{
            R.drawable.dr1,
            R.drawable.dr2,
            R.drawable.dr3,
            R.drawable.dr4,
            R.drawable.dr5,
            R.drawable.dr6
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Second Recycle
        recyclerView2 = findViewById(R.id.recyclerView2);
        data2 = new ArrayList<>();
        adapter2 = new MyAdapterDoctors(this, data2);
        manager2 = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);


        //Setting
        recyclerView2.setLayoutManager(manager2);
        recyclerView2.setAdapter(adapter2);

        //Guess? Yes Initialize :)
        InitializeDataIntoRecycle();


    }

    private void InitializeDataIntoRecycle() {
        int count = 0;
        for(int i:covers){
            row2 a = new row2(covers[count]);
            ++count;
            data2.add(a);
        }
        adapter2.notifyDataSetChanged();
    }
}