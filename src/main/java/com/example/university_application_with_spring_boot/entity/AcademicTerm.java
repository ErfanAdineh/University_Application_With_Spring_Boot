package com.example.university_application_with_spring_boot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "",name = "academic_term")
@Setter
@Getter
public class AcademicTerm extends BaseEntity{
    @Id
    private Long id;


//    @JsonIgnore
//    @Setter(AccessLevel.NONE)
//    @JoinColumn(name = "center_id", insertable = false, updatable = false)
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CenterEntity center;
//    //مرکز
//
//    @NotNull
//    @Column(name = "center_id", nullable = false)
//    private Long centerId;
//    //شناسه مرکز
//
//    @JsonIgnore
//    @Setter(AccessLevel.NONE)
//    @JoinColumn(name = "city_id", insertable = false, updatable = false)
//    @ManyToOne
//    private ChildGroupingEntity city;
//    //شهر
//
//    @NotNull
//    @Column(name = "city_id", nullable = false)
//    private Long cityId;
//    //شناسه شهر
//
//    @Lob
//    @Size(max = 500)
//    @Column(name = "address", nullable = false)
//    private String address;
//    //آدرس
//
//    @JsonIgnore
//    @Setter(AccessLevel.NONE)
//    @JoinColumn(name = "center_address_type_id", insertable = false, updatable = false)
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CodeTypeItemEntity centerAddressType;
//    //نوع آدرس مرکز
//
//    @NotNull
//    @Column(name = "center_address_type_id", nullable = false)
//    private Long centerAddressTypeId;
//    //شناسه نوع آدرس مرکز
//
//    @NotNull
//    @Column(name = "phone", nullable = false)
//    private String phone;
//    //تلفن
//
//    @NotNull
//    @Column(name = "postal_code", nullable = false)
//    private String postalCode;
//    //کد پستی
//
//    @Column(name = "is_main")
//    private Boolean isMain;
//    //اصلی

}
