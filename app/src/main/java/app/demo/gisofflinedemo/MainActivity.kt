package app.demo.gisofflinedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.demo.gisofflinedemo.databinding.ActivityMainBinding
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.Basemap

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mapView.map = ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16)
    }

    override fun onPause() {
        binding.mapView.pause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        binding.mapView.resume()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.mapView.dispose()
    }

}