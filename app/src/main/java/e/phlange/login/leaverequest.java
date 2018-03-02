package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class leaverequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaverequest);

        WebView leavereqwv = new WebView(leaverequest.this);
        leavereqwv.getSettings().setJavaScriptEnabled(true);
        leavereqwv.loadUrl("https://www.bjsystems.com.au/client-portal/leaverequest/");
        setContentView(leavereqwv);
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
