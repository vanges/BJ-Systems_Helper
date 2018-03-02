package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class bjcal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjcal);

        WebView bjcalwv = new WebView(bjcal.this);
        bjcalwv.getSettings().setJavaScriptEnabled(true);
        bjcalwv.loadUrl("https://teamup.com/ks4fe8a1cbd76ab183/");
        setContentView(bjcalwv);


    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
