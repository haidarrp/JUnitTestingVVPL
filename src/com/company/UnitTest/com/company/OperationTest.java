package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {
    public Operation instance = new Operation();
    @Test
    public void LuasPersegiPanjang() {
        int panjang = 20;
        int lebar = 50;
        int expected = 1000;
        int actual = instance.LuasPersegiPanjang(panjang,lebar);
        assertEquals(expected,actual);

    }
    @Test
    public void LuasPersegi(){
        int panjangSisi = 20;
        int expected = 400;
        int actual = instance.LuasPersegi(panjangSisi);
        assertEquals(expected,actual);

    }
    @Test
    public void VolumePersegi(){
        int sisi = 5;
        int expected = 125;
        int actual = instance.VolumeKubus(sisi);
        assertEquals(expected,actual);
    }
    @Test
    public void KelilingPersegiPanjang(){
        int panjang = 10;
        int lebar =30;
        int expected = 80;
        int actual = instance.KelilingPersegiPanjang(panjang,lebar);
        assertEquals(expected,actual);
    }
    @Test
    public void segitiga(){
        int alas =10;
        int tinggi = 20;
        int expected = 100;
        int actual = instance.LuasSegitiga(alas,tinggi);
        assertEquals(expected,actual);
    }
}