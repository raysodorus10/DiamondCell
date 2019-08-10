package com.example.android.diamondcell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPelangganActivity extends AppCompatActivity {

    private TextView tvKode, tvNama, tvTglInput, tvAlamat, tvTelp, tvHp, tvEmail, tvStatus;
    private ImageButton btnCallTelp, btnCallHp, btnEmail;
    private Button btnKembali;
    private ImageView imgPelanggan;
    public static final String SUPPLIER_EXTRA = "";

    private Supplier supplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pelanggan);
        // hindari landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tvKode = findViewById(R.id.tv_kode_pelanggan);
        tvNama = findViewById(R.id.tv_nama_pelanggan);
        tvTglInput = findViewById(R.id.tv_tanggal_input_pelanggan);
        tvAlamat = findViewById(R.id.tv_alamat_pelanggan);
        tvTelp = findViewById(R.id.tv_telepon_pelanggan);
        tvHp = findViewById(R.id.tv_hp_pelanggan);
        tvEmail = findViewById(R.id.tv_email_pelanggan);
        tvStatus = findViewById(R.id.tv_status_pelanggan);
        imgPelanggan = findViewById(R.id.img_pelanggan);
        btnCallTelp = findViewById(R.id.btn_telepon_call);
        btnCallHp = findViewById(R.id.btn_hp_call);
        btnEmail = findViewById(R.id.btn_email);
        btnKembali = findViewById(R.id.btn_kembali);

        btnCallTelp.setEnabled(false);
        btnCallHp.setEnabled(false);
        btnEmail.setEnabled(false);

        //TODO: Mirip dengan DetailSales & Detail Supplier

    }
}
