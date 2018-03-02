package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class siteinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siteinfo);

        WebView siteinfowv = new WebView(siteinfo.this);
        siteinfowv.getSettings().setJavaScriptEnabled(true);
        siteinfowv.loadUrl("https://drive.google.com/open?id=1kp9wolq0h6F8b0vrZCpAKfiSv9FoYfsd");
        setContentView(siteinfowv);
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
