package com.example.damitharanasinghe.unfriend_finder;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpGetRequest extends AsyncTask<String,String,String> {


    @Override
    protected String doInBackground(String... params) {
        String stringUrl = "http://ec2-52-72-156-17.compute-1.amazonaws.com:9090/unfriendfinder/";
        String result = null;
        System.out.println("hello");
        try {
            //Create a URL object holding our url
            URL myUrl = new URL(stringUrl);
            /* Create a connection */
            HttpURLConnection connection = (HttpURLConnection)
                    myUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(15000);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }

    @Override
    protected void onPostExecute(String s) {

    }
}
