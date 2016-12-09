package com.example.rauno.test_application_polva_tallinn;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.facebook.FacebookSdk;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        PolylineOptions polylineOptions = new PolylineOptions();

        // Otsisin internetist Põlva ja Tallinna koordinaadid kümnend süsteemis.
        LatLng polva = new LatLng(58.053611, 27.055556);
        LatLng tallinn = new LatLng(59.437222, 24.745);
        polylineOptions.add(polva);
        polylineOptions.add(tallinn);


        mMap.addMarker(new MarkerOptions().position(polva).title("Marker in Põlva"));
        mMap.addMarker(new MarkerOptions().position(tallinn).title("Marker in Tallinn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polva));
        mMap.addPolyline(polylineOptions);

    }
}
