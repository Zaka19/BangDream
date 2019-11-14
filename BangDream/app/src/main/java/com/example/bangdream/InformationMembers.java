package com.example.bangdream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Element;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class InformationMembers extends AppCompatActivity {
    private ArrayList<cMember> ListMembers = new ArrayList<cMember>();
    private RequestQueue Members;
    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_members);

        tvName = (TextView) findViewById(R.id.tvName);
        Members = Volley.newRequestQueue(this);

         JsonParse();
    }

    public void JsonParse(){
        String URL = "https://bandori.party/api/members/";

        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("results");

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject member = jsonArray.getJSONObject(i);
                                String name = member.getString("name");

                            }
                            wait();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        Members.add(request);
    }

}
