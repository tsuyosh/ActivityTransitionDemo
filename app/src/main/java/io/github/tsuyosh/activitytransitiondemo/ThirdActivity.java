package io.github.tsuyosh.activitytransitiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
	}
}
