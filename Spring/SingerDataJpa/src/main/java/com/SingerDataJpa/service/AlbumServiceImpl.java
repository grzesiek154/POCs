package com.SingerDataJpa.service;

import com.SingerDataJpa.entities.Album;
import com.SingerDataJpa.entities.Singer;
import com.SingerDataJpa.repo.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("springJpaAlbumService")
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Album> findBySinger(Singer singer) {
        return albumRepository.findBySinger(singer);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Album> findByTitle(String title) {
        return albumRepository.findByTitle(title);
    }
}
