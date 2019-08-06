package com.vibrantcube.jomsave.commonActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vibrantcube.jomsave.R;
import com.vibrantcube.jomsave.fragment.DealsFragment;
import com.vibrantcube.jomsave.fragment.HomeFragment;
import com.vibrantcube.jomsave.fragment.ProfileFragment;
import com.vibrantcube.jomsave.fragment.VouchersFragment;
import com.vibrantcube.jomsave.fragment.WalletFragment;

public class HomeButtomNavigationActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_buttom_navigation);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar = getSupportActionBar();

        //load the store fragment by default
        // toolbar.setTitle("Home");

        BottomNavigationView bottomNavigationView =  findViewById(R.id.nav_view);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // define your fragments here
        final Fragment homeFragment = new HomeFragment();
        final Fragment dealsFragment = new DealsFragment();
        final Fragment walletFragment = new WalletFragment();
         final Fragment vouchersFragment = new VouchersFragment();
         final Fragment profileFragment = new ProfileFragment();

        // handle navigation selection
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment;
                        switch (item.getItemId()) {
                            case R.id.navigation_deals:
                                //toolbar.setTitle("Deals");
                                fragment = dealsFragment;
                                break;

                            case R.id.navigation_wallet:
                                fragment = walletFragment;
                                //toolbar.setTitle("Wallet");
                                break;
                            case R.id.navigation_voucher:
                                fragment = vouchersFragment;
                                //toolbar.setTitle("Profile");
                                break;

                           case R.id.navigation_profile:
                                fragment = profileFragment;
                                //toolbar.setTitle("Profile");
                                break;

                            case R.id.navigation_home:
                                //toolbar.setTitle("Home");
                            default:
                                fragment = homeFragment;
                                break;
                        }
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                    }
                });
        // Set default selection
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_deals:
                    mTextMessage.setText(R.string.title_deal);
                    return true;
                case R.id.navigation_wallet:
                    mTextMessage.setText(R.string.title_wallet);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;

            }
            return false;
        }
    };
}
