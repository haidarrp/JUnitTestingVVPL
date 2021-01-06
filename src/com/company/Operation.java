package com.company;

public class Operation {
    public int LuasPersegi (int panjangSisi){return panjangSisi*panjangSisi; }
    public int LuasPersegiPanjang (int panjang, int lebar){
        return panjang*lebar;
    }
    public int VolumeKubus (int sisi) {return sisi*sisi*sisi; }
    public int KelilingPersegiPanjang (int panjang, int lebar) {return (2*panjang)+(2*lebar);}
    public int LuasSegitiga (int alas, int tinggi){return alas*tinggi/2; }

}
