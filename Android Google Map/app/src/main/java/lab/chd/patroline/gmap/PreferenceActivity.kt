package lab.chd.patroline.gmap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

/**
 * @author lucka
 * @since 0.1
 */
class PreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        if (savedInstanceState == null) {
            val preferenceFragment = PreferenceMainFragment()
            supportFragmentManager.beginTransaction().add(R.id.preferenceFrame, preferenceFragment).commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            when (item.itemId) {
                android.R.id.home -> {
                    // Call onBackPress() when tap the back button on the toolbar instead of finish()
                    //   Reference: https://developer.android.com/training/implementing-navigation/ancestral.html
                    onBackPressed()
                    return true
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }


}