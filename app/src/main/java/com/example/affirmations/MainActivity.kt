package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*This creates a list with various  work affirmations*/

        val workAffirmations = arrayOf(
            "I’m doing a really good job today",
            "I’m capable of overcoming any hurdles that come at me",
            "I am excellent at my job",
            "I’ve got this",
            "I am successful in everything I do",
            "I am a valuable asset to my company",
            "I’m attracting new opportunities",
            "The universe has my back",
            "My emotions regarding work situation are valid",
            "I further my career every day",
            "I’m one step closer to my dream job with every action I take"
        )

        /*This creates a list with various relationship affirmations*/

        val relationshipAffirmations = arrayOf(
            "My love for my partner grows stronger each passing day",
            "My partner and I accept each other’s strengths and weaknesses",
            "My partner and I give our relationship the time and attention it deserves",
            "My partner and I look forward to some quality time together",
            "I love spending intimate moments with my partner",
            "I am happy and content with the relationship I have with my partner",
            "I feel grateful for all the things that my partner does for me",
            "My partner accepts my flaws and helps me to become a better version of myself",
            "My partner and I feel comfortable sharing our thoughts and problems with each other."
        )
        /*This creates a list with daily advices*/

        val dailyAdvices = arrayOf(
            "Take time to know yourself",
            "A narrow focus brings big results",
            "Show up fully",
            "Don't make assumptions",
            "Be patient and persistent",
            "Luck comes from hard work",
            "Be your best at all times",
            "Don't try to impress everyone",
            "Don't be afraid of being afraid",
            "Listen to learn",
            " Life's good, but it's not fair",
            "No task is beneath you",
            "You can't always get what you want",
            "Don't make decisions when you are angry or ecstatic",
            "Learn something new every day",
            "Make what is valuable important",
            "Believe in yourself",
            "Dreams remain dreams until you take action"
        )

        /* Gives functionality to the first button and takes a random affirmation from the work affirmations list. */

        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<TextView>(R.id.affirmationDisplay).text = workAffirmations[(0..10).random()]

            /* Takes an image from the drawable folder and displays it into the app when button 1 is clicked. */
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.work)
        }
        /* Gives functionality to the second button and takes a random affirmation from the relationship affirmations list. */

        findViewById<Button>(R.id.button2).setOnClickListener{
            findViewById<TextView>(R.id.affirmationDisplay).text = relationshipAffirmations[(0..8).random()]

            /* Takes an image from the drawable folder and displays it into the app when button 2 is clicked. */
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.love)

        }
        /* Gives functionality to the third button and takes a random affirmation from the daily advice list. */

        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<TextView>(R.id.affirmationDisplay).text = dailyAdvices[(0..16).random()]

            /* Takes an image from the drawable folder and displays it into the app when button 3 is clicked. */
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.advice)

        }
    }
}