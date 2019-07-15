package sg.edu.rp.c346.petboardingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    Button btnReq;
    EditText etDays, etName, etDate;
    CheckBox cbVac;
    Spinner spnType;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReq = findViewById(R.id.btnRequest);
        etDate = findViewById(R.id.editTextDate);
        etDays = findViewById(R.id.editTextDays);
        etName = findViewById(R.id.editTextName);
        cbVac = findViewById(R.id.checkBoxVac);
        spnType = findViewById(R.id.spinnerType);


        db = FirebaseFirestore.getInstance();
        colRef = db.collection("messages");
        docRef = colRef.document("message");

        btnReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = etDate.getText().toString();
                int days = Integer.valueOf(etDays.getText().toString());
                String name = etName.getText().toString();
                boolean cb = cbVac.isChecked();
                String type = spnType.getSelectedItem().toString();

                Details dat = new Details(name, type, date, days, cb);
                docRef.set(dat);
            }
        });
    }
}
