package sg.edu.rp.c346.id19028654.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvAnswer=findViewById(R.id.textView);
        tvAnswer.setText("In second Activity");

        Intent inte=getIntent();
        String qselected= inte.getStringExtra("Question");
        tvAnswer.setText(qselected);

    }
}
