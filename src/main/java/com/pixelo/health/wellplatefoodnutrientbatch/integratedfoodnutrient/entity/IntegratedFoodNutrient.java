package com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;


@Table(name = "integrated_food_nutrient", schema = "food_nutrient")
@NoArgsConstructor
@Entity
public class IntegratedFoodNutrient {

    @Id
    @Comment("식품코드")
    private String foodCd;
    @Comment("식품명")
    private String foodNm;
    @Comment("데이터구분코드")
    private String dataCd;
    @Comment("데이터구분명")
    private String typeNm;
    @Comment("영양성분함량기준량")
    private String nutConSrtrQua;
    @Comment("에너지(kcal)")
    private String enerc;
    @Comment("수분(g)")
    private String water;
    @Comment("단백질(g)")
    private String prot;
    @Comment("지방(g)")
    private String fatce;
    @Comment("회분(g)")
    private String ash;
    @Comment("탄수화물(g)")
    private String chocdf;
    @Comment("당류(g)")
    private String sugar;
    @Comment("식이섬유(g)")
    private String fibtg;
    @Comment("칼슘(mg)")
    private String ca;
    @Comment("철(mg)")
    private String fe;
    @Comment("인(mg)")
    private String p;
    @Comment("칼륨(mg)")
    private String k;
    @Comment("나트륨(mg)")
    private String nat;
    @Comment("비타민 A(μg RAE)")
    private String vitaRae;
    @Comment("레티놀(μg)")
    private String retol;
    @Comment("베타카로틴(μg)")
    private String cartb;
    @Comment("티아민(mg)")
    private String thia;
    @Comment("리보플라빈(mg)")
    private String ribf;
    @Comment("니아신(mg)")
    private String nia;
    @Comment("비타민 C(mg)")
    private String vitc;
    @Comment("비타민 D(μg)")
    private String vitd;
    @Comment("콜레스테롤(mg)")
    private String chole;
    @Comment("포화지방산(g)")
    private String fasat;
    @Comment("트랜스지방산(g)")
    private String fatrn;
    @Comment("폐기율(%)")
    private String refuse;
    @Comment("출처코드")
    private String srcCd;
    @Comment("출처명")
    private String srcNm;
    @Comment("식품중량")
    private String foodSize;
    @Comment("수입여부")
    private String imptYn;
    @Comment("원산지국코드")
    private String cooCd;
    @Comment("원산지국명")
    private String cooNm;
    @Comment("품목제조보고번호")
    private String itemMnftrRptNo;
    @Comment("업체명")
    private String companyNm;
    @Comment("제조사명")
    private String mkrNm;
    @Comment("수입업체명")
    private String imptrNm;
    @Comment("유통업체명")
    private String rtlBzentyNm;
    @Comment("데이터생성방법코드")
    private String dataProdCd;
    @Comment("데이터생성방법명")
    private String dataProdNm;
    @Comment("데이터생성일자")
    private String crtYmd;
    @Comment("데이터기준일자")
    private String crtrYmd;

    @Builder
    public IntegratedFoodNutrient(String foodCd,
                                  String foodNm,
                                  String dataCd,
                                  String typeNm,
                                  String nutConSrtrQua,
                                  String enerc,
                                  String water,
                                  String prot,
                                  String fatce,
                                  String ash,
                                  String chocdf,
                                  String sugar,
                                  String fibtg,
                                  String ca,
                                  String fe,
                                  String p,
                                  String k,
                                  String nat,
                                  String vitaRae,
                                  String retol,
                                  String cartb,
                                  String thia,
                                  String ribf,
                                  String nia,
                                  String vitc,
                                  String vitd,
                                  String chole,
                                  String fasat,
                                  String fatrn,
                                  String refuse,
                                  String srcCd,
                                  String srcNm,
                                  String foodSize,
                                  String imptYn,
                                  String cooCd,
                                  String cooNm,
                                  String itemMnftrRptNo,
                                  String companyNm,
                                  String mkrNm,
                                  String imptrNm,
                                  String rtlBzentyNm,
                                  String dataProdCd,
                                  String dataProdNm,
                                  String crtYmd,
                                  String crtrYmd) {
        this.foodCd = foodCd;
        this.foodNm = foodNm;
        this.dataCd = dataCd;
        this.typeNm = typeNm;
        this.nutConSrtrQua = nutConSrtrQua;
        this.enerc = enerc;
        this.water = water;
        this.prot = prot;
        this.fatce = fatce;
        this.ash = ash;
        this.chocdf = chocdf;
        this.sugar = sugar;
        this.fibtg = fibtg;
        this.ca = ca;
        this.fe = fe;
        this.p = p;
        this.k = k;
        this.nat = nat;
        this.vitaRae = vitaRae;
        this.retol = retol;
        this.cartb = cartb;
        this.thia = thia;
        this.ribf = ribf;
        this.nia = nia;
        this.vitc = vitc;
        this.vitd = vitd;
        this.chole = chole;
        this.fasat = fasat;
        this.fatrn = fatrn;
        this.refuse = refuse;
        this.srcCd = srcCd;
        this.srcNm = srcNm;
        this.foodSize = foodSize;
        this.imptYn = imptYn;
        this.cooCd = cooCd;
        this.cooNm = cooNm;
        this.itemMnftrRptNo = itemMnftrRptNo;
        this.companyNm = companyNm;
        this.mkrNm = mkrNm;
        this.imptrNm = imptrNm;
        this.rtlBzentyNm = rtlBzentyNm;
        this.dataProdCd = dataProdCd;
        this.dataProdNm = dataProdNm;
        this.crtYmd = crtYmd;
        this.crtrYmd = crtrYmd;
    }

    public String foodCd() {
        return foodCd;
    }
}
