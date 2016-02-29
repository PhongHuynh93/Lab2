package dhbk.android.lab2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivityPrivate extends AppCompatActivity {
    private TextView mTxtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtMsg = (TextView) findViewById(R.id.txtMsg);

        Button btnColor = (Button) findViewById(R.id.btnColor);
        Button btnText = (Button) findViewById(R.id.btnText);
        Button btnToast = (Button) findViewById(R.id.btnToast);

        RadioButton rdbtColor = (RadioButton) findViewById(R.id.rdbtColor);
        RadioButton rdbtText = (RadioButton) findViewById(R.id.rdbtTextShow);
        RadioButton rdbtToast = (RadioButton) findViewById(R.id.rdbtToast);

        btnColor.setOnClickListener(new PrivateClickAction("COLOR"));
        btnText.setOnClickListener(new PrivateClickAction("TEXT"));
        btnToast.setOnClickListener(new PrivateClickAction("TOAST"));

        rdbtColor.setOnClickListener(new PrivateClickAction("COLOR"));
        rdbtText.setOnClickListener(new PrivateClickAction("TEXT"));
        rdbtToast.setOnClickListener(new PrivateClickAction("TOAST"));
    }

    private void setColorPrivate(int color, String msg) {
        mTxtMsg.setBackgroundColor(color);
        mTxtMsg.setText(msg);
    }


    private class PrivateClickAction implements View.OnClickListener {
        private String color;

        public PrivateClickAction(String color) {
            this.color = color;
        }

        @Override
        public void onClick(View v) {
            if (color.equals("COLOR")) {
                setColorPrivate(Color.RED, "You clicked button color");
            }
            if (color.equals("TEXT")) {
                setColorPrivate(Color.BLUE, "You clicked button text");
            }
            if (color.equals("TOAST")) {
                setColorPrivate(Color.YELLOW, "You clicked button toast");
            }
        }


    }
}

