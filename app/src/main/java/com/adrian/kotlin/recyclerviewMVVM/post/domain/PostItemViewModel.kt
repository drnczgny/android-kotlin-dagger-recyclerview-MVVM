package com.adrian.kotlin.recyclerviewMVVM.post.domain

import android.databinding.Bindable
import com.adrian.kotlin.BR
import com.adrian.kotlin.recyclerviewMVVM.recyclerview.ListItemViewModel

/**
 * Created by cadri on 2017. 07. 26..
 */

class PostItemViewModel(var _id: String, var _title: String) : ListItemViewModel() {

    var id: String
        @Bindable get() = _id
        set(value) {
            _title = value
            notifyPropertyChanged(BR.id)
        }

    var title: String
        @Bindable get() = _title
        set(value) {
            _title = value
            notifyPropertyChanged(BR.title)
        }
}

