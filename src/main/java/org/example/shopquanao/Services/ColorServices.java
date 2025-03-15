package org.example.shopquanao.Services;

import org.example.shopquanao.Entity.Color;
import org.example.shopquanao.Repository.ColorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServices {
    private final ColorRepository colorRepository;
    public ColorServices(ColorRepository colorRepository) {
         this.colorRepository = colorRepository;
    }

    public List<Color> findAll() {
        return colorRepository.findAll();
    }
}
