package com.example.assignment01;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class InputPageSample extends AppCompatActivity {
    TextView textView;
    static List<InputDTO> inputs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


        textView = (TextView) findViewById(R.id.nameView);

        Button button2 = findViewById(R.id.button2);
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();

                if (action == MotionEvent.ACTION_DOWN) {
                    InputDTO input = new InputDTO("홍길동", "010-0000-0000");
                    inputs.add(input);
                }

                return true;
            }
        });
    }

    public void onBackButtonClicked(View view) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 클릭했어요", Toast.LENGTH_LONG).show();
    }

    public static class InputDTO{
        String name;
        String tel;

        public InputDTO(String name, String tel) {
            this.name = name;
            this.tel = tel;
        }

        public String getName() {
            return name;
        }

        public String getTel() {
            return tel;
        }
    }
}