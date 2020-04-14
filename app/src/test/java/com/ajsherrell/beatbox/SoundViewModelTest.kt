package com.ajsherrell.beatbox

import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Assert.*
import org.junit.Test

class SoundViewModelTest {

    //since Sound is a simple data object with no behaviour to break, it is safe to not mock it.
    private lateinit var sound: Sound
    //subject is a convention that indicates that it is the 'object under test'
    private lateinit var subject: SoundViewModel

    //build an instance of the object to test and create any other objects that object depends on:
    @Before
    fun setUp() {
        sound = Sound("assetPath")
        subject = SoundViewModel()
        subject.sound = sound
    }

    //`is` -> Hamcrest matcher. "assertThat" -> jUnit. This test exposes
    // existing behaviour in SoundViewModel: The
    // title property is connected to the Sound's name property.
    @Test
    fun exposesSoundNameAsTitle() {
        assertThat(subject.title, `is`(sound.name))
    }
}