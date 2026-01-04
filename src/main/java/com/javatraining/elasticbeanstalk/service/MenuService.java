package com.javatraining.elasticbeanstalk.service;

import com.javatraining.elasticbeanstalk.dto.MenuDTO;
import com.javatraining.elasticbeanstalk.entity.Menu;
import com.javatraining.elasticbeanstalk.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final ModelMapper modelMapper;

    public MenuDTO findByMenuCode(int menuCode) {

        Menu foundMenu = repository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(foundMenu, MenuDTO.class);
    }
}
