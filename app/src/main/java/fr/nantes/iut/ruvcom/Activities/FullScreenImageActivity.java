package fr.nantes.iut.ruvcom.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import fr.nantes.iut.ruvcom.R;

public class FullScreenImageActivity extends AppCompatActivity {

    private final ImageLoader imageLoader = ImageLoader.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String imageUrl = getIntent().getStringExtra("imageUrl");

        setContentView(R.layout.activity_full_screen_image);

        ImageView fullScreenImageView = (ImageView) findViewById(R.id.fullScreenImageView);

        imageLoader.displayImage(imageUrl, fullScreenImageView);
    }

}
