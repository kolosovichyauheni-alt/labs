package org.example;

interface Playable {
    void play();
    void tune();

    static void playLoud() {
        System.out.println("Играю громко " );
    }
}



