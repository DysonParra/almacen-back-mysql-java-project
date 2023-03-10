/*
 * @fileoverview    {RemisionesVentaMaterialesMapping} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.service.mapping;

import com.project.dev.api.domain.RemisionesVentaMateriales;
import com.project.dev.api.dto.RemisionesVentaMaterialesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Definición de {@code RemisionesVentaMaterialesMapping}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RemisionesVentaMaterialesMapping extends GenericMapping<RemisionesVentaMaterialesDTO, RemisionesVentaMateriales> {

    /**
     * Obtiene una entidad en base a su DTO.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    // Deben ser el campo clave de la base de datos.
    @Mapping(source = "intIdRemisionVentaMaterial", target = "intIdRemisionVentaMaterial")
    @Override
    public RemisionesVentaMateriales getEntity(RemisionesVentaMaterialesDTO dto);

    /**
     * Obtiene un DTO en base a su entidad.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    // Deben ser el campo clave de la base de datos.
    @Mapping(source = "intIdRemisionVentaMaterial", target = "intIdRemisionVentaMaterial")
    @Override
    public RemisionesVentaMaterialesDTO getDto(RemisionesVentaMateriales entity);

    /**
     * TODO: Definición de {@code withId}.
     *
     * @param strId
     * @return
     */
    public default RemisionesVentaMateriales withId(String strId) {
        if (strId == null) {
            return null;
        }
        RemisionesVentaMateriales entity = new RemisionesVentaMateriales();
        entity.setIntIdRemisionVentaMaterial(Long.parseLong(strId));
        return entity;
    }
}
