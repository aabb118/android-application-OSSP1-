package DGU.OSSP.fall2019.PersonalTrainer.Activities;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;


import DGU.OSSP.fall2019.DGU.R;

public class SettingActivity extends AppCompatActivity {

    Button btn_setting_save;

    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);

        btn_setting_save = findViewById(R.id.btn_setting_save);

        btn_setting_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

                //Intent intent = new Intent(SettingActivity.this, MainDisplayActivity.class);

                //startActivity(intent);
            }
        });
    }
}
