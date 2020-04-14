package com.ajsherrell.beatbox

import android.content.res.AssetManager
import androidx.lifecycle.ViewModel

class BeatBoxViewModel(private val assetManager: AssetManager) : ViewModel() {
//TODO: Challenge to play sound across rotation:
//    BeatBoxViewModel that accepts an AssetManager as a constructor argument.
//    The class then has a public instance of BeatBox. Override the onCleared() method
//    to release the sound pool. BeatBoxViewModelFactory that accepts an AssetManager as a
//    constructor argument. Override the create() method to create an instance of BeatBoxViewModel.
//    Now in MainActivity, create the factory and beatBoxViewModel objects. Anywhere that beatBox
//    was referenced now replace it with beatBoxViewModel.beatBox. We will want to remove the
//    onDestroy() overridden method to not release the sound pool when the activity is destroyed.

}