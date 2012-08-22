package br.com.ldgames.custom;

import br.com.ldgames.R;
import br.com.ldgames.entities.Card;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CardView {

	private Card carta;
	private LinearLayout cartaLayout;
	private float fontRatio = 0.8f;
	private float bgRatio = 0.8f;

	public void moveTo(int x, int y) {
		cartaLayout.setPadding(cartaLayout.getLeft() + x, cartaLayout.getTop()
				+ y, 0, 0);
	}

	public CardView(Context context, ViewGroup mesa, Card carta) {
		// setOnTouchListener(this);
		this.carta = carta;

		cartaLayout = new LinearLayout(context);
		cartaLayout.setLayoutParams(new LayoutParams((int) (150 * bgRatio),
				(int) (100 * bgRatio)));
		cartaLayout.setOrientation(LinearLayout.VERTICAL);
		//cartaLayout.setBackgroundResource(R.drawable.border);
		cartaLayout.setBackgroundColor(Color.LTGRAY);

		LinearLayout fundoSuperior = preparaFundoSuperior(context);

		LinearLayout fundoInferior = preparaFundoInferior(context);

		cartaLayout.addView(fundoSuperior);
		// carta.addView(imagem);
		cartaLayout.addView(fundoInferior);

		mesa.addView(cartaLayout, 0);

	}

	private LinearLayout preparaFundoInferior(Context context) {
		LinearLayout fundoInferior = new LinearLayout(context);
		fundoInferior.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		fundoInferior.setOrientation(LinearLayout.HORIZONTAL);

		TextView ataque = new TextView(context);
		ataque.setText("2");
		ataque.setTextSize(9 * fontRatio);
		ataque.setGravity(android.R.attr.right);
		fundoInferior.addView(ataque);

		TextView defesa = new TextView(context);
		defesa.setText("/1");
		defesa.setTextSize(9 * fontRatio);
		fundoInferior.addView(defesa);
		return fundoInferior;
	}

	private LinearLayout preparaFundoSuperior(Context context) {
		LinearLayout fundoSuperior = new LinearLayout(context);
		fundoSuperior.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		fundoSuperior.setOrientation(LinearLayout.HORIZONTAL);
		fundoSuperior.setBackgroundColor(Color.BLACK);
		
		TextView titulo = new TextView(context);
		titulo.setText(carta.getName());
		titulo.setTextSize(10 * fontRatio);
		titulo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT));
		fundoSuperior.addView(titulo);

		TextView custo = new TextView(context);
		custo.setText("10");
		custo.setTextSize(9 * fontRatio);
		custo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT));
		fundoSuperior.addView(custo);
		
		return fundoSuperior;
	}
}
