package com.example.app2_lasson;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main_App2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__app2);
		final Button firstButton = (Button) findViewById(R.id.btt);
		firstButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent startSecond = new Intent(v.getContext(), Second_activity_app2.class);
				startSecond.putExtra("key", firstButton.getText());
				startActivity(startSecond);
			}
		});
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main__app2, menu);
		return true;
	}

}
