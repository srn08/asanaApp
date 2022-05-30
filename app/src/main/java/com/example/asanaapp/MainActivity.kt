package com.example.asanaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.asana_title)
        val desc = findViewById<TextView>(R.id.body)
        val imgpic1 = findViewById<ImageView>(R.id.imageView)
        val btn1 = findViewById<ImageButton>(R.id.imageButton1)
        btn1.setOnClickListener{
            name.setText("Sirsasana")
            imgpic1.setImageResource(R.drawable.sirs_main)
            desc.setText("Start on all fours facing the wall. Interlace your fingers with your knuckles facing the wall. Place elbows on the floor shoulder-width apart. Place the crown of your head on the floor into the basket created by your interlaced fingers.Tuck your toes under, lift knees off the floor, and reach your hips up and back. Press down into your forearms and lift up through shoulders.Walk your feet in closer as you broaden across the chest. Most of the weight should be concentrated in your forearms.")
        }
        val btn2 = findViewById<ImageButton>(R.id.imageButton2)
        btn2.setOnClickListener{
            name.setText("Kumbhakasana")
            imgpic1.setImageResource(R.drawable.kumb_main)
            desc.setText("Start in Downward-Facing Dog. Shift forward so your shoulders are stacked over your wrists. Draw your navel in toward your spine and keep your hips from dropping. Reach heels back as you lengthen the crown of your head forward. Ground down into hands, pushing the floor away beneath you. Lengthen through the arms and broaden your chest")
        }
        val btn3 = findViewById<ImageButton>(R.id.imageButton3)
        btn3.setOnClickListener{
            name.setText("Paschimottanasana")
            imgpic1.setImageResource(R.drawable.pasch_main)
            desc.setText("Sit and straighten your legs out in front of you, grounding your thighs into the floor. Hinge at the hips to elongate your torso over your thighs. Grab hold of the outer edges of your feet. If your hamstrings are tight, grab a strap and loop it behind your feet. Use the leverage to bring your torso closer to your thighs. You can also sit on the edge of a blanket to help you fold forward.")
        }
        val btn4 = findViewById<ImageButton>(R.id.imageButton4)
        btn4.setOnClickListener{
            name.setText("Dhanurasana")
            imgpic1.setImageResource(R.drawable.dhanu_main)
            desc.setText("Lie on your stomach. Arc your hands backward and hold the feet. Try pulling yourself backward. You can feel the stretch in your arms, stomach and legs. “This asana is effective in weight loss, improves digestion and appetite and boosts blood circulation. It also makes your back flexible,” says Dr Kutteri.")
        }

    }

}