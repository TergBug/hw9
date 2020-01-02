package org.mycode.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Photon photon = new Photon(300000, 0, 0, 1);
        PhotonFactory photonFactory = new PhotonFactory(photon);
        Photon[] photons = new Photon[1000];
        for (int i = 0; i < photons.length; i++) {
            photons[i] = photonFactory.getCloneOfPhoton();
            if(i<20){
                System.out.println(photons[i]);
            }
        }
    }
}
