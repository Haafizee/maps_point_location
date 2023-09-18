package com.perdatech.mapworldskill;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map,container,false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.my_map);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng myLocation = new LatLng(3.0497607001725457, 101.53518614159685);
                googleMap.addMarker(new MarkerOptions().position(myLocation).title("My Location"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 15));

                LatLng CiastShahAlam = new LatLng(3.053364879875352, 101.52506512925724);
                googleMap.addMarker(new MarkerOptions().position(CiastShahAlam).title("CIAST ShahAlam"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CiastShahAlam, 15));

//                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
//                    @Override
//                    public void onMapClick(LatLng latLng) {
//                        MarkerOptions markerOptions = new MarkerOptions();
//                        markerOptions.position(latLng);
//                        markerOptions.title(latLng.latitude+" KG " + latLng.longitude);
//                        googleMap.clear();
//                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,200));
//                        googleMap.addMarker(markerOptions);
//                    }
//                });

            }
        });
        return view;
    }
}