package org.mycode.creational.prototype;

public class PhotonFactory {
    private Photon photon;
    public PhotonFactory(Photon photon) {
        this.photon = photon;
    }
    public Photon getCloneOfPhoton(){
        return (Photon)photon.getPrototype();
    }
}
