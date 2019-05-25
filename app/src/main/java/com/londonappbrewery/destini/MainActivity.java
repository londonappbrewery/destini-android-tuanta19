package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonUp, buttonBottom;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonUp = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);

//        storyTextView.setText(R.string.T1_Story);
//        buttonUp.setText(R.string.T1_Ans1);
//        buttonBottom.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex++;

                if (mStoryIndex == 2 ) {
                    storyTextView.setText(getResources().getString(R.string.T3_Story));
                    buttonUp.setText(getResources().getString(R.string.T3_Ans1));
                    buttonBottom.setText(getResources().getString(R.string.T3_Ans2));
                } else if(mStoryIndex==3 && storyTextView.getText().toString().equals(getResources().getString(R.string.T3_Story))){
                    storyTextView.setText(getResources().getString(R.string.T6_End));
                    buttonUp.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);

                }else if(mStoryIndex==3 && storyTextView.getText().toString().equals(getResources().getString(R.string.T2_Story))){
                    storyTextView.setText(getResources().getString(R.string.T3_Story));
                    buttonUp.setText(getResources().getString(R.string.T3_Ans1));
                    buttonBottom.setText(getResources().getString(R.string.T3_Ans2));
                }
                else{
                    storyTextView.setText(getResources().getString(R.string.T6_End));
                    buttonUp.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex++;
                if (mStoryIndex == 2) {

                    storyTextView.setText(getResources().getString(R.string.T2_Story));
                    buttonUp.setText(getResources().getString(R.string.T2_Ans1));
                    buttonBottom.setText(getResources().getString(R.string.T2_Ans1));
                }

                else if(mStoryIndex==3){
                    if(storyTextView.getText().toString().equals(getResources().getString(R.string.T3_Story)))
                    {
                        storyTextView.setText(getResources().getString(R.string.T5_End));
                        buttonUp.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);
                    }
                    if(storyTextView.getText().toString().equals(getResources().getString(R.string.T2_Story))){
                        storyTextView.setText(getResources().getString(R.string.T4_End));
                        buttonUp.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);

                    }
                } else{
                    storyTextView.setText(getResources().getString(R.string.T5_End));
                    buttonUp.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }

            }
        });

    }
}
