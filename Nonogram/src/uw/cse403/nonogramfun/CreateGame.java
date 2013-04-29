package uw.cse403.nonogramfun;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class CreateGame extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_game_menu);
		Log.i("create a game", "on create");
	}
	
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}