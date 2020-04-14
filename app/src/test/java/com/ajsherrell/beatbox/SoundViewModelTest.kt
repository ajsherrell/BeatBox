package com.ajsherrell.beatbox

import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class SoundViewModelTest {

    //since Sound is a simple data object with no behaviour to break, it is safe to not mock it.
    private lateinit var sound: Sound
    //subject is a convention that indicates that it is the 'object under test'
    private lateinit var subject: SoundViewModel
    //to test its interactions with other classes in isolation, use a mocked BeatBox:
    private lateinit var beatBox: BeatBox

    //build an instance of the object to test and create any other objects that object depends on:
    @Before
    fun setUp() {
        beatBox = mock(BeatBox::class.java) //mocked BeatBox.
        sound = Sound("assetPath")
        subject = SoundViewModel(beatBox)
        subject.sound = sound
    }

    //`is` -> Hamcrest matcher. "assertThat" -> jUnit. This test exposes
    // existing behaviour in SoundViewModel: The
    // title property is connected to the Sound's name property.
    @Test
    fun exposesSoundNameAsTitle() {
        assertThat(subject.title, `is`(sound.name))
    }

    //TDD: shows what is expected of a new function before the actual function is written:
    @Test
    fun callsBeatBoxPlayOnButtonClicked() {
        subject.onButtonClicked()

        //verify that the play function is called as expected.
        verify(beatBox).play(sound)
    }
}