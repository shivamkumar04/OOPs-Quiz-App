package android.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        val username=intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username

        val totalquestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val  correctanswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tv_score.text="YOUR SCORE IS $correctanswers OUT 0F $totalquestions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }



    }
}