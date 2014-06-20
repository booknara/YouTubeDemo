package com.booknara.youtubedemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.keyes.youtube.OpenYouTubePlayerActivity;

public class MainActivity extends Activity {

	// Need to change videoId
	String videoId = "y_7yoEUrVhw";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        Button demoVideoButton = (Button) findViewById(R.id.demo_video_button);
        demoVideoButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                Intent lVideoIntent = new Intent(null, Uri.parse("ytv://" + videoId), MainActivity.this, OpenYouTubePlayerActivity.class);
                startActivity(lVideoIntent);
				
			}
		});
	}
}
