/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamasmaca;

import java.util.Random;

/**
 *
 * @author ajanuser
 */
public class Oyun{


String[] kelime={"KEMER","ASGARİ","DENEME","AMAÇ"};
String secilenKelime="";
int bulunanharf=0;
int puan=0;
    int secim=0;
int hatasayisi=0;    
    
    public Oyun(){
        Random r = new Random();
	secim=r.nextInt(4) + 0;
        secilenKelime=kelime[secim];
    }
    
    public String KelimeyiGetir(){
    
        return kelime[secim];
    }

    private int getRandomNumberInRange(int min, int max) {
        
        if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	
    }

    void harfara(String harf) {
        for(int i=0;i<kelime.length;i++)
        {
            
        }
    }

    void harfbulundu(int harfara) {
        bulunanharf+=harfara;
    }
    
}
