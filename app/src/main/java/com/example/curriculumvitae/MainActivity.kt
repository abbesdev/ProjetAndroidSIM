package com.example.curriculumvitae

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonN = findViewById(R.id.buttonNext) as Button;
        var buttonR = findViewById(R.id.buttonReset) as Button;
var fullN = findViewById(R.id.fullName) as EditText;
        var age = findViewById(R.id.Age) as EditText;
        var email = findViewById(R.id.Email) as EditText;
        var seek1 = findViewById(R.id.seek1) as SeekBar;
        var seek2 = findViewById(R.id.seek2) as SeekBar;
        var seek3 = findViewById(R.id.seek3) as SeekBar;
        var barValue1 : Int = 0;
        var barValue2 : Int = 0;
        var barValue3 : Int = 0;

        fun isValidEmail(email: String): Boolean {
            return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }


        buttonN.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {

                if (fullN.getText().toString().equals("") || age.getText().toString().equals("") || email.getText().toString().equals("")) {

                    Toast.makeText(
                        applicationContext,
                        "Please Provide Some Input",
                        Toast.LENGTH_SHORT
                    ).show()


                }else if (isValidEmail(email.getText().toString()) == false ){
                    Toast.makeText(
                        applicationContext,
                        "Please Verify Your email address",
                        Toast.LENGTH_SHORT
                    ).show()
                }else if(barValue1 >80 ){
                    Toast.makeText(
                        applicationContext,
                        "You're excellent at android",
                        Toast.LENGTH_SHORT
                    ).show()
                }else if(barValue2 >80 ){
                    Toast.makeText(
                        applicationContext,
                        "You're excellent at iOS",
                        Toast.LENGTH_SHORT
                    ).show()
                }else if(barValue3 >80 ){
                    Toast.makeText(
                        applicationContext,
                        "You're excellent at Flutter",
                        Toast.LENGTH_SHORT
                    ).show()
                }else if (barValue1 <30 && barValue2 <30 && barValue3<30){Toast.makeText(
                    applicationContext,
                    "Vous devez travailler vos skills",
                    Toast.LENGTH_SHORT
                ).show()}else {Toast.makeText(
                    applicationContext,
                    "Vous avez de bons skills !",
                    Toast.LENGTH_SHORT
                ).show()}
            }
        }


        );
        seek1.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                barValue1 = progress;

                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        });
        seek2.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                barValue2 = progress;

                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        });
        seek3.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                barValue3 = progress;

                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        });
        buttonR.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {

                email.text.clear();
                age.text.clear();
                fullN.text.clear();
                seek1.setProgress(0);
                seek2.setProgress(0);
                seek3.setProgress(0);

            }});
    }
}
