package dhbk.android.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtMsg = (TextView) findViewById(R.id.txtMsg);

        Button btnColor = (Button)findViewById(R.id.btnColor);
        Button btnText = (Button)findViewById(R.id.btnText);
        Button btnToast = (Button)findViewById(R.id.btnToast);

        RadioButton rdbtColor = (RadioButton) findViewById(R.id.rdbtColor);
        RadioButton rdbtText = (RadioButton) findViewById(R.id.rdbtTextShow);
        RadioButton rdbtToast = (RadioButton) findViewById(R.id.rdbtToast);

        btnColor.setOnClickListener(new ClickAction("COLOR", this));
        btnText.setOnClickListener(new ClickAction("TEXT", this));
        btnToast.setOnClickListener(new ClickAction("TOAST", this));

        rdbtColor.setOnClickListener(new ClickAction("COLOR", this));
        rdbtText.setOnClickListener(new ClickAction("TEXT", this));
        rdbtToast.setOnClickListener(new ClickAction("TOAST", this));
    }

    public void setColor(int color, String msg) {
        mTxtMsg.setBackgroundColor(color);
        mTxtMsg.setText(msg);
    }
}
