package com.example.app2_lasson;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_activity_app2 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_activity_app2);
		
		getIntent().getStringArrayExtra("key");
		
		
		Button buut1 = (Button) findViewById(R.id.btt);
		buut1.setOnClickListener(this);

		Button buut2 = (Button) findViewById(R.id.btt2);
		buut2.setOnClickListener(this);
		buut2.setText("blaa bla");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second_activity_app2, menu);
		return true;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btt:
			v.setVisibility(View.GONE);
			break;

		case R.id.btt2:
			v.setVisibility(View.INVISIBLE);

			break;

		default:
			break;
		}
	}

}
