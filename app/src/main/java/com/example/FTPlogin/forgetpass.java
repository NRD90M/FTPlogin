package com.example.FTPlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.FTPlogin.ui.forgetpass.ForgetpassFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class forgetpass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpass_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ForgetpassFragment.newInstance())
                    .commitNow();
        }
    }
    @BindView(R.id.back)
    Button back;
    @OnClick({
            R.id.back
    })
    public void OnClick(View view){
        switch (view.getId()) {
            case R.id.back:
                Intent intent3 = new Intent(this, loginActivity.class);
                startActivity(intent3);
                finish();

        }
    }
}
