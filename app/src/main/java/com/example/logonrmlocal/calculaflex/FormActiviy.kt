package com.example.logonrmlocal.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_activiy.*

class FormActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_activiy)

        btCalculate.setOnClickListener {
            val proximaTela = Intent( this, ResultActivity::class.java)
            proximaTela.putExtra("GAS_PRICE", etGasPrice.text.toString())
            proximaTela.putExtra("ETHANOL_PRICE", etEthanolPrice.text.toString())
            proximaTela.putExtra("GAS_AVERAGE", etGasEvarage.text.toString())
            proximaTela.putExtra("ETHANOL_AVERAGE", etEthanolAvarage.text.toString())
            startActivity(proximaTela)
        }
    }
}
