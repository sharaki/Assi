package com.example.sharaki.assi;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.Arrays;

import cz.msebera.android.httpclient.Header;
import it.sephiroth.android.library.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;
        String url= "https://dl.dropboxusercontent.com/s/7rvknz9e6tfprun/facebookFeed.json";
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.d("goo", "onSuccess: "+ Arrays.toString(responseBody));
                String responseStr = new String(responseBody);
                Gson gson = new Gson();
                Post post = gson.fromJson(responseStr, Post.class);

                TextView tv_personName = (TextView) findViewById(R.id.tv_personName);
                TextView tv_description = (TextView) findViewById(R.id.tv_description);
                TextView tv_time = (TextView) findViewById(R.id.tv_time);
                tv_personName.setText(post.getUserName());
                tv_description.setText(post.getPostText());
                tv_time.setText(post.getPostTime());
                Log.d("ggg", "onSuccess: "+ post.getUserName());

                ImageView img_person = (ImageView) findViewById(R.id.img_person);
                ImageView img_post = (ImageView) findViewById(R.id.img_post);
                Picasso.with(context).load(post.getPostImage()).into(img_post);
                Picasso.with(context).load(post.getUserPic()).into(img_person);

                Button but_like = (Button) findViewById(R.id.but_like);
                Button but_comment = (Button) findViewById(R.id.but_comment);
                Button butt_share = (Button) findViewById(R.id.butt_share);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(MainActivity.this, "error loading data from the server", Toast.LENGTH_LONG).show();
            }
        });
    }
}
