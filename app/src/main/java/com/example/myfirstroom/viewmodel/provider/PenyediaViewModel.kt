package com.example.myfirstroom.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myfirstroom.repositori.AplikasiSiswa
import com.example.myfirstroom.viewmodel.DetailViewModel
import com.example.myfirstroom.viewmodel.EditViewModel
import com.example.myfirstroom.viewmodel.EntryViewModel
import com.example.myfirstroom.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        //edit : tambah initializer untuk DetailViewModel dan EditViewModel
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            EntryViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan
 * sebuah instance dari [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)