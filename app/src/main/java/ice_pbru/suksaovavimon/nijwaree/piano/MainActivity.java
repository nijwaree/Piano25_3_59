package ice_pbru.suksaovavimon.nijwaree.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        // Button controller
        buttonController();







    }//Main Method

    private void buttonController() {
        CButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer CMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song1);
                CMediaPlayer.start();
                CMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });

        DButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song2);
                DMediaPlayer.start();
                DMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer EMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song3);
                EMediaPlayer.start();
                EMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        FButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song4);
                FMediaPlayer.start();
                FMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        GButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer GMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song5);
                GMediaPlayer.start();
                GMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer AMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song6);
                AMediaPlayer.start();
                AMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        BButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer BMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song7);
                BMediaPlayer.start();
                BMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        CCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=GLZnHiErAdk"));
                startActivity(intent);
            }
        });


    }// buttonController

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

