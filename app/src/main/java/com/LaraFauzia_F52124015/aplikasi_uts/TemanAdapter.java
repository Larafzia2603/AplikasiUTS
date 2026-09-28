package com.LaraFauzia_F52124015.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class TemanAdapter extends ArrayAdapter<TemanModel> {

    private Context context;
    private ArrayList<TemanModel> listTeman;

    public TemanAdapter(@NonNull Context context, ArrayList<TemanModel> listTeman) {
        super(context, 0, listTeman);
        this.context = context;
        this.listTeman = listTeman;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.item_teman, parent, false);
        }

        TemanModel teman = listTeman.get(position);

        ImageView imgFoto = listItem.findViewById(R.id.img_foto);
        TextView tvNama = listItem.findViewById(R.id.tv_nama);
        TextView tvNim = listItem.findViewById(R.id.tv_nim);
        TextView tvHobi = listItem.findViewById(R.id.tv_hobi);

        imgFoto.setImageResource(teman.getFoto());
        tvNama.setText(teman.getNama());
        tvNim.setText("NIM: " + teman.getNim());
        tvHobi.setText("Hobi: " + teman.getHobi());

        return listItem;
    }
}
