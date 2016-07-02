package com.example.dialogdemo;


import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.dialogdemo.MyProgressDialog;

public class MainActivity extends Activity {

    private Button btn;

    private MyProgressDialog m_pDialog;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
    btn = (Button) findViewById(R.id.btn_main);
    btn.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int m_count = 0;
            m_pDialog = new MyProgressDialog(MainActivity.this);
//            m_pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            m_pDialog.setMessage("正在处理中...");

            m_pDialog.setCancelable(true);

            m_pDialog.show();
        }
    });
	}
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (m_pDialog!=null){
            m_pDialog.dismiss();
        }
        return super.onKeyDown(keyCode, event);
    }
}