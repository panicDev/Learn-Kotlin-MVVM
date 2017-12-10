package id.paniclabs.mvvm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import id.paniclabs.mvvm.view.UsersListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.frag_container, UsersListFragment()).commit()
        }
    }
}
