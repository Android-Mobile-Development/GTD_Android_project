package com.gtdtool.ui;

import com.gtdtool.control.MainControl;
import com.gtdtool.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	private MainControl mainControl = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Load settings
		this.mainControl = new MainControl();
		
		 // TODO: Judge whether is first time to launch this application
		 //     , if true launch introduction activity.
		if(true == mainControl.isFirstTimeLaunch){
		    mainControl.isFirstTimeLaunch = false;
			Intent intent;
		    intent = new Intent(this, IntroActivity.class);
		    startActivityForResult( intent, 0 );
		}
	    
	    // TODO: Load Main UI component
	    setButtonListener();
		
	}

	/**
	 * 
	 */
	private void setButtonListener() {
		ImageButton goEventsBtn = 
	    		(ImageButton) findViewById(R.id.main_GtdEvents_imageButton);
	    ImageButton goReviewBtn = 
	    		(ImageButton) findViewById(R.id.main_review_imageButton);

	    goEventsBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent eventsIntent;
				eventsIntent = new Intent(getApplicationContext(), GtdEventFolderListViewOnlyActivity.class);
			    startActivityForResult( eventsIntent, 1 );
			}
		});
	    goReviewBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent reviewIntent;
				reviewIntent = new Intent(getApplicationContext(), ReviewActivity.class);
				Bundle mBundle = new Bundle();
		        mBundle.putSerializable(MainControl.SER_KEY,mainControl);
		        reviewIntent.putExtras(mBundle);
		        
			    startActivityForResult( reviewIntent, 2 );
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(R.id.action_settings==item.getItemId()){
			Intent settingIntent;
			settingIntent = new Intent(getApplicationContext(), SettingsActivity.class);
		    startActivityForResult( settingIntent, 3 );
		}
		return super.onOptionsItemSelected(item);
	}

}
