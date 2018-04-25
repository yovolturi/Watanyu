package sdu.cs58.watanyu.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playSound(View view) {
    }

    public void clickMap(View view) {
        String lat="13.216298";
        String lng="101.056642";
        String label = "สวนสัตว์เปิดเขาเขียว";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        //mapIntent.setPackage("com.google.android.apps.maps");//ใช้เทสบน จีนีโมชั่นไม่ได้
        startActivity(mapIntent);

    }

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0991201075"));
        startActivity(mobileIntent);
    }

    public void playSound1(View view) {
        if (mediaPlayer != null) //ตรวสอบว่ามี Obj. mediaplayer เล่นอยู่หรือไม่
        {
            mediaPlayer.stop();//ถ้ามี obj เล่นอยู่ให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaplayer เดิมให้กับระบบ
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.horse);
        mediaPlayer.start();
    }


    public void playSound2(View view) {
        if (mediaPlayer != null) //ตรวสอบว่ามี Obj. mediaplayer เล่นอยู่หรือไม่
        {
            mediaPlayer.stop();//ถ้ามี obj เล่นอยู่ให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaplayer เดิมให้กับระบบ
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant);
        mediaPlayer.start();
    }

    public void playSound3(View view) {  if (mediaPlayer != null) //ตรวสอบว่ามี Obj. mediaplayer เล่นอยู่หรือไม่
    {
        mediaPlayer.stop();//ถ้ามี obj เล่นอยู่ให้หยุดเล่น
        mediaPlayer.release();//คืน resource ที่ mediaplayer เดิมให้กับระบบ
    }

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);
        mediaPlayer.start();
    }

}



