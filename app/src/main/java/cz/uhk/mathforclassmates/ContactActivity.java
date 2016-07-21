package cz.uhk.mathforclassmates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        findViewById(R.id.emailLiska).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"t.valenta@ucebnicematiky.cz"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Dopis panu liškovi");
                i.putExtra(Intent.EXTRA_TEXT   , "...");

            }
        });

    }
}
