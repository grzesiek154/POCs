package com.SingerDataJpa.service;

import com.SingerDataJpa.entities.SingerAudit;

import java.util.List;

public interface SingerAuditService {

    List<SingerAudit> findAll();
    SingerAudit findById(Long id);
    SingerAudit save(SingerAudit singer);
}
