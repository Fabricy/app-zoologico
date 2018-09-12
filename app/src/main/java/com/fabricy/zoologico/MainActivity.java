package com.fabricy.zoologico;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.fabricy.zoologico.dao.EspecieDAO;
import com.fabricy.zoologico.model.Animal;
import com.fabricy.zoologico.model.Especie;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText etNome, etIdade;
    private Button btnSalvar;
    private Spinner spEspecies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      etNome =(EditText) findViewById(R.id.etNomeDoAnimal);
      etIdade = (EditText) findViewById(R.id.etIdade);
      btnSalvar = (Button) findViewById(R.id.btnSalvar);
      spEspecies = (Spinner) findViewById(R.id.spEspecies);

      carregarEspecies();
      btnSalvar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              salvar();
          }
      });
      }
      private void salvar(){
        String nome = etNome.getText().toString();
        if(nome.isEmpty() || spEspecies.getSelectedItemPosition() ==0){
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle(getResources().getString(R.string.txtAtencao));

            alerta.setMessage(getResources().getString(R.string.txtCamposObrigatorios));
            alerta.setIcon(android.R.drawable.ic_dialog_alert);
            alerta.setNeutralButton("OK", null);
            alerta.show();

        }else{
            String idade = etIdade.getText().toString();
            if(idade.isEmpty()){
                idade = "0";
            }
            Animal prod = new Animal();
            prod.setNome(nome);
            prod.setIdade(Integer.valueOf(idade));
            prod.setEspecie((Especie) spEspecies.getSelectedItem());
            finish();
        }
        private void carregarEspecies(){
              List<Especie> lista = EspecieDAO.getEspecies(this);

              Especie fake = new Especie();
              fake.setId( 0 );
              fake.setNome(getResources().getString(R.string.txtSelecione) );
              lista.add(0, fake);

              ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lista);
              spEspecies.setAdapter(adapter);

          }

      }
}
