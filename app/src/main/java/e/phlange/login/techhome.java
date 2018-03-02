package e.phlange.login;




import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.Toast;


import e.phlange.login.atv.model.TreeNode;
import e.phlange.login.atv.view.AndroidTreeView;


public class techhome extends AppCompatActivity {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techhome);


        //Root
        TreeNode root = TreeNode.root();

        //Parent
        MyHolder.IconTreeItem nodeItem = new MyHolder.IconTreeItem(R.drawable.ic_arrow_drop_down, "Technical Library");
        TreeNode parent = new TreeNode(nodeItem).setViewHolder(new MyHolder(getApplicationContext(), true, MyHolder.DEFAULT, MyHolder.DEFAULT));

        //Audio Child
        MyHolder.IconTreeItem audio_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Audio");
        TreeNode audio_child = new TreeNode(audio_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //CBUS-Lighting Child
        MyHolder.IconTreeItem cbus_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "CBUS & Lighting");
        TreeNode cbus_child = new TreeNode(cbus_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //CCTV Child
        MyHolder.IconTreeItem cctv_childItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "CCTV");
        TreeNode cctv_child = new TreeNode(cctv_childItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //DATA Child
        MyHolder.IconTreeItem data_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "DATA & Timers");
        TreeNode data_child = new TreeNode(data_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //FIRE Child
        MyHolder.IconTreeItem fire_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "FIRE");
        TreeNode fire_child = new TreeNode(fire_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //Gates and Sensors Child
        MyHolder.IconTreeItem gates_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Gates & Sensors");
        TreeNode gates_child = new TreeNode(gates_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //Locks Child
        MyHolder.IconTreeItem locks_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Locks");
        TreeNode locks_child = new TreeNode(locks_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //Intercoms Child
        MyHolder.IconTreeItem intercom_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Intercoms");
        TreeNode intercom_child = new TreeNode(intercom_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //Nursecall Child
        MyHolder.IconTreeItem nursecall_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Nursecall");
        TreeNode nursecall_child = new TreeNode(nursecall_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));

        //Paging & DECT Child
        MyHolder.IconTreeItem paging_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Paging & DECT");
        TreeNode paging_child = new TreeNode(paging_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));


        //Security Child
        MyHolder.IconTreeItem security_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Security");
        TreeNode security_child = new TreeNode(security_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));


        //Wireless Child
        MyHolder.IconTreeItem wireless_ChildItem = new MyHolder.IconTreeItem(R.drawable.ic_folder, "Wireless");
        TreeNode wireless_child = new TreeNode(wireless_ChildItem).setViewHolder(new MyHolder(getApplicationContext(), false, R.layout.child, 25));





        //Main Parents
        parent.addChildren(audio_child);
        parent.addChildren(cbus_child);
        parent.addChildren(cctv_child);
        parent.addChildren(data_child);
        parent.addChildren(fire_child);
        parent.addChildren(gates_child);
        parent.addChildren(intercom_child);
        parent.addChildren(locks_child);
        parent.addChildren(nursecall_child);
        parent.addChildren(paging_child);
        parent.addChildren(security_child);
        parent.addChildren(wireless_child);


        root.addChild(parent);

        //Add AndroidTreeView into view.
        AndroidTreeView tView = new AndroidTreeView(getApplicationContext(), root);
        ((LinearLayout) findViewById(R.id.ll_parent)).addView(tView.getView());


        //Call to drive links
        audio_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView AudioCtrlWeb = new WebView(techhome.this);
                AudioCtrlWeb.getSettings().setJavaScriptEnabled(true);
                AudioCtrlWeb.loadUrl("https://drive.google.com/open?id=1NhZ_oREZlAKkpz29Vno__7uIWSMcwGYr");
                setContentView(AudioCtrlWeb);

            }
        });
        cbus_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView cbusCtrlWeb = new WebView(techhome.this);
                cbusCtrlWeb.getSettings().setJavaScriptEnabled(true);
                cbusCtrlWeb.loadUrl("https://drive.google.com/open?id=1LgUaKtY63vY1WV5pDOreHaGF9VzAkxdt");
                setContentView(cbusCtrlWeb);

            }
        });

        cctv_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView cctvCtrlWeb = new WebView(techhome.this);
                cctvCtrlWeb.getSettings().setJavaScriptEnabled(true);
                cctvCtrlWeb.loadUrl("https://drive.google.com/open?id=1-2IeIY85n48Y9o0hhKahxkSgXg0sJzIt");
                setContentView(cctvCtrlWeb);

            }
        });

        data_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView dataCtrlWeb = new WebView(techhome.this);
                dataCtrlWeb.getSettings().setJavaScriptEnabled(true);
                dataCtrlWeb.loadUrl("https://drive.google.com/open?id=1lYQJXkZ9fdMjrTe0RCA96JBJx5Vqu874");
                setContentView(dataCtrlWeb);

            }
        });

        fire_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView fireCtrlWeb = new WebView(techhome.this);
                fireCtrlWeb.getSettings().setJavaScriptEnabled(true);
                fireCtrlWeb.loadUrl("https://drive.google.com/open?id=1Ik318K_8ZNJfn11B_tS7rtWTJVKYS93T");
                setContentView(fireCtrlWeb);

            }
        });

        gates_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView gatesCtrlWeb = new WebView(techhome.this);
                gatesCtrlWeb.getSettings().setJavaScriptEnabled(true);
                gatesCtrlWeb.loadUrl("https://drive.google.com/open?id=1P0Chu7PbuU32AYaZ_AauP9OSObJbxMX4");
                setContentView(gatesCtrlWeb);

            }
        });

        intercom_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView intercomCtrlWeb = new WebView(techhome.this);
                intercomCtrlWeb.getSettings().setJavaScriptEnabled(true);
                intercomCtrlWeb.loadUrl("https://drive.google.com/open?id=1n0MfG_n0XzrmHOXpxgfV2rxOaE51Ownu");
                setContentView(intercomCtrlWeb);

            }
        });

        locks_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView locksCtrlWeb = new WebView(techhome.this);
                locksCtrlWeb.getSettings().setJavaScriptEnabled(true);
                locksCtrlWeb.loadUrl("https://drive.google.com/open?id=1XHJhF0J3Pn_9vwZ_YpzNtNd6WhhYVNAK");
                setContentView(locksCtrlWeb);

            }
        });

        nursecall_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView nursecallCtrlWeb = new WebView(techhome.this);
                nursecallCtrlWeb.getSettings().setJavaScriptEnabled(true);
                nursecallCtrlWeb.loadUrl("https://drive.google.com/open?id=19oFC1ECbpsMyoOSA7ZuPOpQ0al0My2Bk");
                setContentView(nursecallCtrlWeb);

            }
        });

        paging_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView pagingCtrlWeb = new WebView(techhome.this);
                pagingCtrlWeb.getSettings().setJavaScriptEnabled(true);
                pagingCtrlWeb.loadUrl("https://drive.google.com/open?id=19bAUDDa6sngzURJpvkOxRoLxn3WDThZ2");
                setContentView(pagingCtrlWeb);

            }
        });


        security_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView SecCtrlWeb = new WebView(techhome.this);
                SecCtrlWeb.getSettings().setJavaScriptEnabled(true);
                SecCtrlWeb.loadUrl("https://drive.google.com/open?id=1SiX01ztFHk4q5Q814wmgxxDSOiR_92BP");
                setContentView(SecCtrlWeb);

            }
        });

        wireless_child.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {

                WebView wirelessCtrlWeb = new WebView(techhome.this);
                wirelessCtrlWeb.getSettings().setJavaScriptEnabled(true);
                wirelessCtrlWeb.loadUrl("https://drive.google.com/open?id=1my0YIKWUgRXdBlX9E-t-2uxsiTTMgcGv");
                setContentView(wirelessCtrlWeb);

            }
        });
    }
    public void onBackPressed() {
        Intent start_home = new Intent(this, Home.class);
        startActivity(start_home);
    }
}


