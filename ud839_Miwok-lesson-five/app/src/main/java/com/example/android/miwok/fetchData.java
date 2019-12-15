package com.example.android.miwok;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void, Void, Void> {
    String data ="";
    String dataParsed ="";
    String singleParsed = "";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://restcountries.eu/rest/v2/name/indonesia");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONArray JA = new JSONArray(data);
            for (int i = 0 ;i <JA.length(); i++){
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed = "Name: " + JO.get("name") + "\n"+
                        "Capital: " + JO.get("capital")+ "\n"+
                        "Alpha 2 Code: " + JO.get("alpha2Code")+ "\n"+
                        "Alpha 3 Code: " + JO.get("alpha3Code")+ "\n"+
                        "Region: " + JO.get("region") + "\n" +
                "Sub Region: " + JO.get("subregion") + "\n" +
                "Demonym: " + JO.get("demonym") + "\n" +
                        "Native Name: " + JO.get("nativeName") + "\n" +
                "Cioc: " + JO.get("cioc") + "\n";



                dataParsed = dataParsed + singleParsed;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        CobaActivity.data.setText(this.dataParsed);
    }

}

