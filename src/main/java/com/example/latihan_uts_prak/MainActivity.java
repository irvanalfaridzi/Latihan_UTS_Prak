package com.example.latihan_uts_prak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_menu;
    ArrayList<menu> list_menu = new ArrayList<>();
    menu_adapter  mn_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_menu =findViewById(R.id.rv_menu);
        mn_adapter = new menu_adapter(MainActivity.this, list_menu);
        prepareData();

        RecyclerView.LayoutManager mLayoutManager =new LinearLayoutManager(MainActivity.this);
        rv_menu.setLayoutManager(mLayoutManager);
        rv_menu.setAdapter(mn_adapter);
        mn_adapter.notifyDataSetChanged();
    }

    private void prepareData() {
    menu mn = new menu();
    mn.setKode("1100");
    mn.setNama("Ayam Penyet");
    mn.setGambar(R.drawable.penyet);
    mn.setHarga(12000);
    list_menu.add(mn);

        mn = new menu();
        mn.setKode("1200");
        mn.setNama("Lele Penyet");
        mn.setGambar(R.drawable.lele);
        mn.setHarga(12000);
        list_menu.add(mn);

        mn = new menu();
        mn.setKode("1200");
        mn.setNama("Ayam Geprek");
        mn.setGambar(R.drawable.geprek);
        mn.setHarga(15000);
        list_menu.add(mn);

        mn = new menu();
        mn.setKode("1200");
        mn.setNama("Es Teh");
        mn.setGambar(R.drawable.esteh);
        mn.setHarga(5000);
        list_menu.add(mn);

        mn = new menu();
        mn.setKode("1200");
        mn.setNama("Es Jeruk");
        mn.setGambar(R.drawable.jeruk);
        mn.setHarga(7000);
        list_menu.add(mn);

        mn = new menu();
        mn.setKode("1200");
        mn.setNama("Es Cao Seger");
        mn.setGambar(R.drawable.cao);
        mn.setHarga(10000);
        list_menu.add(mn);
    }
}
