package lk.ijse.absd.consm.repository;

import lk.ijse.absd.consm.dto.MaterialMasterDTO;
import lk.ijse.absd.consm.entity.MaterialMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Integer> {

    @Query(value = "select M.MATERIAL_ID, M.MAT_ID_CODE, M.MATERIAL_NAME, M.MATERIAL_TYPE, M.MATERIAL_GRADE, M.MATERIAL_UNIT, M.UNIT_PRICE,  M.MAT_DATE, M.MATERIAL_CODE," +
            "M.unit_UNIT_ID, M.mainm_MAIN_ID, M.subm_SUB_ID, M.detailm_DETAIL_ID from materialmaster M inner join unit U on M.unit_UNIT_ID = U.UNIT_ID\n" +
            "inner join mainmaster Ma on M.mainm_MAIN_ID = Ma.MAIN_ID inner join submaster Su on M.subm_SUB_ID = Su.SUB_ID\n" +
            "inner join detailmaster De on M.detailm_Detail_ID = De.DETAIL_ID", nativeQuery = true)
    List<MaterialMasterDTO> findAllMaterials();

    @Query("FROM MaterialMaster WHERE MAT_ID_CODE = ?1")
    MaterialMasterDTO findByFirstName(String id);

//    @Query("FROM Author WHERE firstName = ?1")
//    List<Author> findByFirstName(String firstName, Pageable pageable);
}
