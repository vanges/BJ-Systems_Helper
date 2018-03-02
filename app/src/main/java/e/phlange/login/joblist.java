package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class joblist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joblist);

        WebView joblistwv = new WebView(joblist.this);
        joblistwv.getSettings().setJavaScriptEnabled(true);
        joblistwv.loadUrl("https://drive.google.com/open?id=1v-naJOh-vVhXf87MSHFfEVsxrLQZJh5o");
        setContentView(joblistwv);
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
