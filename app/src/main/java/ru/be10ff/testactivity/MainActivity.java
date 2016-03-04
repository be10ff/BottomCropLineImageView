package ru.be10ff.testactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import ru.be10ff.cropajustimageview.CropAdjustImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CropAdjustImageView) findViewById(R.id.imgPreview1)).setImageResource(R.drawable.sample);
        ((CropAdjustImageView) findViewById(R.id.imgPreview2)).setImageResource(R.drawable.sample);
        ((CropAdjustImageView) findViewById(R.id.imgPreview3)).setImageResource(R.drawable.sample);
        ((CropAdjustImageView) findViewById(R.id.imgPreview4)).setImageResource(R.drawable.znak);
        ((CropAdjustImageView) findViewById(R.id.imgPreview5)).setImageResource(R.drawable.znak);
        ((CropAdjustImageView) findViewById(R.id.imgPreview6)).setImageResource(R.drawable.znak);

    }
}
