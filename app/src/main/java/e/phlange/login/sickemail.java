package e.phlange.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sickemail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sickemail);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "mike@bjsystems.com.au" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Sick Leave");
        intent.putExtra(Intent.EXTRA_TEXT, "Hi Stacey, I am not coming into work today as I'm sick");
        startActivity(Intent.createChooser(intent, "Sick Leave"));
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}
