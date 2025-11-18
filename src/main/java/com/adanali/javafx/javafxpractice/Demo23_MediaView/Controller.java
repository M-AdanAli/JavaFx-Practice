package com.adanali.javafx.javafxpractice.Demo23_MediaView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    MediaView mediaView;

    @FXML
    Button playButton, pauseButton, resetButton;

    File file;
    Media media;
    MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            file = new File(getClass().getResource("/com/adanali/javafx/javafxpractice/Cloudfare-bug-insite.mp4").toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
    }

    public void playMedia(){
        mediaPlayer.play();
    }

    public void pauseMedia(){
        mediaPlayer.pause();
    }

    public void resetMedia(){
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY){
            mediaPlayer.seek(Duration.seconds(0.0));
        }
    }
}
