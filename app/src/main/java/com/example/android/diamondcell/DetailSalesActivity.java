package com.example.android.diamondcell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailSalesActivity extends AppCompatActivity {

    private TextView tvKode, tvNama, tvAlamat, tvHp, tvJabatan, tvJenisKelamin, tvAgama,
            tvTempatLahir, tvTanggalLahir, tvEmail, tvStatus;
    private ImageButton btnCallHp, btnEmail;
    private Button btnKembali;
    private ImageView imgSales;
    public static final String SALES_EXTRA = "";

    // private Sales sales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sales);
        // hindari landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tvKode = findViewById(R.id.tv_kode_sales);
        tvNama = findViewById(R.id.tv_nama_sales);
        tvAlamat = findViewById(R.id.tv_alamat_sales);
        tvHp = findViewById(R.id.tv_hp_sales);
        tvJabatan = findViewById(R.id.tv_jabatan_sales);
        tvJenisKelamin = findViewById(R.id.tv_kelamin_sales);
        tvAgama = findViewById(R.id.tv_agama_sales);
        tvTempatLahir = findViewById(R.id.tv_tempat_lahir_sales);
        tvTanggalLahir = findViewById(R.id.tv_tanggal_lahir_sales);
        tvEmail = findViewById(R.id.tv_email_sales);
        tvStatus = findViewById(R.id.tv_status_sales);
        btnCallHp = findViewById(R.id.btn_hp_call);
        btnEmail = findViewById(R.id.btn_email);
        btnKembali = findViewById(R.id.btn_kembali);
        imgSales = findViewById(R.id.img_sales);

        btnCallHp.setEnabled(false);
        btnEmail.setEnabled(false);

        // TODO: ambil percelable objek dari intent ke variabel sales
        // supplier = this.getIntent().getParcelableExtra(SUPPLIER_EXTRA);

        // TODO: tampilkan value dari parcelable object ke xml
        /*
        if (sales != null){
            //TODO: isi image view
            //Glide.with()

            // isi text view
            tvKode.setText(sales.getKode());
            tvNama.setText(sales.getNama());
            tvAlamat.setText(sales.getAlamat());
            tvHp.setText(sales.getHp());

            //TODO: lengkapi
            tvJabatan.setText();
            tvJenisKelamin.setText();
            tvAgama.setText();
            tvTempatLahir.setText();
            tvTanggalLahir.setText();

            tvEmail.setText(sales.getEmail());
            if(sales.isActive()){
                tvStatus.setText("AKTIF");
            } else {
                tvStatus.setText("TIDAK AKTIF");
            }

            if (!tvHp.getText().toString().trim().equals("")){
                btnCallHp.setEnabled(true);
                btnCallHp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: kirim intent ekspisist untuk menelpon
                    }
                });
            }
            if (!tvEmail.getText().toString().trim().equals("")){
                btnEmail.setEnabled(true);
                btnEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: kirim intent eksplisit ke aplikasi email
                    }
                });
            }

            btnKembali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

        } else {
            Toast.makeText(this, "Gagal load data", Toast.LENGTH_LONG);
            finish();
        } // END IF

        */
    } // END ONCREATE METHOD


} // END CLASS
