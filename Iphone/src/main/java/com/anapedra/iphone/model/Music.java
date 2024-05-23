package com.anapedra.iphone.model;

import java.time.LocalTime;
import java.util.Objects;

public class Music {

    private Long id;

    private Ipod ipod;
    private String titulo;
    private String artista;
    private LocalTime time;



    public Music() {
    }

    public Music(Long id, Ipod ipod, String titulo, String artista, LocalTime time) {
        this.id = id;
        this.ipod = ipod;
        this.titulo = titulo;
        this.artista = artista;
        this.time = time;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ipod getIpod() {
        return ipod;
    }

    public void setIpod(Ipod ipod) {
        this.ipod = ipod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music musica = (Music) o;
        return Objects.equals(id, musica.id) && Objects.equals(titulo, musica.titulo) && Objects.equals(artista, musica.artista) && Objects.equals(time, musica.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, artista, time);
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", ipod=" + ipod +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", time=" + time +
                '}';
    }
}
