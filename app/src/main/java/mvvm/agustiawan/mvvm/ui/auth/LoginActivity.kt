package mvvm.agustiawan.mvvm.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.nafanesia.mvvm.R
import mvvm.agustiawan.mvvm.data.db.entities.User
import com.nafanesia.mvvm.databinding.ActivityLoginBinding
import mvvm.agustiawan.mvvm.util.hide
import mvvm.agustiawan.mvvm.util.show
import mvvm.agustiawan.mvvm.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this

    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user : User) {
        progress_bar.hide()
        toast("${user.name} is Logged in")
    }

    override fun onFailure(message: String) {
        toast(message)
        progress_bar.hide()
    }

}
