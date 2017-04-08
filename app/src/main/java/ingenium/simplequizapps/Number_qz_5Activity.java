package ingenium.simplequizapps;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Number_qz_5Activity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_qz_5);
        result=(TextView)findViewById(R.id.result_xml);
        result.setEnabled(false);
    }

    public void selectitem(View myview){

        boolean Checked=( (RadioButton) myview ).isChecked();

        switch (myview.getId()) {

            case R.id.first:

                if (Checked) {
                    result.setEnabled(true);
                    result.setText("Wrong Answer");
                    MediaPlayer mp=MediaPlayer.create(getBaseContext(),R.raw.wrongsong);
                    mp.start();
                } else {
                    result.setEnabled(false);
                }

                break;
            case R.id.second:

                if (Checked) {
                    result.setEnabled(true);
                    result.setText("Wrong Answer");
                    MediaPlayer mp=MediaPlayer.create(getBaseContext(),R.raw.wrongsong);
                    mp.start();
                } else {
                    result.setEnabled(false);
                }
                break;
            case R.id.third:
                if (Checked) {
                    result.setEnabled(true);
                    result.setText("Correct Answer");

                    MediaPlayer mp=MediaPlayer.create(getBaseContext(),R.raw.congrasong);
                    mp.start();

                    Thread th = new Thread() {
                        public void run() {
                            try {

                                int waited = 0;

                                while (waited <= 10000) {
                                    sleep(100);
                                    waited += 100;
                                }

                                Intent intent = new Intent(Number_qz_5Activity.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                startActivity(intent);
                                Number_qz_5Activity.this.finish();
                            } catch (Exception e) {

                            } finally {
                                Number_qz_5Activity.this.finish();
                            }

                        }

                    };
                    th.start();


                } else {
                    result.setEnabled(false);
                }
                break;
            case R.id.fourth:
                if (Checked) {
                    result.setEnabled(true);
                    result.setText("Wrong Answer");
                    MediaPlayer mp=MediaPlayer.create(getBaseContext(),R.raw.wrongsong);
                    mp.start();
                } else {
                    result.setEnabled(false);
                }
                break;

        }

    }


}
