package com.dhila.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.dhila.myapplication.R;

public class activity_main extends Activity implements OnClickListener, OnCheckedChangeListener {

    EditText tempatnama,tempatemail;
    Button buttonsbm;
    RadioGroup groupjeniskelamin;
    RadioButton radiolaki, radioper;
    CheckBox checkboxbaca, checkboxtraveling, checkboxlukis;
    TextView outputnama, outputemail, outputjeniskelamin, outputhobi;
    String jeniskelamin, hobi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tempatemail = (EditText)findViewById(R.id.tulisemail);
        tempatnama = (EditText)findViewById(R.id.tulisnama);
        buttonsbm = (Button)findViewById(R.id.tomboltampil);
        groupjeniskelamin = (RadioGroup)findViewById(R.id.groupjk);
        checkboxbaca = (CheckBox)findViewById(R.id.cekboxbaca);
        checkboxtraveling = (CheckBox)findViewById(R.id.cekboxtravel);
        checkboxlukis = (CheckBox)findViewById(R.id.cekboxlukis);
        outputnama =(TextView)findViewById(R.id.outputnama);
        outputemail =(TextView)findViewById(R.id.outputemail);
        outputhobi = (TextView)findViewById(R.id.outputhobby);
        outputjeniskelamin = (TextView)findViewById(R.id.outputjk);

        buttonsbm.setOnClickListener(this);
        groupjeniskelamin.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        outputnama.setText("Nama : "+tempatnama.getText());
        outputemail.setText("Email : "+tempatemail.getText());
        if (checkboxbaca.isChecked() && checkboxlukis.isChecked() && checkboxtraveling.isChecked()){
            outputhobi.setText("Hobi : Membaca, Melukis & Traveling");
        }else if(checkboxbaca.isChecked() && checkboxlukis.isChecked()){
            outputhobi.setText("Hobi : Membaca & Melukis");
        }else if(checkboxbaca.isChecked() && checkboxtraveling.isChecked()){
            outputhobi.setText("Hobi : Membaca & Traveling");
        }else if(checkboxlukis.isChecked() && checkboxtraveling.isChecked()){
            outputhobi.setText("Hobi : Melukis & Traveling");
        }else if(checkboxbaca.isChecked()){
            outputhobi.setText("Hobi : Membaca");
        }else if(checkboxlukis.isChecked()){
            outputhobi.setText("Hobi : Melukis");
        }else if(checkboxtraveling.isChecked()){
            outputhobi.setText("Hobi : Traveling");
        }else{
            outputhobi.setText("Hobi : ");

        }
        outputjeniskelamin.setText(jeniskelamin);
        tempatnama.setText("");
        tempatemail.setText("");
        checkboxbaca.setChecked(false);
        checkboxtraveling.setChecked(false);
        checkboxlukis.setChecked(false);
        groupjeniskelamin.clearCheck();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int check) {
        // TODO Auto-generated method stub
        if(check==R.id.radiolk){
            jeniskelamin="Jenis Kelamin : Laki-Laki";

        }else if(check==R.id.radiopr){
            jeniskelamin="Jenis Kelamin : Perempuan";

        }else{
            jeniskelamin="Jenis Kelamin :";
        }

    }


}
