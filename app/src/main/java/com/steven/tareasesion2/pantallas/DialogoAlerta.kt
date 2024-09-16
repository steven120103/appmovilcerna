package com.steven.tareasesion2.pantallas

import android.app.AlertDialog
import android.app.Dialog
import android.widget.AutoCompleteTextView.OnDismissListener
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun ModalDialogoAlerta(
    showDialog: Boolean,
    onDismiss: ()-> Unit
){
    if (showDialog){
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                    Text(text = "Titulo de Modal")
            },
            text = {
                   Text(text = "Cuerpo de Modal")
            },
            confirmButton = {
                TextButton(onClick = onDismiss) {
                    Text(text = "Cerrar")
                }
                }
        )
            }
    }
