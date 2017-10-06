package com.example.kadeem.recyclertest;

import android.net.Uri;

/**
 * Created by Reshaud Ally on 9/28/2017.
 */

//Utilities used for network requests

public final class NetworkUtils {

    //Create URI from string
    public static Uri createURI(String stringURI) {
        return Uri.parse(stringURI);
    }
}