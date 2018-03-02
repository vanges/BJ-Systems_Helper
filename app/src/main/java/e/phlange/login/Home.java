package e.phlange.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void send_techhome(View view) {
       Intent start_techhome = new Intent(this, techhome.class);
        startActivity(start_techhome);
   }

    public void send_siteinfo(View view) {
        Intent start_siteinfo = new Intent(this, siteinfo.class);
        startActivity(start_siteinfo);
    }

   public void send_email(View view) {
       Intent start_sickemail = new Intent(this, sickemail.class);
       startActivity(start_sickemail);

   }

   public void send_joblist(View view) {
       Intent start_joblist = new Intent(this, joblist.class);
       startActivity(start_joblist);
   }

    public void send_phonelist(View view) {
        Intent start_phonelist = new Intent(this, phonelist.class);
        startActivity(start_phonelist);

    }
    public void send_leavereq(View view) {
        Intent start_leavereq = new Intent(this, leaverequest.class);
        startActivity(start_leavereq);
    }
    public void send_bjcal(View view) {
        Intent start_bjcal = new Intent(this, bjcal.class);
        startActivity(start_bjcal);
    }
    public void send_myosh(View view) {
        Intent start_myosh = new Intent(this, myosh.class);
        startActivity(start_myosh);
    }
}
