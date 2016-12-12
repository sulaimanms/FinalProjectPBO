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

import com.sulaimanms.dicoding3fragementtab.Lingkaran;
import com.sulaimanms.dicoding3fragementtab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {
    private EditText edtLingkaran;
    private Button btnLingkaran;
    private TextView txtLingkaran;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edtLingkaran = (EditText) view.findViewById(R.id.edt_Lingkaran);
        btnLingkaran = (Button)view.findViewById(R.id.btn_Lingkaran);
        txtLingkaran = (TextView)view.findViewById(R.id.hasil_Lingkaran);

        btnLingkaran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double radius = Double.parseDouble(edtLingkaran.getText().toString());


                Lingkaran satu = new Lingkaran(radius);

                txtLingkaran.setText(String.valueOf("Luas : "+satu.hitungLuas()));
            }
        });
    }

    public Tab1Fragment() {

        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }

}
