package com.SingerDataJpa.service;

import com.SingerDataJpa.entities.Album;
import com.SingerDataJpa.entities.Singer;

import java.util.List;

public interface AlbumService {
    List<Album> findBySinger(Singer singer);
    List<Album> findByTitle(String title);
}
