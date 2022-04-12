package com.example.shopping_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class chooseapp_design extends AppCompatActivity {

    private ImageView amazon_img, flip_cart, dealshare_img, meesho_img, shopify_img, shopsy_img, bigbasket_img, mytra_img, snapdeal_img, hnm_img, nykaa_img, myglam_img, bigbazar_img, max_img, purple_img, menu_img;

    String m = "https://www.amazon.in/";
    String d = "https://www.dealshare.in/";
    String f = "https://www.flipkart.com/";
    String s = "https://meesho.com/";
    String s1 = "https://www.shopify.in/";
    String s2 = "https://www.shopsy.in/";
    String b = "https://www.bigbasket.com/";
    String m1 = "https://www.myntra.com/";
    String snap = "https://www.snapdeal.com/";
    String hm = "https://www.hm.com/";
    String n = "https://www.nykaa.com/";
    String myglam = "https://www.myglamm.com/";
    String bigbazar = "https://shop.bigbazaar.com/";
    String max = "https://www.maxfashion.in/";
    String purple = "https://www.purplle.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseapp_design);

        binding();
        Intent intent = new Intent(chooseapp_design.this, final_Webview.class);

        amazon_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", m);
                startActivity(intent);
            }
        });

        flip_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", f);
                startActivity(intent);
            }
        });

        dealshare_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", d);
                startActivity(intent);
            }
        });

        meesho_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", s);
                startActivity(intent);
            }
        });
        shopify_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", s1);
                startActivity(intent);
            }
        });

        shopsy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", s2);
                startActivity(intent);
            }
        });

        bigbasket_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", b);
                startActivity(intent);
            }
        });

        mytra_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", m1);
                startActivity(intent);
            }
        });

        snapdeal_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", snap);
                startActivity(intent);
            }
        });

        hnm_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", hm);
                startActivity(intent);
            }
        });

        nykaa_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", n);
                startActivity(intent);
            }
        });

        myglam_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", myglam);
                startActivity(intent);
            }
        });

        bigbazar_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", bigbazar);
                startActivity(intent);
            }
        });

        max_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", max);
                startActivity(intent);
            }
        });

        purple_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("amazon", purple);
                startActivity(intent);
            }
        });

        menu_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cus_Dialog();
            }
        });
    }

    private void binding() {
        amazon_img = findViewById(R.id.amazon_img);
        flip_cart = findViewById(R.id.flip_cart);
        dealshare_img = findViewById(R.id.dealshare_img);
        meesho_img = findViewById(R.id.meesho_img);
        shopify_img = findViewById(R.id.shopify_img);
        shopsy_img = findViewById(R.id.shopsy_img);
        bigbasket_img = findViewById(R.id.bigbasket_img);
        mytra_img = findViewById(R.id.mytra_img);
        snapdeal_img = findViewById(R.id.snapdeal_img);
        hnm_img = findViewById(R.id.hnm_img);
        nykaa_img = findViewById(R.id.nykaa_img);
        myglam_img = findViewById(R.id.myglam_img);
        bigbazar_img = findViewById(R.id.bigbazar_img);
        max_img = findViewById(R.id.max_img);
        purple_img = findViewById(R.id.purple_img);
        menu_img = findViewById(R.id.menu_img);
    }

    void cus_Dialog() {
        BottomSheetDialog dialog = new BottomSheetDialog(chooseapp_design.this);
        dialog.setContentView(R.layout.dailog_design);

        dialog.show();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to exit application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();

    }
}