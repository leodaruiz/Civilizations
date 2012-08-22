package br.com.ldgames;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import br.com.ldgames.custom.CardView;
import br.com.ldgames.entities.Card;
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

		List<CardView> cartas = new ArrayList<CardView>();
		for (int i = 0; i < 7; i++) {
			Card c = new Card();
			c.setName("carta " + i);
			CardView cardView = new CardView(thisContext, mesa, c);
			cartas.add(cardView);
			//carta.moveTo(10, 2);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
