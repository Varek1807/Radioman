package ru.netology.Radioman.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Volume volume = new Volume(100);

        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }


    @Test
    public void testNext() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextElseMax() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevElseMin() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrev() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume() {

        Volume volume = new Volume(100);
        volume.setCurrentVolume(7);
        volume.increaseVolume();
        int expected = 8;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolumeIfMax() {

        Volume volume = new Volume(0, 100);
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRaduceVolume() {
        Volume volume = new Volume(100);
        volume.setCurrentVolume(10);
        volume.reduceVolume();
        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRaduceVolumeIfMin() {
        Volume volume = new Volume(100);
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    // @Test
    //public void testIncreaseVolumeIfMoreMax() {
    //  Volume volume = new Volume(100);
    //volume.setCurrentVolume(101);
    //  volume.increaseVolume();
    //int expected = ;
    //int actual = volume.getCurrentVolume();
    ///Assertions.assertEquals(expected, actual);
    //}
    @Test
    public void test1() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}

