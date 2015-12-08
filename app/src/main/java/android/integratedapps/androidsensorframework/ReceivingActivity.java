package android.integratedapps.androidsensorframework;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReceivingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                String string1 = intent.getExtras().getString(Intent.EXTRA_TEXT);
                String string2 = intent.getExtras().getString("MyKey");
            } else {
                //
            }

        } else {
            // Handle other intents, such as being started from the home screen
        }
    }
}
