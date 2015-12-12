package com.example.bulbulhossen.loginpage;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by rufflez on 7/8/14.
 */
public class SampleApplication extends Application {

    public void onCreate(){
        Parse.initialize(this, "HloReNgHsJCLGTV6dkRB0YVsS56m0NXvQCUsZswZ", "EqbrHG27T5xm6KnfbEtpMiea1ny4g1NCjjvfaRYi");
    }
}
