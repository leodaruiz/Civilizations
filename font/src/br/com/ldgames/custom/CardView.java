package br.com.ldgames.custom;

import br.com.ldgames.R;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CardView {

	private LinearLayout carta;

	public void moveTo(int x, int y) {
		carta.setPadding(carta.getLeft() + x, carta.getTop() + y, 0, 0);
	}

	public CardView(Context context, ViewGroup mesa) {
		// setOnTouchListener(this);

		carta = new LinearLayout(context);
		carta.setLayoutParams(new LayoutParams(300, 200));
		carta.setOrientation(LinearLayout.VERTICAL);
		carta.setBackgroundResource(R.drawable.border);

		LinearLayout fundoSuperior = preparaFundoSuperior(context);

		LinearLayout fundoInferior = preparaFundoInferior(context);

		carta.addView(fundoSuperior);
		// carta.addView(imagem);
		carta.addView(fundoInferior);

		mesa.addView(carta, 0);

	}

	private LinearLayout preparaFundoInferior(Context context) {
		LinearLayout fundoInferior = new LinearLayout(context);
		fundoInferior.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		fundoInferior.setOrientation(LinearLayout.VERTICAL);

		TextView ataque = new TextView(context);
		ataque.setText("2");
		fundoInferior.addView(ataque);

		TextView defesa = new TextView(context);
		defesa.setText("1");
		fundoInferior.addView(defesa);
		return fundoInferior;
	}

	private LinearLayout preparaFundoSuperior(Context context) {
		LinearLayout fundoSuperior = new LinearLayout(context);
		fundoSuperior.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		fundoSuperior.setOrientation(LinearLayout.VERTICAL);
		fundoSuperior.setBackgroundColor(0);

		TextView titulo = new TextView(context);
		titulo.setText("Nome da carta");
		titulo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT));
		fundoSuperior.addView(titulo);

		TextView custo = new TextView(context);
		custo.setText("10");
		custo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT));
		fundoSuperior.addView(custo);
		return fundoSuperior;
	}
}
