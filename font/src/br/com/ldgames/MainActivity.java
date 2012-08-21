package br.com.ldgames;

import br.com.ldgames.custom.CardView;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout mesa = (LinearLayout) findViewById(R.id_main.mesa);
		Context thisContext = getApplicationContext();

		CardView carta = new CardView(thisContext, mesa);
		CardView carta2 = new CardView(thisContext, mesa);
		carta2.moveTo(10, 2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
