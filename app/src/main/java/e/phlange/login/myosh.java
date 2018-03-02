package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class myosh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myosh);

        WebView bjcalwv = new WebView(myosh.this);
        bjcalwv.getSettings().setJavaScriptEnabled(true);
        bjcalwv.loadUrl("https://s4.myosh.com/prod2/my2/menu.nsf");
        setContentView(bjcalwv);
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
