package com.example.android.diamondcell;

import android.net.Uri;
import android.os.Bundle;


import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener,
        DashboardFragment.OnFragmentInteractionListener,
        MenuDataMasterFragment.OnFragmentInteractionListener{

    private final String FRAGMENT_DASHBOARD_TAG = "DASHBOARD";
    private final String FRAGMENT_DATAMASTER_TAG = "DATAMASTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        DashboardFragment fragmentAwal = DashboardFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragmentAwal, FRAGMENT_DASHBOARD_TAG)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
    }

    @Override
    public void onBackPressed() {
        // Menambahkan fungsi untuk menutup navigation drawer dengan tombol back
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate dan menambahkan action bar
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //TODO: Perbaiki transisi fragment agar hanya mengambil fragment yang ada di back stack jika ada
        if (id == R.id.nav_home) {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(FRAGMENT_DASHBOARD_TAG);
            if(fragment != null) {
                transaction.replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            }
        } else if (id == R.id.nav_data_master) {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(FRAGMENT_DATAMASTER_TAG);
            if (fragment != null) {
                transaction.replace(R.id.fragment_container, fragment);
            } else {
                MenuDataMasterFragment fragmentDataMaster = MenuDataMasterFragment.newInstance("", "");
                transaction.replace(R.id.fragment_container, fragmentDataMaster, FRAGMENT_DATAMASTER_TAG);
            }
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (id == R.id.nav_pembelian) {
            //TODO:Pindah ke fragment pembelian
        } else if (id == R.id.nav_penjualan) {
            //TODO:Pindah ke fragment penjualan
        } else if (id == R.id.nav_transaksi_lain) {
            //TODO:Pindah ke fragment transaksi lain
        } else if (id == R.id.nav_utility) {
            //TODO:Pidnah ke fragment utility
        } else {
            //TODO:Pindah ke activity login
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onDataMasterFragmentInteraction(Uri uri) {
        //TODO:Implement Fragment interaction
    }

    @Override
    public void onDashboardFragmentInteraction(Uri uri) {
        //TODO:Implement Fragment interaction
    }
}
