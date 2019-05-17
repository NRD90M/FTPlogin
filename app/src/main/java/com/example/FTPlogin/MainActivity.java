package com.example.FTPlogin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * Created by slatejack 2019/5/5
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        /**
         * 一定 一定 一定记得加这句，而且是固定位置，在setContentView()之下
         * 否则无论写的什么逻辑  都不会在Activity中起作用
         */
        ButterKnife.bind( this );

    }


    @BindView(R.id.bt_main_logout)
    Button mBtMainLogout;


    @OnClick({
            R.id.bt_main_logout,
            R.id.web,

    })
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_main_logout:
                Intent intent = new Intent( this, loginActivity.class );
                startActivity( intent );
                finish();
                break;
            case R.id.web: {
                Intent intentweb = new Intent();
                intentweb.setAction( "android.intent.action.VIEW" );
                Uri content_url = Uri.parse( "http://www.baidu.com" );
                intentweb.setData( content_url );
                startActivity( intentweb );
                break;
            }


        }


    }

    }

