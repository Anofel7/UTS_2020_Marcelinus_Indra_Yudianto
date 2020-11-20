package ac.id.atmaluhur.uts_amub_ti7a_1711500010_marcelinus_indra_yudianto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {
    ImageView wut;
    Button login2,register;
    EditText username2, password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username2 = findViewById(R.id.username2);
        password2 = findViewById(R.id.password2);
        //email = findViewById(R.id.email);

        login2 = findViewById(R.id.login2);
        register = findViewById(R.id.register1);

        //berpindah dari login ke register page
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin2register = new Intent(Login.this, RegisterOneActivity.class);
                startActivity(gotologin2register);
            }
        });

    }
}
