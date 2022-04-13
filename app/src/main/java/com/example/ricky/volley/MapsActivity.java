package com.example.ricky.volley;

/**
 * Created by Ricky on 11/29/2017.
 */
import android.Manifest;
import android.app.Activity;
import android.app.TabActivity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng SPBUPertaminaCocoFatmawati = new LatLng(-6.2721464, 106.7972866);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaCocoFatmawati).title("SPBU Pertamina Coco Fatmawati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaCocoFatmawati));

        mMap = googleMap;
        LatLng SPBUPertaminaPondokPinang = new LatLng(-6.2784567, 106.7727643);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaPondokPinang).title("SPBU Pertamina Pondok Pinang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaPondokPinang));

        mMap = googleMap;
        LatLng SPBUPertaminaPetukangan = new LatLng(-6.2370009, 106.752992);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaPetukangan).title("SPBU Pertamina Petukangan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaPetukangan));

        mMap = googleMap;
        LatLng SPBUPertaminaPasarRebo = new LatLng(-6.3092575, 106.8698341);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaPasarRebo).title("SPBU Pertamina Pasar Rebo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaPasarRebo));

        mMap = googleMap;
        LatLng SPBUPertaminaKpRambutan = new LatLng(-6.3074886, 106.8779062);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaKpRambutan).title("SPBU Pertamina Kp. Rambutan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaKpRambutan));

        mMap = googleMap;
        LatLng SPBUPertaminaKreo = new LatLng(-6.2363806, 106.7427312);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaKreo).title("SPBU Pertamina Kreo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaKreo));

        mMap = googleMap;
        LatLng SPBUPertaminaSaidi = new LatLng(-6.2409357, 106.756032);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaSaidi).title("SPBU Pertamina Saidi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaSaidi));

        mMap = googleMap;
        LatLng SPBUPertaminaDarmaBakti = new LatLng(-6.234247, 106.753922);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaDarmaBakti).title("SPBU Pertamina Darma Bakti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaDarmaBakti));

        mMap = googleMap;
        LatLng SPBUPertaminaTanahKusir = new LatLng(-6.2533289, 106.773186);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaTanahKusir).title("SPBU Pertamina Tanah Kusir"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaTanahKusir));

        mMap = googleMap;
        LatLng SPBUShellWarungBuncit = new LatLng(-6.2838542, 106.8266143);
        mMap.addMarker(new MarkerOptions().position(SPBUShellWarungBuncit).title("SPBU Shell Warung Buncit"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUShellWarungBuncit));

        mMap = googleMap;
        LatLng SPBUPertaminaTermSimatupang= new LatLng(-6.302603, 106.853001);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaTermSimatupang).title("SPBU Pertamina Term Simatupang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaTermSimatupang));

        mMap = googleMap;
        LatLng SPBUShellPasarMinggu = new LatLng(-6.2641528, 106.8429852);
        mMap.addMarker(new MarkerOptions().position(SPBUShellPasarMinggu).title("SPBU Shell Pasar Minggu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUShellPasarMinggu));

        mMap = googleMap;
        LatLng SPBUTotalPasarMinggu = new LatLng(-6.251358, 106.843052);
        mMap.addMarker(new MarkerOptions().position(SPBUTotalPasarMinggu).title("SPBU Total Pasar Minggu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUTotalPasarMinggu));

        mMap = googleMap;
        LatLng SPBUShellMtHaryono = new LatLng(-6.240796, 106.855538);
        mMap.addMarker(new MarkerOptions().position(SPBUShellMtHaryono).title("SPBU Shell Mt Haryono"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUShellMtHaryono));

        mMap = googleMap;
        LatLng SPBUShellGatotSubroto = new LatLng(-6.2408004, 106.837149);
        mMap.addMarker(new MarkerOptions().position(SPBUShellGatotSubroto).title("SPBU Shell Gatot Subroto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUShellGatotSubroto));

        mMap = googleMap;
        LatLng SPBUPertaminaPancoran = new LatLng(-6.244921, 106.842419);
        mMap.addMarker(new MarkerOptions().position(SPBUPertaminaPancoran).title("SPBU Pertamina Pancoran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUPertaminaPancoran));

        mMap = googleMap;
        LatLng SPBUShellCiputat = new LatLng(-6.250840, 106.778467);
        mMap.addMarker(new MarkerOptions().position(SPBUShellCiputat).title("SPBU Shell Ciputat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUShellCiputat));


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {

            return;
        }
        LatLng titeng = new LatLng(-6.251877, 106.800433);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(titeng, 12));
        mMap.setMyLocationEnabled(true);
    }

}
