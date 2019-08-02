package sg.edu.rp.c346.demodynamicspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spin1, spin2;
    Button btnUpdate;
    ArrayList<String> alNumbers;
    ArrayAdapter<String> aaNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin1 = findViewById(R.id.spinner);
        spin2 = findViewById(R.id.spinner2);
        btnUpdate = findViewById(R.id.buttonUpdate);

        alNumbers = new ArrayList<>();

        aaNumbers = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, alNumbers);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:

                        alNumbers.clear();

                        String[] evenNumbers = getResources().getStringArray(R.array.even_numbers);

                        alNumbers.addAll(Arrays.asList(evenNumbers));

                        spin2.setAdapter(aaNumbers);

                        spin2.setSelection(2);

                        break;

                    case 1:

                        alNumbers.clear();

                        String[] oddNumbers = getResources().getStringArray(R.array.odd_numbers);

                        alNumbers.addAll(Arrays.asList(oddNumbers));

                        spin2.setAdapter(aaNumbers);

                        spin2.setSelection(1);

                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
