package ice_pbru.suksaovavimon.nijwaree.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //2. Explicit
    // access type name
    private Button CButton;
    private Button DButton;
    private Button EButton;
    private Button FButton;
    private Button GButton;
    private Button AButton;
    private Button BButton;
    private Button CCButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3. Bind widget
        bindwidget();







    }//Main Method

    private void bindwidget() {
        CButton = (Button) findViewById(R.id.button);
        DButton = (Button) findViewById(R.id.button2);
        EButton = (Button) findViewById(R.id.button3);
        FButton = (Button) findViewById(R.id.button4);
        GButton = (Button) findViewById(R.id.button5);
        AButton = (Button) findViewById(R.id.button6);
        BButton = (Button) findViewById(R.id.button7);
        CCButton = (Button) findViewById(R.id.button8);


    }//bind widget
}//Main Class

