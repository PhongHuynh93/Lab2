package dhbk.android.lab2;

import android.graphics.Color;
import android.view.View;

/**
 * Created by huynhducthanhphong on 2/29/16.
 */
public class ClickAction implements View.OnClickListener{
    private String color;
    private MainActivity mMainActivity;

    public ClickAction() {

    }

    public ClickAction(String color, MainActivity mainActivity) {
        this.color = color;
        mMainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if (color.equals("COLOR")) {
            mMainActivity.setColor(Color.RED, "You clicked button color");
        }
        if (color.equals("TEXT")) {
            mMainActivity.setColor(Color.BLUE, "You clicked button text");
        }
        if (color.equals("TOAST")) {
            mMainActivity.setColor(Color.YELLOW, "You clicked button toast");
        }
    }


}
