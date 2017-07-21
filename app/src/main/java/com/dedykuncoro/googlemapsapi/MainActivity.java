package com.dedykuncoro.googlemapsapi;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap gMap;
    MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

        // Menambah marker di Alun-alun Demak - Jateng, Indonesia, dan menggerakan kamera.
        LatLng demak = new LatLng(-6.894796, 110.638413);
        gMap.addMarker(new MarkerOptions().position(demak).title("www.dedykuncoro.com"));
        gMap.moveCamera(CameraUpdateFactory.newLatLng(demak));
    }

}