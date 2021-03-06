package com.atguigu.beijingnews_0224.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.atguigu.beijingnews_0224.R;
import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoView;


public class PicassoSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_sample);

//        PhotoView photoView = (PhotoView) findViewById(R.id.iv_photo);
//        String url = getIntent().getStringExtra("url");
//
//
//        final PhotoViewAttacher attacher = new PhotoViewAttacher(photoView);
//
//        Picasso.with(this)
//                .load(url)
//                .into(photoView, new Callback() {
//                    @Override
//                    public void onSuccess() {
//                        attacher.update();
//                    }
//
//                    @Override
//                    public void onError() {
//
//                    }
//                });

        Uri uri = getIntent().getData();

        final PhotoView photoView = (PhotoView) findViewById(R.id.iv_photo);

        Picasso.with(this)
                .load(uri)
                .into(photoView);
    }
}
