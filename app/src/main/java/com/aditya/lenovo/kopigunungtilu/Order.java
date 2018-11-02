package com.aditya.lenovo.kopigunungtilu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Order extends AppCompatActivity {
    //
    String valor;

    //button
    @BindView(R.id.btncekharga) Button cekharga;
    @BindView(R.id.btnorder) Button btnorder;
    int jumlah;
    //EditText
    @BindView(R.id.etnama) EditText etnama;
    @BindView(R.id.etalamat) EditText etalamat;
    @BindView(R.id.etemail) EditText etemail;
    @BindView(R.id.etnohp) EditText etnohp;
    //
    //spinner
    //@BindView(R.id.spinnerjenis) Spinner spinnerjenis;
    @BindView(R.id.spinnerproses) Spinner spinnerproses;
    @BindView(R.id.spinnerberat) Spinner spinnerberat;
    //
    //TextView
    @BindView(R.id.tvtotalharga) TextView tvtotalharga;
    //
    //RadioButton
    @BindView(R.id.rgbahan) RadioGroup rgbahan;
    @BindView(R.id.rbarabica) RadioButton rbarabica;
    @BindView(R.id.rbrobusta) RadioButton rbrobusta;
    RadioButton radioButton;
    ArrayAdapter<CharSequence> adapter;

    int totalHarga,position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //14oct
        adapter = ArrayAdapter.createFromResource(this,R.array.dropdown_processing,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        //14oct*penyebab forceclose
        ButterKnife.bind(this);
        totalHarga = 0;

        registerContext();

        final RadioGroup rgBahan = (RadioGroup) findViewById(R.id.rgbahan);
        ////contextmenu
        final ListView list = (ListView) findViewById(R.id.list);




        String[] values = new String[] { "Jenis"};

        ArrayAdapter<String> adaptador =new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);

        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                valor    = (String) list.getItemAtPosition(position);

                registerForContextMenu(view);
            }


        });
        ////contextmenu


    }
    //radio14oct
    public  void  rbclick(View view){
        int radiobuttonid = rgbahan.getCheckedRadioButtonId();

        radioButton = (RadioButton) findViewById(radiobuttonid);
        Toast.makeText(this,"selected"+ radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
    //radio
    private void registerContext(){
        //registerForContextMenu(btnPlusNasi);

    }
    //method

    //method

    //contextmenu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item
                .getMenuInfo();
        switch (item.getItemId()) {
            case R.id.greanbean:
                Toast.makeText(this,valor+ ": Grean Bean" , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.roastedbean:
                Toast.makeText(this,valor+ ": Roasted Bean" , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ground:
                Toast.makeText(this,valor+ ": Ground" , Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    //contextmenututup
    //

    @OnClick(R.id.btncekharga)
    public void btncekharga(){
        //if
        int radiobuttonid = rgbahan.getCheckedRadioButtonId();

        radioButton= (RadioButton) findViewById(radiobuttonid);
        tvtotalharga.setText("bahan pilihannya:"+radioButton.getText());

    }
    @OnClick(R.id.btnorder)
    public void btnorder(){
        Intent i = new Intent(getApplicationContext(), Finish.class);
        //i.putExtra("totalHarga", tvTotalHarga.getText().toString());
        startActivity(i);
    }
    //
}

