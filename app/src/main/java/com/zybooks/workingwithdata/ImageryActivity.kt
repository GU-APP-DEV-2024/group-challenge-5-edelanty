package com.zybooks.workingwithdata

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.zybooks.workingwithdata.NasaAPI.ImageData

class ImageryActivity : AppCompatActivity() {
    lateinit var longitude: EditText
    lateinit var latitude: EditText
    lateinit var dimension: EditText
    lateinit var date: EditText
    lateinit var cloudScore: EditText
    lateinit var recyclerView: RecyclerView
    lateinit var imageDataSet: ArrayList<ImageData>
    lateinit var imageCustomAdapter: ImageCustomAdapter
    lateinit var countEditText: EditText
    lateinit var getImageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagery)

        //Setting up to handle input
        val imageLongitude = findViewById<EditText>(R.id.longitudeEditText)
        val imageLatitude = findViewById<EditText>(R.id.latitudeEditText)
        val imageDimension = findViewById<EditText>(R.id.dimensionEditText)
        val imageDate = findViewById<EditText>(R.id.dateEditText)
        val imageCloudScore = findViewById<EditText>(R.id.cloudScoreEditText)
        val getImageButton = findViewById<Button>(R.id.getImageButton)

        val hardCodedInfo = "https://api.nasa.gov/planetary/earth/imagery?lon=$imageLongitude&lat=$imageLatitude&date=$imageDate&api_key=${BuildConfig.NASA_API_KEY}"

        getImageButton.setOnClickListener {
            //TODO do stuff
        }
    }
}