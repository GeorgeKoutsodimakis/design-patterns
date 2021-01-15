package com.example.designpatterns

import java.io.File

data class Mail(
    @JvmField val to: String,
    @JvmField val cc: List<String>? = listOf(),
    @JvmField val bcc: List<String>? = listOf(),
    @JvmField var title: String? = "",
    @JvmField var msg: String? = "",
    @JvmField val attachments: List<File>? = listOf()
)