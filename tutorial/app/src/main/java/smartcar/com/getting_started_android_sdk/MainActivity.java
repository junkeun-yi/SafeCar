package smartcar.com.getting_started_android_sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.util.Log;

import com.smartcar.sdk.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.*;

public class MainActivity extends AppCompatActivity {

    private Context appContext;

    // TODO: Authorization Step 1a. Initialize the Smartcar object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appContext = getApplicationContext();

        // TODO: Authorization Step 1b: Initialize the Smartcar object

        // TODO: Authorization Step 3b: Receive the authorization code

        // TODO: Request Step 1: Obtain an access token

        // TODO: Request Step 2: Get vehicle information

        Button connectButton = (Button) findViewById(R.id.connect_button);

        // TODO: Authorization Step 2: Launch Connect
    }
}
