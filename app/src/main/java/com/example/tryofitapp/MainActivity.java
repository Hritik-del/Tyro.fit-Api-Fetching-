package com.example.tryofitapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Notification;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ms_square.etsyblur.BlurSupport;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    GridView grid;
    ImageView filterimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.grid);
        filterimage = findViewById(R.id.filterimage);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        BlurSupport.addTo(drawerLayout);

        filterimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });
        listinData();
    }

    private void listinData() {

        ApiInterface apiInterface = Retrofit.getRetrofit().create(ApiInterface.class);
        Call<Pojo> listindata = apiInterface.getData();
        listindata.enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                if(response.isSuccessful())
                {
                    GridAdapter adapter = new GridAdapter(response.body().getData());
                    grid.setAdapter(adapter);
                    Toast.makeText(getApplicationContext(), "Response Successful", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Some error occured", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Failure"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    class GridAdapter extends BaseAdapter{
        List<Pojo.Datum> list;
        public GridAdapter(List<Pojo.Datum> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
           Log.v("size Hritik", Integer.toString(list.size()));
            return list.size();

        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.gridlayout, viewGroup, false);
            TextView name = v.findViewById(R.id.name);
            TextView trainer = v.findViewById(R.id.trainer);
            TextView level = v.findViewById(R.id.level);
            ImageView image = v.findViewById(R.id.image);

            //doing as this because the image is not usable in api.
            if(i == 0 || i == 2)
            {
                image.setImageResource(R.drawable.manyoga1);
            }
            name.setText(list.get(i).getName());
            trainer.setText(list.get(i).getTrainerName());
            level.setText(list.get(i).getDifficultyLevelName());

            /*name.setText(list.get(i).getFirstName());
            trainer.setText(list.get(i).getLastName());
            level.setText(list.get(i).getEmail());*/
            return v;
        }
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }
        else
        {
            super.onBackPressed();
        }

    }
}