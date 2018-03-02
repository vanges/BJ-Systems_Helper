package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class phonelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonelist);

        WebView phonelistwv = new WebView(phonelist.this);
        phonelistwv.getSettings().setJavaScriptEnabled(true);
        phonelistwv.loadUrl("https://drive.google.com/open?id=1KBiHJVUfb9gdEKe0eLWoZod8YBbli795");
        setContentView(phonelistwv);

    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
