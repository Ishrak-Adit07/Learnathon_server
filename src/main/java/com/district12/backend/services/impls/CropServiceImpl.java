package com.district12.backend.services.impls;

import com.district12.backend.dtos.response.CropResponse;
import com.district12.backend.entities.Crop;
import com.district12.backend.repositories.CropRepository;
import com.district12.backend.services.abstractions.CropService;
import jakarta.validation.constraints.Null;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CropServiceImpl implements CropService {

    private final CropRepository cropRepository;

    public List<CropResponse> getAllCrops() {
       return cropRepository.findAllCrops();
    }

}
