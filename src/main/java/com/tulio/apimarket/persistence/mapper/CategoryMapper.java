package com.tulio.apimarket.persistence.mapper;

import com.tulio.apimarket.domain.Category;
import com.tulio.apimarket.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration //Esta es la conversión inversa de la de toCategory
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
