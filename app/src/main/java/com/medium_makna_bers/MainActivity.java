package com.medium_makna_bers;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView Encam_textView;
    String t, a, b;
    Double Encam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Xoydana girêdana lîsansiyê û rezultata operasyonê veke
        editText = findViewById(R.id.editText);
        Encam_textView = findViewById(R.id.textView);
    }

    // Bûtonên kalkûlasyonê dikşîne
    public void buttonClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();

        switch (data) {
            case "C":
                // Girêdanê paqij bike û rezultatê paqij bike
                editText.setText("");
                Encam_textView.setText("");
                break;
            case "=":
                // Tekilîkirina xoydana girê
                t = editText.getText().toString();

                // Eger têkilîkirina "+" hebe
                if (t.contains("+")) {
                    String[] split = t.split("\\+");
                    a = split[0];
                    b = split[1];
                    Encam = Double.parseDouble(a) + Double.parseDouble(b);
                    Encam_textView.setText(Encam.toString());
                }
                // Eger têkilîkirina "-" hebe
                else if (t.contains("-")) {
                    String[] split = t.split("-");
                    a = split[0];
                    b = split[1];
                    Encam = Double.parseDouble(a) - Double.parseDouble(b);
                    Encam_textView.setText(Encam.toString());
                }
                // Eger têkilîkirina "x" (çarpîn) hebe
                else if (t.contains("x")) {
                    String[] split = t.split("x");
                    a = split[0];
                    b = split[1];
                    Encam = Double.parseDouble(a) * Double.parseDouble(b);
                    Encam_textView.setText(Encam.toString());
                }
                // Eger têkilîkirina "/" (parêz) hebe
                else if (t.contains("/")) {
                    String[] split = t.split("/");
                    a = split[0];
                    b = split[1];
                    Encam = Double.parseDouble(a) / Double.parseDouble(b);
                    Encam_textView.setText(Encam.toString());
                }
                break;
            default:
                // Têkilîkirina hilbijartinê li ser xoydana girê
                editText.setText(editText.getText() + data);
                break;
        }
    }
}
