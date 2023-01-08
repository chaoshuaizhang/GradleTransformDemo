package com.dream.customtransformplugin

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.dream.customtransformplugin.base.BaseCustomTransform
import java.io.InputStream
import java.io.OutputStream

/**
 * function: 自定义 Transform
 */
class MyCustomTransform: Transform() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> {
        TODO("Not yet implemented")
    }

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> {
        TODO("Not yet implemented")
    }

    override fun isIncremental(): Boolean {
        TODO("Not yet implemented")
    }

}