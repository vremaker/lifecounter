package edu.washington.vremaker.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** Setting findViews for Lives */
        var p1Life = findViewById<TextView>(R.id.p1Life)
        var p2Life = findViewById<TextView>(R.id.p2Life)
        var p3Life = findViewById<TextView>(R.id.p3Life)
        var p4Life = findViewById<TextView>(R.id.p4Life)

        /** Setting up all of the gosh darn buttons */
        // -1
        val p1min1 = findViewById<Button>(R.id.p1min1)
        p1min1.setOnClickListener() {
            var changed = changeLives(p1Life.text.toString().toInt(), "min1", 1)
            p1Life.text = changed
        }
        val p2min1 = findViewById<Button>(R.id.p2min1)
        p2min1.setOnClickListener() {
            var changed = changeLives(p2Life.text.toString().toInt(), "min1", 2)
            p2Life.text = changed
        }
        val p3min1 = findViewById<Button>(R.id.p3min1)
        p3min1.setOnClickListener() {
            var changed = changeLives( p3Life.text.toString().toInt(), "min1", 3)
            p3Life.text = changed
        }
        val p4min1 = findViewById<Button>(R.id.p4min1)
        p4min1.setOnClickListener() {
            var changed = changeLives( p4Life.text.toString().toInt(), "min1", 4)
            p4Life.text = changed
        }

        // -5
        val p1min5 = findViewById<Button>(R.id.p1min5)
        p1min5.setOnClickListener() {
            var changed = changeLives(p1Life.text.toString().toInt(), "min5", 1)
            p1Life.text = changed
        }
        val p2min5 = findViewById<Button>(R.id.p2min5)
        p2min5.setOnClickListener() {
            var changed = changeLives(p2Life.text.toString().toInt(), "min5", 2)
            p2Life.text = changed
        }
        val p3min5 = findViewById<Button>(R.id.p3min5)
        p3min5.setOnClickListener() {
            var changed = changeLives( p3Life.text.toString().toInt(), "min5", 3)
            p3Life.text = changed
        }
        val p4min5 = findViewById<Button>(R.id.p4min5)
        p4min5.setOnClickListener() {
            var changed = changeLives( p4Life.text.toString().toInt(), "min5", 4)
            p4Life.text = changed
        }

        // +1
        val p1add1 = findViewById<Button>(R.id.p1add1)
        p1add1.setOnClickListener() {
            var changed = changeLives(p1Life.text.toString().toInt(), "add1", 1)
            p1Life.text = changed
        }
        val p2add1 = findViewById<Button>(R.id.p2add1)
        p2add1.setOnClickListener() {
            var changed = changeLives(p2Life.text.toString().toInt(), "add1", 2)
            p2Life.text = changed
        }
        val p3add1 = findViewById<Button>(R.id.p3add1)
        p3add1.setOnClickListener() {
            var changed = changeLives( p3Life.text.toString().toInt(), "add1", 3)
            p3Life.text = changed
        }
        val p4add1 = findViewById<Button>(R.id.p4add1)
        p4add1.setOnClickListener() {
            var changed = changeLives( p4Life.text.toString().toInt(), "add1", 4)
            p4Life.text = changed
        }

        // +5
        val p1add5 = findViewById<Button>(R.id.p1add5)
        p1add5.setOnClickListener() {
            var changed = changeLives(p1Life.text.toString().toInt(), "add5", 1)
            p1Life.text = changed
        }
        val p2add5 = findViewById<Button>(R.id.p2add5)
        p2add5.setOnClickListener() {
            var changed = changeLives(p2Life.text.toString().toInt(), "add5", 2)
            p2Life.text = changed
        }
        val p3add5 = findViewById<Button>(R.id.p3add5)
        p3add5.setOnClickListener() {
            var changed = changeLives( p3Life.text.toString().toInt(), "add5", 3)
            p3Life.text = changed
        }
       val p4add5 = findViewById<Button>(R.id.p4add5)
        p4add5.setOnClickListener() {
            var changed = changeLives( p4Life.text.toString().toInt(), "add5", 4)
            p4Life.text = changed
        }
    }

    private fun changeLives(start: Int, move: String, player: Int) : String {
        var returnable = start
        if (move === "min1") {
            returnable -= 1
        } else if (move === "min5") {
            returnable -= 5
        } else if(move === "add1") {
            returnable += 1
        } else {
            returnable += 5
        }

        if(returnable <= 0) {
            returnable = 0
            var loser = "Player " + player + " LOSES!"
            var loseMsg = findViewById<TextView>(R.id.finalLabel)
            loseMsg.text = loser
        }
        return returnable.toString()
    }
}