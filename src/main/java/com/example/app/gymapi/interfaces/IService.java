package com.example.app.gymapi.interfaces;

import com.example.app.gymapi.abstracts.AbstractDto;
import com.example.app.gymapi.dto.PageResponse;
import org.springframework.data.domain.Page;

public interface IService<T extends AbstractDto> {

    T create(T dto);

    T getById(Long id);

    PageResponse<T> getAll(int page);

    T update(Long id, T dto);

    boolean delete(Long id);

    PageResponse<T> searchByNombre(String nombre, int page);
}

