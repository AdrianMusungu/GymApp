package com.example.android.gymapp.feature;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;


import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
//import com.google.maps.DirectionsApi;
//import com.google.maps.GeoApiContext;
//import com.google.maps.model.DirectionsResult;
//import com.google.maps.model.DirectionsRoute;
//import com.google.maps.model.TravelMode;

//import org.joda.time.DateTime;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    LocationManager locationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        //checks whether network provider is enabled
        if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //this gets the latitude
                    double latitude = location.getLatitude();
                    //gets longitude
                    double longitude = location.getLongitude();
                    //instantiate the class ->LatLng
                    LatLng latLng = new LatLng(latitude, longitude);
                    //instantiante Geocoder class, converts LatLng to meaningful address
                    Geocoder geocoder = new Geocoder(getApplicationContext());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(latitude, longitude, 1);
                        String str = addressList.get(0).getSubLocality() + ",";
                        str += addressList.get(0).getLocality();
                        //add marker to current location with position=latLng and title=str
                        mMap.addMarker(new MarkerOptions().position(latLng).title("You are here: " + str));
                        //moves camera automatically to the current location
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10.2f));

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                }

                @Override
                public void onProviderEnabled(String provider) {
                }

                @Override
                public void onProviderDisabled(String provider) {
                }
            });
        } else if (locationManager.isProviderEnabled(locationManager.GPS_PROVIDER)) {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //this gets the latitude
                    double latitude = location.getLatitude();
                    //gets longitude
                    double longitude = location.getLongitude();
                    //instantiate the class ->LatLng
                    LatLng latLng = new LatLng(latitude, longitude);
                    //instantiate Geocoder class, converts LatLng to meaningful address
                    Geocoder geocoder = new Geocoder(getApplicationContext());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(latitude, longitude, 1);
                        String str = addressList.get(0).getLocality() + ",";
                        str += addressList.get(0).getCountryName();
                        //add marker to current location with position=latLng and title=str
                        mMap.addMarker(new MarkerOptions().position(latLng).title(str));
                        //moves camera automatically to the current location
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10.5f));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                }

                @Override
                public void onProviderEnabled(String provider) {
                }

                @Override
                public void onProviderDisabled(String provider) {
                }
            });
        }
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
//        setupGoogleMapScreenSettings(googleMap);
//        DirectionsResult results = getDirectionsDetails("483 George St, Sydney NSW 2000, Australia", "182 Church St, Parramatta NSW 2150, Australia", TravelMode.DRIVING);
//        if (results != null) {
//            addPolyline(results, googleMap);
//            positionCamera(results.routes[overview], googleMap);
//            addMarkersToMap(results, googleMap);
//        }

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 10.5f));
        LatLng samto = new LatLng(-1.3145, 36.8166);
        mMap.addMarker(new MarkerOptions().position(samto).title("Samto Gym: 5.30AM-6.00PM"));
        LatLng azura = new LatLng(-6.7458, 39.2417);
        mMap.addMarker(new MarkerOptions().position(azura).title("Azura Gym: 5.30AM-9.00PM"));
        LatLng proflex = new LatLng(6.4392, 3.4372);
        mMap.addMarker(new MarkerOptions().position(proflex).title("Proflex Gym: 6.00AM-7.00PM"));
        LatLng srixzone = new LatLng(-1.3145, 36.8166);
        mMap.addMarker(new MarkerOptions().position(srixzone).title("Srixzone Gym: 4.00AM-7.00PM"));
    }
}