package com.sulaimanms.dicoding3fragementtab.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sulaimanms.dicoding3fragementtab.Lingkaran;
import com.sulaimanms.dicoding3fragementtab.R;
import com.sulaimanms.dicoding3fragementtab.Tabung;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {
    private EditText edtRadius, edtTinggi;
    private Button btnTabung;
    private TextView txtTabung;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edtRadius = (EditText)view.findViewById(R.id.edt_radius);
        edtTinggi = (EditText)view.findViewById(R.id.edt_tinggi);
        btnTabung = (Button)view.findViewById(R.id.btn_tabung);
        txtTabung = (TextView)view.findViewById(R.id.hasil_tabung);

        btnTabung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double radius = Double.parseDouble(edtRadius.getText().toString());
                double tinggi = Double.parseDouble(edtTinggi.getText().toString());

                Lingkaran dua = new Tabung(radius, tinggi);

                txtTabung.setText(String.valueOf("Luas : "+dua.hitungLuas()));
            }
        });
    }

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        return view;
    }

        @Override
        public void onActivityCreated(Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);
    }

}
