package com.example.myfirstroom.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myfirstroom.repositori.AplikasiSiswa
import com.example.myfirstroom.viewmodel.EntryViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {

        // Initializer untuk HomeViewModel
        initializer {
            _root_ide_package_.com.example.myfirstroom.viewmodel.HomeViewModel(
                RepositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }

        // Initializer untuk EntryViewModel
        initializer {
            EntryViewModel(
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**

 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)